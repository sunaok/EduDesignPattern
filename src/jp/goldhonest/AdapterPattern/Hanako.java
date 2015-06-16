package jp.goldhonest.AdapterPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class Hanako implements Chairperson {
    Taro taro = null;

    public Hanako() {
        this.taro = new Taro();
    }

    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmate();
    }
}
