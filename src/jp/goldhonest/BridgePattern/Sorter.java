package jp.goldhonest.BridgePattern;

/**
 * Created by 1256670 on 2015/06/16.
 */
public  class Sorter {
    private SortImple sortImple;

    public Sorter(SortImple sortImple) {
        this.sortImple = sortImple;
    }

    public void sort(Object obj[]) {
        sortImple.sort(obj);

    }
}
