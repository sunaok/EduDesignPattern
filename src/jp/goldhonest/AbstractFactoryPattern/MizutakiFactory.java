package jp.goldhonest.AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1256670 on 2015/06/16.
 */
public class MizutakiFactory extends Factory{


    @Override
    public Soup getSoup() {
        return new ChickenBonesSoup();
    }

    @Override
    public Protein getMain() {
        return new Chicken();
    }

    @Override
    public List<Vegetable> getVegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        return vegetables;
    }

    @Override
    public List<Ingredients> getOtherIntegredients() {
        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        otherIngredients.add(new Tofu());
       return otherIngredients;
    }
}
