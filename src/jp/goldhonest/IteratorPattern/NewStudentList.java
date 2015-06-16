package jp.goldhonest.IteratorPattern;

import java.util.Vector;

/**
 * Created by 1256670 on 2015/06/12.
 */
public class NewStudentList {
    protected Vector<Student> students;

    public void add(Student student) {
        students.add(student);
    }
    public Student getStudentAd(int index) {
        return students.get(index);
    }
}
