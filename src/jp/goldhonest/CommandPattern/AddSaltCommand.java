package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddSaltCommand extends Command {
    @Override
    public void execute() {
        //�H����1g�������ĖO�a�H������������������ꍇ
        //���S�ɗn���Ă���Ԃ͐H����������
        while (beaker.isMelted()) {
            beaker.addSalt(1);
            beaker.mix();
        }
        System.out.println("an experiment of adding salt by 1g");
        beaker.note();
    }
}
