var express = require('express');
const { signup, signin } = require('../controllers/userController');
var router = express.Router();



router.post('/trotti/auth/signup', signup);

router.post('/trotti/auth/signin', signin);

module.exports = router;
