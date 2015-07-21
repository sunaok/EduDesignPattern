package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class Yumichan {
    /** 通常のゆみちゃんの状態を表す **/
    private static final int STATE_ORDINARY = 0;
    /**　機嫌が悪いゆみちゃんの状態を表す**/
    private static final int STATE_IN_BAD_MOOD = 1;
    /**　ゆみちゃんの状態を表すプロパティ　**/
    private int state = -1;

    /**
     * ゆみちゃんの状態を変更するメソッド
     *
     * @param state
     **/
    public void changeState(int state) {
        this.state = state;
    }

    /**
     * 朝のあいさつを返すメソッド
     * @return String
     * **/
    public String morningGreet() {
        if (state == STATE_ORDINARY) {
            return "おっす！";
        } else if (state == STATE_IN_BAD_MOOD) {
            return "おお";
        } else {
            return "・・・";
        }
    }

    /**
     * 寒いときの防寒具を取得するメソッド
     * @return String
     * **/

    public String getProtectionForCold() {
        if (state == STATE_ORDINARY) {
            return "走る";
        }else if (state == STATE_IN_BAD_MOOD) {
            return "ももひきをはく";
        } else {
            return "・・・";
        }
    }


}
