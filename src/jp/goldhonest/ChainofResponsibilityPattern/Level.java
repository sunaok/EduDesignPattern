package jp.goldhonest.ChainofResponsibilityPattern;

/**
 * Created by 1256670 on 2015/06/24.
 */
public class Level {
    private int i = 0;
    public Level(int i) {
    }

    public boolean lessThan(Level responsibleLevel) {
        if (i > responsibleLevel.i) {
            return true;
        }
        return false;
    }
}
