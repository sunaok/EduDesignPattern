package jp.goldhonest.FlyweightPattern;

/**
 * Created by 1256670 on 2015/07/24.
 */
public class Main {
    /**
     * 人文字を作成するメイン関数
     * @param args
     * **/
    public static void main(String args[]) {
        HumanLetter S = new HumanLetter("S");
        takeAPhoto(S);
        
    }

    private static void takeAPhoto(HumanLetter s) {
        System.out.println(s.getLetter());
    }

}
