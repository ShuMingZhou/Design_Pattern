package cloneable.simpleClone;

import java.util.List;

/**
 * Created By Rick 2019/3/14
 */
public class CloneCreatePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }


    @Override
    public Prototype clone() {
        CloneCreatePrototypeA cloneCreatePrototype = new CloneCreatePrototypeA();
        cloneCreatePrototype.setAge(this.age);
        cloneCreatePrototype.setName(this.name);
        cloneCreatePrototype.setHobbies(this.hobbies);
        return cloneCreatePrototype;
    }
}
