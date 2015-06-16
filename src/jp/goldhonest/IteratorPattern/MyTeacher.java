package jp.goldhonest.IteratorPattern;

import java.util.Iterator;

/**
 * Created by 1256670 on 2015/06/12.
 */
abstract class Teacher {
    protected MyStudentList studentList;
    public abstract void createStudentList();
    public abstract void callStudents();

}

public class MyTeacher extends Teacher {

    @Override
    public void createStudentList(){
        studentList = new MyStudentList(5);
        studentList.add(new Student("Ryota Akai",1));
        studentList.add(new Student("Satomi Akabane",2));
        studentList.add(new Student("Mio Okada",2));
        studentList.add(new Student("Shunsuke Nishimori",1));
        studentList.add(new Student("Reina Nakanomori",2));
    }

    @Override
    public void callStudents() {
        Iterator it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(((Student) it.next()).getName());
        }
//        int size = studentList.getLastNum();
//        for (int i = 0; i < size; i++) {
//            System.out.println(studentList.getStudentAt(i).getName());
//        }
    }
}
