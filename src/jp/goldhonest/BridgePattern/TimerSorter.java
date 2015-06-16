package jp.goldhonest.BridgePattern;

/**
 * Created by 1256670 on 2015/06/16.
 */
public class TimerSorter extends Sorter {
    public TimerSorter(SortImple sortImple) {
        super(sortImple);
    }

    public void timerSort(Object obj[]) {
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start));
    }
}
