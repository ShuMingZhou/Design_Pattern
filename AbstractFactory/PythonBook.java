package AbstractFactory;

/**
 * 2019/3/7
 */
public class PythonBook implements Book {
    @Override
    public void makeBook() {
        System.out.println("创建PYTHONBOOK");
    }
}
