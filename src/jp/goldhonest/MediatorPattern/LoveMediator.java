package jp.goldhonest.MediatorPattern;

/**
 * Created by 1256670 on 2015/07/02.
 * 16.1 Mediator �p�^�[���Ƃ�
 ��16�͂ł� Mediator �p�^�[�����w�т܂��B Mediator �Ƃ́A�p��Łu���ِl�A����ҁv���Ӗ�����P��ł��B Mediator �p�^�[���Ƃ́A�����̃I�u�W�F�N�g�̊Ԃ̒������s���Ȃ��珈���������߂�K�v�� ����ꍇ�ɗ��p����ƈЗ͂𔭊�����p�^�[���ł��B

 �Ⴆ�΁A�Ԃǂ���̑��������_�ŐM������ꂽ���ɁA�x������ʐ��������Ȃ��Ƃǂ��Ȃ�ł��傤�H ���ꂼ��̎Ԃ��A�߂��߂����f���A�s����Ǝv������i�ށB����ȏ�ԂŁA �M���̌̏�����܂����؂邱�Ƃ��ł���ł��傤���H�����炭�����ł��傤�B ������F���ꐶ�������͂̏󋵂��m�F���Ă��A�S���������F���ɂ�����͂�������܂���B �����ŁA���ِl�ł���u��ʏ����v�̓o��ł��B�ނ́A���͂̏󋵂����n���A���f������ŁA �u�i�߁v��u�~�܂�v�̎w�����o���܂��B�S�Ă̎Ԃ́A��ʏ����̎w���ʂ�ɐi�񂾂�~�܂����肷��킯�ł��B

 Mediator �p�^�[���́A�����̃I�u�W�F�N�g�Ԃ̒��������邽�߂ɁA �e�I�u�W�F�N�g����̖₢���킹���󂯁A �K�X���f���s���w�����o���u���ِl�v�̖������ʂ����N���X�𗘗p����p�^�[���ł��B

 http://www.techscore.com/tech/DesignPattern/Mediator.html/
 */
public interface LoveMediator {
    void addColleague(Colleague colleague);
    int consultation(Colleague colleague, Colleague colleague2);
}
