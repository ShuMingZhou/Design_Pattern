package methodFactory;

/**
 * 2019/3/7
 */
public class BoobFactoryMethodTest {

    public static void main(String[] args) {
        BookFactory factory= new JavaBookFactory();
        Book b = factory.crateBook();
        b.makeBook();

        factory = new PythonBookFactory();
        Book book = factory.crateBook();
        book.makeBook();
    }

}
