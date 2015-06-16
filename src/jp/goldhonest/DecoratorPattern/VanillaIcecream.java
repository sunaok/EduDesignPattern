package jp.goldhonest.DecoratorPattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class VanillaIcecream implements Icecream {
    @Override
    public String getName() {
        return "バニラアイスクリーム";
    }

    @Override
    public String howSweet() {
        return "バニラ味";
    }
}
