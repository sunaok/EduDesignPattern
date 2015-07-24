package jp.goldhonest.FlyweightPattern;

/**
 * Created by 1256670 on 2015/07/24.
 */
public class SampleSingleton {
    private static SampleSingleton ourInstance = new SampleSingleton();

    public static SampleSingleton getInstance() {
        return ourInstance;
    }

    private SampleSingleton() {
    }
}
