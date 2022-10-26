const mongoose = require('mongoose')

const userSchema = new mongoose.Schema({

    username: {
        type: String,
        required: true,
    },
    email: {
        type: String,
        unique: true
    },
    password: {
        type: String,
        required: true
    },
    isAdmin: {
        type: Number,
        default:0
    },
});

module.exports = mongoose.model('user', userSchema)
