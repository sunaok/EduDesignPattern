package jp.goldhonest.MediatorPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1256670 on 2015/07/02.
 */
public class Saito implements LoveMediator {
    private Map<String, Colleague> colleagueMap = new HashMap<String, Colleague>();

    @Override
    public void addColleague(Colleague colleague) {
        colleagueMap.put(colleague.getName(), colleague);
    }

    @Override
    public int consultation(Colleague colleague, Colleague colleague2) {
        int possibility = 0;
        //様々な状況を考慮して、possibilityを導出する//
        return possibility;
    }

}
