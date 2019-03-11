package AbstractFactory;

/**
 * 2019/3/7
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaBookFactory j = new JavaBookFactory();
        j.createBookFactory().makeBook();
        j.createPaintBook().makePaintBook();

        PythonBookFactory p = new PythonBookFactory();
        p.createBookFactory().makeBook();
        p.createPaintBook().makePaintBook();
    }
}
