package jp.goldhonest.Momento;

/**
 * Created by 1256670 on 2015/07/21.
 * 18.1 Memento �p�^�[���Ƃ�
 ��18�͂ł� Memento �p�^�[�����w�т܂��BMemento �Ƃ́A�p��Łu�L�O�i�v�u�`���v���Ӗ�����P��ł��B �L�O�i��`��������ƁA�����̏󋵂��v���o����܂��BMemento �p�^�[���Ƃ́A �C���X�^���X�̂���Ƃ��̏�Ԃ��X�i�b�v�V���b�g�Ƃ��ĕۑ����Ă������ƂŁA ���̎��̃C���X�^���X�̏�Ԃ𕜌����邱�Ƃ��\�ɂ�����̂ł��B

 �C���X�^���X�̏�Ԃ��A�v���O�������s���ɂǂ�ǂ�ω����邱�Ƃ��l�����܂��B ��x�ω����Ă��܂����C���X�^���X���A�u�����O�̏�Ԃɖ߂������v�u���鎞�_�̏�Ԃɖ߂������v�Ȃǂ̗v���͎��ɔ���������̂ł��B ���̂悤�ȗv���ɃX�}�[�g�ɉ����邱�Ƃ��ł���̂��AMemento �p�^�[���ł��B Memento �p�^�[�����g���ƁA�C���X�^���X�̂��鎞�̏�Ԃ��A�ȒP�ɃX�i�b�v�V���b�g�Ƃ��Ďc�����Ƃ��ł��A ����ɁA��������̕������\�ɂȂ�܂��B�C���X�^���X�S�Ă̏�Ԃ��o���Ă������߂ɁA clone ���쐬���邱�Ƃ�����܂����AMemento �p�^�[���ł́A�K�v�ȏ��݂̂�ێ����Ă����A�K�v�ȃf�[�^�݂̂𕜌����邱�Ƃ��l���܂��B


 * �r���o�߂�ێ�����@Memento �N���X
 */
public class Memento {
    /**�@�v�Z�̓r���o�߂�\�� **/
    private int result = -1;
    /**
     * �v�Z�o�߂������Ɏ󂯎��R���X�g���N�^
     * @param temp
     *
     * **/
    public Memento(int temp) {
        this.result = temp;
    }
    public int getResult() {
        return result;
    }
}
