package decorate.passport.upgrade;


import adapter.loginadapter.ResultMsg;
import decorate.passport.old.ISigninService;

/**
 * Created by Tom on 2019/3/17.
 */
public class SiginForThirdService implements ISiginForThirdService {

    private ISigninService signinService;

    public SiginForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    public decorate.passport.old.ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    public decorate.passport.old.ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }


    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
