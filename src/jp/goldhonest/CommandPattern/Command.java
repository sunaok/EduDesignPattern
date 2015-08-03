package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public abstract class Command {
    //ビーカー
    protected Beaker beaker;

    public void setBeaker(Beaker beaker) {
        this.beaker = beaker;
    }
    //要求内容を実行する抽象メソッド
    public abstract void execute();

}
