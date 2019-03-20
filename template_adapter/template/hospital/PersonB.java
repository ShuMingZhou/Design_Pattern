package template.hospital;

/**
 * Created By Rick 2019/3/20
 */
public class PersonB implements Hospital {
    private boolean b = false;

    public PersonB(boolean b) {
        this.b = b;
    }

    @Override
    public boolean checkPrescribin() {
        return b;
    }

    @Override
    public void goHome() {
        System.out.println("回家");
    }

    @Override
    public void prescribingrugs() {
        System.out.println("开药");
    }

    @Override
    public void seeDoctor() {
        System.out.println("看医生，问诊");
    }

    @Override
    public void makeRegister() {
        System.out.println("挂号");
    }
}
