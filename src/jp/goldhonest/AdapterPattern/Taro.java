package jp.goldhonest.AdapterPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class Taro {
    public void enjoyWithAllClassmate(){
        System.out.println("Enjoy with All ClassMate");
    }
}

class NewTaro extends Taro implements Chairperson {


    @Override
    public void organizeClass() {
        enjoyWithAllClassmate();
    }
}
