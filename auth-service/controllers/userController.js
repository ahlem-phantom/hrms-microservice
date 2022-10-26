const userModel = require ("../models/user");
const bcrypt = require("bcrypt")
const jwt = require("jsonwebtoken")
const SECRET_KEY= "NOTESAPI";

const signup =async (req,res)=>{

    const {username,email,password,isAdmin}= req.body;
    try {

        const existingUser = await userModel.findOne({email : email})
         if(existingUser){
            return res.status(400).json({message: "User already exist"});
         }

        const hashedPassword = await bcrypt.hash(password, 10);
        const result = await userModel.create({
            email: email,
            password : hashedPassword,
            username: username,
            isAdmin:isAdmin
        });

        const token = jwt.sign({isAdmin: result.isAdmin, id : result._id},SECRET_KEY,{ algorithm: 'HS256' })
        res.status(201).json({user:result, token :token});

    } catch (error) {
        console.log(error);
        res.status(500).json({message: "Something went wrong"});
    }


}
const signin = async  (req,res)=>{
     const{email,password}= req.body;

     try {

        const existingUser = await userModel.findOne({email : email})
         if(!existingUser){
            return res.status(404).json({message: "User not found for login"});
         }

      const matchPassword = await bcrypt.compare(password, existingUser.password);
       if(!matchPassword){
        return res.status(400).son({message:"invalid Credentials"});
      }

      const token= jwt.sign({isAdmin : existingUser.isAdmin,
                            id: existingUser._id},SECRET_KEY,{ algorithm: 'HS256' ,expiresIn: '365d'});
        res.status(201).json({user:existingUser, token :token});


    } catch (error) {
        console.log(error);
        res.status(500).json({message: "Something went wrong when signin"});
    }
}

module.exports = { signup , signin};