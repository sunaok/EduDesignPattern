package jp.goldhonest.Momento;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by 1256670 on 2015/07/21.
 */
public class Wadayama {
    private static Map<String, Memento> map = new HashMap<String, Memento>();

    /**
     * ŒvZ‚ğÀs‚·‚éƒNƒ‰ƒX
     *
     * @param args
     **/
    public static void main(String args[]) {
        Calc calc = new Calc();
        for (int n = 1; n <= 5; n++) {
            calc.plus(n);
        }

        System.out.println(calc.getTemp());
        map.put("5‚Ü‚Å‚Ì‘«‚µZ", calc.createMemento());
        //”“úŒo‰ßŒã
        //10‚Ü‚Å‚Ì‘«‚µZ‚ğ‚µ‚½‚¢B
        Calc calc2 = new Calc();
        calc2.setMemento(map.get("5‚Ü‚Å‚Ì‘«‚µZ"));
        for (int n = 6; n <= 10; n++) {
            calc2.plus(n);
        }
        System.out.println(calc2.getTemp());
        map.put("10‚Ü‚Å‚Ì‘«‚µZ", calc2.createMemento());
    }

}
