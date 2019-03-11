package SimpleFactory;

/**
 * 2019/3/7
 */
public class SimpleFactoryBookTest {

    public static void main(String[] args) {
        BookFactory book = new BookFactory();
        Book b = book.createBook("PythonBook");
        b.makeBood();
    }

}
