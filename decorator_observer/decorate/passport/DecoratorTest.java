package decorate.passport;


import decorate.passport.old.SigninService;
import decorate.passport.upgrade.ISiginForThirdService;
import decorate.passport.upgrade.SiginForThirdService;

import java.io.BufferedReader;

/**
 * Created by Tom on 2019/3/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
