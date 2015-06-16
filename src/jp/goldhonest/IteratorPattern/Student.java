package jp.goldhonest.IteratorPattern;

/**
 * Created by 1256670 on 2015/06/12.
 * Iterator Pattern
 */
public class Student {
    private String name;
    private int sex; // ’j:1,—:2


    public Student(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }
}

