package template.hospital;

/**
 * Created By Rick 2019/3/20
 */
public class HospitalTest {
    public static void main(String[] args) {
        Hospital h = new PersonA(false);
        h.execute();

        Hospital b = new PersonB(true);
        b.execute();
    }

}
