package jp.goldhonest.SingletonPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();

    //Constructor���Aprivate�ɂ��邱�Ƃɂ���āA�ugetInstance�v�ł����A�C���X�^���X���ł��Ȃ��悤�ɂ��Ă���
    private RegisterNote() {
        super();
    }
    public static RegisterNote getInstance(){
        return registerNote;
    }
}
