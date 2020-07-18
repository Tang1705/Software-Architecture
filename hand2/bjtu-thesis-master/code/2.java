if(database.queryRegister(database.getCon(),q1,q2,q3,up)==Constants.RegisterSucceed)
    mark = true;

if(database.queryChangePw(database.getCon(),q,up)==Constants.ChangePasswordSucceed)
    mark = true;

if(database.queryForgetPw(database.getCon(),q,up)==Constants.ForgetPasswordSucceed)
    mark = true;

if(database.queryLogin(database.getCon(),q)==Constants.LoginSucceed)
    mark = true;