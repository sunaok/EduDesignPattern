package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddWaterCommand extends Command {

    @Override
    public void execute() {
        //水を10gずつ加えて飽和食塩水を作る実験をする場合
        //溶け残っている間は水を加える
        while (!beaker.isMelted()){  //溶け残っている間
            beaker.addWater(10); // 水を10g入れる
            beaker.mix();
        }
        System.out.println("an experiment of adding water by 10g");
        beaker.note();
    }
}
