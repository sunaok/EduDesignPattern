package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class Student {
    public static void main(String[] args) {

        //実験内容(コマンドオブジェクト)を用意する
        Command addSalt = new AddSaltCommand();
        Command addWater = new AddWaterCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();

        //実験セットを実験内容にセットする
        addSalt.setBeaker(new Beaker(100,0)); // 水100gの入ったビーカーをセットする
        addWater.setBeaker(new Beaker(0,10)); //食塩10gの入ったビーカーをセットする
        makeSaltWater.setBeaker(new Beaker(90, 10));

        //実験を行う
        addSalt.execute(); // 食塩を加えて飽和食塩水を作る実験
        addWater.execute(); // 水を加えて飽和食塩水を作る実験
        makeSaltWater.execute(); // 10%の食塩水100gを作る実験
    }
}
