package jp.goldhonest.StrategyPattern;

/**
 * Created by 1256670 on 2015/06/16.
 * <p>
 * Strategy �p�^�[���ł́A�헪�̕������ӎ����ĕʃN���X�Ƃ��č쐬����悤�ɂ��Ă��܂��B
 * �헪x������ʃN���X�Ƃ��č쐬���Ă����A�헪��ύX�������ꍇ�ɂ́A���p����헪�N���X��ύX����Ƃ������@�őΉ����܂��B
 * �󋵂ɉ����ăA���S���Y����ς��Ȃ���΂Ȃ�Ȃ����Ƃ͑��X����܂��B
 */
public class Human {
    public String name;
    public int height = -1;
    public int weight = -1;
    public int age = -1;

    public Human(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
