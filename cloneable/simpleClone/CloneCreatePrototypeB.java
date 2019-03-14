package cloneable.simpleClone;

/**
 * Created By Rick 2019/3/14
 */
public class CloneCreatePrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return new CloneCreatePrototypeB();
    }
}
