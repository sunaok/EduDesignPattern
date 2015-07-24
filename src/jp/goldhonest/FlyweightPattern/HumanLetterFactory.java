package jp.goldhonest.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1256670 on 2015/07/24.
 */
public class HumanLetterFactory {
/**
 * �l������map
 *
 * **/
    Map<String, HumanLetter> map = new HashMap<String, HumanLetter>();
    /**
     * Singleton�̍쐬
     *
     * **/
    private static HumanLetterFactory singleton = new HumanLetterFactory();

    private HumanLetterFactory(){}
    public HumanLetterFactory getInstance(){
        return singleton;
    }

    /**
     * �l�������擾���郁�\�b�h
     **/
    public synchronized HumanLetter getHumanLetter(String letter) {
        HumanLetter humanLetter = map.get(letter);
        if (humanLetter == null) {
            humanLetter = new HumanLetter(letter);
            map.put(letter, humanLetter);

        }
        return humanLetter;
    }

}
