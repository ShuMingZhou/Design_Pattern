package singleton.enumSingleton;

/**
 * Created By Rick 2019/3/13
 */
//注册式单例模式又叫枚举式单例模式
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
