package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class StatePatternYumichan {
    /**
     * ゆみちゃんの状態を表すプロパティ
     **/
    private State state = null;

    /**
     * ゆみちゃんの状態をへんこうするメソッド
     *
     * @param state
     **/
    public void changeState(State state) {
        this.state = state;
    }

    /**
     * 朝の挨拶を返すメソッド
     * @return String
     *
     * **/
    public String morningGreet() {
        return this.state.morningGreet();
    }

    /**
     * 寒いときの対策を取得するメソッド
     *
     * @return String
     **/
    public String getProtectionForCold() {
        return this.state.getProtectionForCold();
    }
}
