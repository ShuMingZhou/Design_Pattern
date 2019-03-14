package cloneable.simpleClone;

/**
 * Created By Rick 2019/3/14
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }
    public Prototype startClone(Prototype cloneCreatePrototype){
        return (Prototype)cloneCreatePrototype.clone();
    }
}
