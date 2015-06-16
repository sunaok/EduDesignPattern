package jp.goldhonest.IteratorPattern;

import java.util.Iterator;

/**
 * Created by 1256670 on 2015/06/12.
 */
public class MyStudentList extends StudentList implements Aggregate {
    public MyStudentList() {
        super();
    }
    public MyStudentList(int studentCount){
        super(studentCount);
    }
    @Override
    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }
}
