package jp.goldhonest.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1256670 on 2015/07/24.
 */
public class HumanLetterFactory {
/**
 * 人文字のmap
 *
 * **/
    Map<String, HumanLetter> map = new HashMap<String, HumanLetter>();
    /**
     * Singletonの作成
     *
     * **/
    private static HumanLetterFactory singleton = new HumanLetterFactory();

    private HumanLetterFactory(){}
    public HumanLetterFactory getInstance(){
        return singleton;
    }

    /**
     * 人文字を取得するメソッド
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
