package jp.goldhonest.SingletonPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();

    //Constructorが、privateにすることによって、「getInstance」でしか、インスタンス化できないようにしている
    private RegisterNote() {
        super();
    }
    public static RegisterNote getInstance(){
        return registerNote;
    }
}
