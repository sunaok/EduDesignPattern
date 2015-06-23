package jp.goldhonest.Visitor;

/**
 * Created by 1256670 on 2015/06/23.
 */
public class SuzukiHome extends Home implements TeacherAcceptor{
    @Override
    public Object praiseChild() {
        System.out.println("æ¶‚¤‚Ü‚¢‚Å‚·‚Ë");
        return new Tea();
    }

    @Override
    public Object reprevedChild() {
        System.out.println("‚²ç’k‚ğ");
        return new Tea();
    }

    @Override
    public void accept(Teacher teacher) {
        teacher.visit(this);

    }
}
