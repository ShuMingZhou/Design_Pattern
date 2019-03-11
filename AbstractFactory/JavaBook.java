package AbstractFactory;

/**
 * 2019/3/7
 */
public class JavaBook implements Book {

    @Override
    public void makeBook() {
        System.out.println("创建JAVABOOK");
    }
}
