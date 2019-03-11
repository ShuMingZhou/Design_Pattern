package methodFactory;

/**
 * 2019/3/7
 */
public class PythonBookFactory implements BookFactory {

    @Override
    public Book crateBook() {
        return new PythonBook();
    }
}
