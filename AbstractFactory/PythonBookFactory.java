package AbstractFactory;

/**
 * 2019/3/7
 */
public class PythonBookFactory implements BookFactory {
    @Override
    public Book createBookFactory() {
        return new PythonBook();
    }

    @Override
    public IPaintBook createPaintBook() {
        return new PythonPaintBook();
    }
}
