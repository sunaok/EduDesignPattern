package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/08/03.
 */
public class Student {
    public static void main(String[] args) {

        //�������e(�R�}���h�I�u�W�F�N�g)��p�ӂ���
        Command addSalt = new AddSaltCommand();
        Command addWater = new AddWaterCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();

        //�����Z�b�g���������e�ɃZ�b�g����
        addSalt.setBeaker(new Beaker(100,0)); // ��100g�̓������r�[�J�[���Z�b�g����
        addWater.setBeaker(new Beaker(0,10)); //�H��10g�̓������r�[�J�[���Z�b�g����
        makeSaltWater.setBeaker(new Beaker(90, 10));

        //�������s��
        addSalt.execute(); // �H���������ĖO�a�H������������
        addWater.execute(); // ���������ĖO�a�H������������
        makeSaltWater.execute(); // 10%�̐H����100g��������
    }
}
