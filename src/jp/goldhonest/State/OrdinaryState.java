package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class OrdinaryState implements State {
    @Override
    public String morningGreet() {
        return "Hello";
    }

    @Override
    public String getProtectionForCold() {
        return "Run";
    }
}
