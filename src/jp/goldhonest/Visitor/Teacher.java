package jp.goldhonest.Visitor;
import java.util.List;

/**
 * Created by sunao on 2015/06/16.
 */
public abstract class Teacher {
    List students=null;
    public abstract void visit(Home studentHome);
    public abstract void visit(SuzukiHome studentHone);
    public List getStudentList() {
        return students;
    }
}
