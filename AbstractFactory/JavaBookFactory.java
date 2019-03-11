package AbstractFactory;

/**
 * 2019/3/7
 */
public class JavaBookFactory implements BookFactory {
    @Override
    public Book createBookFactory() {
        return new JavaBook();
    }

    @Override
    public IPaintBook createPaintBook() {
        return new JavaPaintBook();
    }
}
