package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class BadMoodState implements State {

    @Override
    public String morningGreet() {
        return "Wow";
    }

    @Override
    public String getProtectionForCold() {
        return "Momohiki";
    }
}
