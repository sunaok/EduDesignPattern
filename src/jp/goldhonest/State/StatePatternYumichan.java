package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class StatePatternYumichan {
    /**
     * ��݂����̏�Ԃ�\���v���p�e�B
     **/
    private State state = null;

    /**
     * ��݂����̏�Ԃ��ւ񂱂����郁�\�b�h
     *
     * @param state
     **/
    public void changeState(State state) {
        this.state = state;
    }

    /**
     * ���̈��A��Ԃ����\�b�h
     * @return String
     *
     * **/
    public String morningGreet() {
        return this.state.morningGreet();
    }

    /**
     * �����Ƃ��̑΍���擾���郁�\�b�h
     *
     * @return String
     **/
    public String getProtectionForCold() {
        return this.state.getProtectionForCold();
    }
}
