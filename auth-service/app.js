var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var mongoose = require("mongoose");
const cors = require("cors");
const dotenv = require("dotenv");
const eurekaHelper = require('./eureka/eureka.helper');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');
dotenv.config();
 
app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
 
app.use('/welcome', indexRouter);
app.use('/', usersRouter);

app.get("/", (req,res)=>{
  res.send(" i m  inside docker");
});
eurekaHelper.registerWithEureka('user-service', 3000);

app.use((req,res,next)=>{
  console.log("HTTP METHOD -"+ req.method+ ",URL -"+req.url);
  next();
})

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});
const uri = process.env.MONGODB_URL;
mongoose.connect(uri, { 
  useNewUrlParser: true,  
  useUnifiedTopology: true, 
  
     } 
); 
 
module.exports = app;
