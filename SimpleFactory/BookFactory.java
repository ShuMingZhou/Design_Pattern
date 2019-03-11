package SimpleFactory;

/**
 * 2019/3/7
 */
public class BookFactory {

    public Book createBook(String name){
        if(name.equals("JavaBook")){
            return new JavaBook();
        }else if(name.equals("PythonBook")){
            return new PythonBook();
        }else{
            return null;
        }
    }
}
