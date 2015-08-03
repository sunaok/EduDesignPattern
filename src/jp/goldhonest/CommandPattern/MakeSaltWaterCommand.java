package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class MakeSaltWaterCommand extends Command {

    @Override
    public void execute() {
        beaker.mix();
        //濃度をはかり、ノートに記述する
        System.out.println("an experiment of making salt water");
        beaker.note();
    }
}
