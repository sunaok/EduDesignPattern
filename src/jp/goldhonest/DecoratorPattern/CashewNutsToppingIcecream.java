package jp.goldhonest.DecoratorPattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class CashewNutsToppingIcecream implements Icecream {
    private Icecream icecream = null;

    public CashewNutsToppingIcecream(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public String getName() {
        return icecream.getName() + "カシューナッツ";
    }

    @Override
    public String howSweet() {
        return icecream.howSweet();
    }
}
