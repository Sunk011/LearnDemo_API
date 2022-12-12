package OperatedStream;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
//    private int age;
    private transient int age;
    private static final long serialVersionUID = 42L;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Student{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", age=").append(age);
//        sb.append('}');
//        return sb.toString();
//    }
}
