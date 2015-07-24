package jp.goldhonest.ProxyPattern;

import jp.goldhonest.Visitor.TeacherAcceptor;

import java.util.Calendar;

/**
 * Created by 1256670 on 2015/07/24.
 * 代理オブジェクト
 */
public class Fujiwara implements Teacher {
    private Teacher yamada = new Yamada();
    @Override
    public void question1() {
        System.out.println("That's [ Answer 1].");
    }

    @Override
    public void question2() {
        System.out.println("That's [ Answer 2].");
    }

    @Override
    public void question3() {
        Calendar now = Calendar.getInstance();
        if (Calendar.AM == now.get(Calendar.AM_PM)) {
            //午前中は山田先生に聞く
            System.out.println("The answer is ...");
            yamada.question3();
            System.out.println("Are you oK?");
        } else {
            System.out.println("I'll answer it tomorrow.");
        }
    }
}
