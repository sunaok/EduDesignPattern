package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public abstract class Command {
    //�r�[�J�[
    protected Beaker beaker;

    public void setBeaker(Beaker beaker) {
        this.beaker = beaker;
    }
    //�v�����e�����s���钊�ۃ��\�b�h
    public abstract void execute();

}
