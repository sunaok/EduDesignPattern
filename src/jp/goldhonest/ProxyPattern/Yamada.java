package jp.goldhonest.ProxyPattern;

/**
 * Created by 1256670 on 2015/07/24.
 */
public class Yamada implements Teacher {

    @Override
    public void question1() {
        System.out.print("---Answer1---");
    }

    @Override
    public void question2() {
        System.out.print("---Answer2---");

    }

    @Override
    public void question3() {
        System.out.println("---Answer3---");
    }
}
