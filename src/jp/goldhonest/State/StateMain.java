package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 */
public class StateMain {
    public static void main(String args[]) {
        StatePatternYumichan spYumichan = new StatePatternYumichan();
        spYumichan.changeState(new BadMoodState());
        System.out.println(spYumichan.getProtectionForCold());
        spYumichan.changeState(new OrdinaryState());
        System.out.println(spYumichan.getProtectionForCold());
    }
}
