package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class Yumichan {
    /** �ʏ�̂�݂����̏�Ԃ�\�� **/
    private static final int STATE_ORDINARY = 0;
    /**�@�@����������݂����̏�Ԃ�\��**/
    private static final int STATE_IN_BAD_MOOD = 1;
    /**�@��݂����̏�Ԃ�\���v���p�e�B�@**/
    private int state = -1;

    /**
     * ��݂����̏�Ԃ�ύX���郁�\�b�h
     *
     * @param state
     **/
    public void changeState(int state) {
        this.state = state;
    }

    /**
     * ���̂�������Ԃ����\�b�h
     * @return String
     * **/
    public String morningGreet() {
        if (state == STATE_ORDINARY) {
            return "�������I";
        } else if (state == STATE_IN_BAD_MOOD) {
            return "����";
        } else {
            return "�E�E�E";
        }
    }

    /**
     * �����Ƃ��̖h������擾���郁�\�b�h
     * @return String
     * **/

    public String getProtectionForCold() {
        if (state == STATE_ORDINARY) {
            return "����";
        }else if (state == STATE_IN_BAD_MOOD) {
            return "�����Ђ����͂�";
        } else {
            return "�E�E�E";
        }
    }


}
