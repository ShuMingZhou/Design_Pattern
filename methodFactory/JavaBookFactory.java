package methodFactory;

/**
 * 2019/3/7
 */
public class JavaBookFactory implements BookFactory {

    @Override
    public Book crateBook() {
        return new JavaBook();
    }
}
