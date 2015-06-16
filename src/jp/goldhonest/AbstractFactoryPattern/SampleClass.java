package jp.goldhonest.AbstractFactoryPattern;

/**
 * Created by 1256670 on 2015/06/16.
 * �C���X�^���X�̐�������ɍs���N���X��p�ӂ��邱�ƂŁA��������K�v�Ƃ�����A�̃I�u�W�F�N�g�Q���ԈႢ�Ȃ��������邽�߂̃p�^�[���ł��B
 */
public class SampleClass {
    public static void main(String[]args) {
        HotPot hotpot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotpot.addSoup(factory.getSoup());
        hotpot.addMain(factory.getMain());
        hotpot.addVegetables(factory.getVegetables());
        hotpot.addOtherIngredients(factory.getOtherIntegredients());
    }


}
