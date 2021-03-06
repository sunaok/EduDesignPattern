package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddSaltCommand extends Command {
    @Override
    public void execute() {
        //食塩を1gずつ加えて飽和食塩水を作る実験をする場合
        //完全に溶けている間は食塩を加える
        while (beaker.isMelted()) {
            beaker.addSalt(1);
            beaker.mix();
        }
        System.out.println("an experiment of adding salt by 1g");
        beaker.note();
    }
}
