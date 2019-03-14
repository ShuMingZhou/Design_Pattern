package cloneable.deepClone;

import java.io.Serializable;

/**
 * Created By Rick 2019/3/14
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *= 2;
        this.h *= 2;
    }
    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
