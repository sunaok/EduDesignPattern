package jp.goldhonest.FactoryMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 * TemplateMethod �p�^�[���́A�e���v���[�g�̋@�\�����p�^�[���ł��B�X�[�p�[�N���X�ŏ����̘g�g�݂��߁A�T�u�N���X�ł��̋�̓I���e���������܂��B�X�[�p�[�N���X�ł́A�A���S���Y���̗���̒��ŗ��p����钊�ۓI�ȃ��\�b�h�ƁA���̒��ۓI�ȃ��\�b�h�𗘗p���āA�����̃A���S���Y�����`���� templateMethod ���\�b�h���`
 */
public abstract class CutPrint {
    protected abstract void draw(Cuttable hanzai);
    protected abstract void cut(Cuttable hanzai);
    protected abstract void print(Cuttable hanzai);
    protected Cuttable createCuttable() {
        return new Wood();
    }
    public void createWoodCutPrint() {
        Cuttable hanzai = createCuttable(); //Wood �N���X�� Cuttable�C���^�[�t�F�[�X�������ςƉ���
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
