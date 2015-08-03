package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddWaterCommand extends Command {

    @Override
    public void execute() {
        //…‚ğ10g‚¸‚Â‰Á‚¦‚Ä–O˜aH‰–…‚ğì‚éÀŒ±‚ğ‚·‚éê‡
        //—n‚¯c‚Á‚Ä‚¢‚éŠÔ‚Í…‚ğ‰Á‚¦‚é
        while (!beaker.isMelted()){  //—n‚¯c‚Á‚Ä‚¢‚éŠÔ
            beaker.addWater(10); // …‚ğ10g“ü‚ê‚é
            beaker.mix();
        }
        System.out.println("an experiment of adding water by 10g");
        beaker.note();
    }
}
