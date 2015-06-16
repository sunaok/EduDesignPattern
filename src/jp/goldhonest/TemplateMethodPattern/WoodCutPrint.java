package jp.goldhonest.TemplateMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 * TemplateMethod �p�^�[���́A�e���v���[�g�̋@�\�����p�^�[���ł��B�X�[�p�[�N���X�ŏ����̘g�g�݂��߁A�T�u�N���X�ł��̋�̓I���e���������܂��B�X�[�p�[�N���X�ł́A�A���S���Y���̗���̒��ŗ��p����钊�ۓI�ȃ��\�b�h�ƁA���̒��ۓI�ȃ��\�b�h�𗘗p���āA�����̃A���S���Y�����`���� templateMethod ���\�b�h���`
 */
public abstract class WoodCutPrint {
    public abstract void draw(Cuttable hanzai);
    public abstract void cut(Cuttable hanzai);

    public abstract void print(Cuttable hanzai);

    public void createWoodCutPrint() {
        Wood hanzai = new Wood(); //Wood �N���X�� Cuttable�C���^�[�t�F�[�X�������ςƉ���
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
