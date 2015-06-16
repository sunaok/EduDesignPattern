package jp.goldhonest.IteratorPattern;

import java.util.Iterator;

/**
 * Created by 1256670 on 2015/06/12.
 */
public class MyStudentListIterator implements Iterator {

    private MyStudentList myStudentList;
    private int index;
    public MyStudentListIterator(MyStudentList myStudentList) {
        this.myStudentList = myStudentList;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (myStudentList.getLastNum() > index) {
            return true;
        } else {
            return false;
    }
}

    @Override
    public Object next() {
//        return null;
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
