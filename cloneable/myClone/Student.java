package cloneable.myClone;

import java.io.*;
import java.util.Date;

/**
 * Created By Rick 2019/3/14
 */
public class Student implements Cloneable, Serializable {
    String name;
    int age;

    public Student() { }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //浅克隆
    public Student shallowClone(Student student){
        Student s = new Student();
        s.age = student.age;
        s.name = student.name;
        return s;
    }
    //深克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student student = (Student)ois.readObject();
            return student;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        //测试浅克隆
        Student student = new Student("rick",18);
        Student student1 = student.shallowClone(student);
        System.out.println(student.name == student1.name);
        System.out.println("student name:"+student.getName() +"=== student1 name:"+ student1.getName());
        System.out.println("student age:"+student.getAge() +"=== student1 age:"+ student1.getAge());

        //测试深克隆
        Student stud = new Student("rick",18);
        try {
            Student stud1 = (Student) student.clone();
            System.out.println(stud.name == stud1.name);
            System.out.println("stud name:"+stud.getName() +"=== stud1 name:"+ stud1.getName());
            System.out.println("stud age:"+stud.getAge() +"=== stud1 age:"+ stud1.getAge());
        }catch (Exception e){
            e.printStackTrace();
        }
        /*后台结果
        false
        stud name:rick=== stud1 name:rick
        stud age:18=== stud1 age:18
        结果中false可以看出生成的引用地址不一样，由些说明生成一个新的对象改变原有的引用地址
         */
    }




}
