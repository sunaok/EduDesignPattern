package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class AddWaterCommand extends Command {

    @Override
    public void execute() {
        //����10g�������ĖO�a�H������������������ꍇ
        //�n���c���Ă���Ԃ͐���������
        while (!beaker.isMelted()){  //�n���c���Ă����
            beaker.addWater(10); // ����10g�����
            beaker.mix();
        }
        System.out.println("an experiment of adding water by 10g");
        beaker.note();
    }
}
