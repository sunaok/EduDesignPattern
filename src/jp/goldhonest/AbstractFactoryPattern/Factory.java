package jp.goldhonest.AbstractFactoryPattern;
import java.util.*;
/**
 * Created by 1256670 on 2015/06/16.
 */
public abstract class Factory {
    public abstract Soup getSoup();
    public abstract Protein getMain();
    public abstract List getVegetables();
    public abstract List getOtherIntegredients();
}
