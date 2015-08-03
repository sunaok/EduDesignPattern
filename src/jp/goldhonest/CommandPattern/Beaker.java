package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/07/27.
 * ToDo: CommandPattern�̑��������
 */
public class Beaker {
    private double water = 0; //��
    private double salt = 0; //�H��
    private boolean melted;
    public static final int ADD_SALT = 1; //�H���������āA����������ꍇ
    public static final int ADD_WATER = 2; //���������āA����������ꍇ
    public static final int MAKE_SALT_WATER = 3; //���������āA����������ꍇ


    public Beaker(double water, double salt) {
        this.water = water;
        this.salt = salt;
        this.mix();
    }
    /** --Command Pattern�̂��߂ɃR�[�h�C��
    //�e�������s�����\�b�h
    public void experiment(int param) {
        if (param == ADD_SALT) {
            //�H����1g�������ĖO�a�H������������������ꍇ
            //���S�ɗn���Ă���Ԃ͐H����������
            while (isMelted()) {
                this.addSalt(1);//�H����1g�����
                this.mix();//����������
            }
        } else if (param == ADD_WATER) {
                System.out.println("Experiment of adding water by 1g");
            while (isMelted()) {
                this.addWater(1);
                this.mix();
            }
                //
        } else if (param == MAKE_SALT_WATER) {
                System.out.println("An Experiment of making salt water");
            while (isMelted()) {
                this.addSalt(1);

            }
        }
            this.note();
    }
    **/
    //�r�[�J�[�ɐH���������郁�\�b�h
    public void addSalt(double salt) {
        this.salt += salt;
    }

    //�r�[�J�[�ɐ������郁�\�b�h
    public void addWater(double water) {
        this.water += water;
    }
    //���������郁�\�b�h
    public void mix() {
        //�n�t������������
        //�n�������n���c���������Z�b�g����
        //�퉷�ł̖O�a�H�����̔Z�x�͖�26.4%
        if ((this.salt / (this.salt + this.water)) * 100 < 26.4) {
            melted = true;
        } else {
            melted = false;
        }
    }

    //�H���̗ʂ�Ԃ����\�b�h
    public double getSalt() {
        return salt;
    }

    //���̗ʂ�Ԃ����\�b�h
    public double getWater() {
        return water;
    }

    //  �n�������n���c�������𒲂ׂ郁�\�b�h
    public boolean isMelted() {
        return melted;
    }
    //�������ʂ��m�[�g�ɋL�^����
    public void note() {
        System.out.println("Water:" + water + "g");
        System.out.println("Salt:" + salt + "g");
        System.out.println("Concentration:" + (salt / (water + salt)) * 100 + "%");
    }
}
