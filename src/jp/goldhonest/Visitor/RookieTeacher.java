package jp.goldhonest.Visitor;

import java.util.List;

/**
 * Created by 1256670 on 2015/06/23.
 */
public class RookieTeacher extends Teacher {
    List students = null;

    public RookieTeacher(List students) {
        this.students = students;
    }

    public void visit(Home studentHome) {
        System.out.println("Hello!!!!");
    }
    @Override
    public void visit(SuzukiHome studentHone) {
        studentHone.reprevedChild();
    }

}
