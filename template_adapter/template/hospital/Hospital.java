package template.hospital;

/**
 * Created By Rick 2019/3/20
 */
public interface Hospital {

    //jdk1.8中接口特性，此方法需要default关键字修饰
    default void execute( ){
        //挂号
        makeRegister();
        //看医生
        seeDoctor();

        if(checkPrescribin()){
            //开药
            prescribingrugs();
        }

        //回家
        goHome();

    }

    boolean checkPrescribin();

    void goHome();

    void prescribingrugs();

    void seeDoctor();

    void makeRegister();

}
