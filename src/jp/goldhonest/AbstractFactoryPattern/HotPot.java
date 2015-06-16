package jp.goldhonest.AbstractFactoryPattern;
import java.util.*;
/**
 * Created by 1256670 on 2015/06/16.
 */
public class HotPot {
    private Pot pot;
    private Soup soup;
    private Protein protein;
    private List vegetables;
    private List otherIngredients;

    public HotPot(Pot pot) {
        this.pot = pot;
    }

    public void addSoup(Soup soup) {
        this.soup = soup;
    }

    public void addMain(Protein protein) {
        this.protein=protein;
    }

    public void addVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;

    }

    public void addOtherIngredients(List<Ingredients> otherIngredients) {
        this.otherIngredients = otherIngredients;
    }
}
