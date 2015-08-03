package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddSaltCommand extends Command {
    @Override
    public void execute() {
        //H‰–‚ğ1g‚¸‚Â‰Á‚¦‚Ä–O˜aH‰–…‚ğì‚éÀŒ±‚ğ‚·‚éê‡
        //Š®‘S‚É—n‚¯‚Ä‚¢‚éŠÔ‚ÍH‰–‚ğ‰Á‚¦‚é
        while (beaker.isMelted()) {
            beaker.addSalt(1);
            beaker.mix();
        }
        System.out.println("an experiment of adding salt by 1g");
        beaker.note();
    }
}
