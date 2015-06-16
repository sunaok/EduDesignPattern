package jp.goldhonest.AbstractFactoryPattern;

/**
 * Created by 1256670 on 2015/06/16.
 * インスタンスの生成を専門に行うクラスを用意することで、整合性を必要とされる一連のオブジェクト群を間違いなく生成するためのパターンです。
 */
public class SampleClass {
    public static void main(String[]args) {
        HotPot hotpot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotpot.addSoup(factory.getSoup());
        hotpot.addMain(factory.getMain());
        hotpot.addVegetables(factory.getVegetables());
        hotpot.addOtherIngredients(factory.getOtherIntegredients());
    }


}
