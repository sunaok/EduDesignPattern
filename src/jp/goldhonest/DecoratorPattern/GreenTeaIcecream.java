package jp.goldhonest.DecoratorPattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class GreenTeaIcecream implements Icecream {
    @Override
    public String getName() {
        return "抹茶アイス";
    }

    @Override
    public String howSweet() {
        return "抹茶味";
    }
}
