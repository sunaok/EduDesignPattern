package jp.goldhonest.StrategyPattern;

/**
 * Created by 1256670 on 2015/06/16.
 */
public class SampleClass {
    private int type = -1;
    public static final int COMPARE_AGE = 1;
    public static final int COMPARE_HEIGHT = 2;
    public static final int COMPARE_WEIGHT = 3;

    public SampleClass(int compareType) {
        this.type = compareType;
    }

    public int compare(Human h1, Human h2) {
        if (type == COMPARE_AGE) {
            if (h1.age == h2.age) {
                return 1;

            } else if (h1.age == h2.age) {
                return 0;
            } else {
                return -1;
            }
        } else if (type == COMPARE_HEIGHT) {
            if (h1.age == h2.age) {
                return 0;
            }
        }
        return -1;
    }
}