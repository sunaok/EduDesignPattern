package jp.goldhonest.Momento;

/**
 * Created by 1256670 on 2015/07/08.
 */
public class Calc {
    private int temp = 0;

    public void plus(int plus) {
        temp+=plus;

    }
    /*
    *�r���o�߂�Memento�Ƃ��Ď擾���郁�\�b�h
    * @return memento
     */
    public Memento createMemento() {
        return new Memento(temp);
    }

    /**
     * Memento����v�Z�o�߂��擾���āAtemp�@�ɃZ�b�g����
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.temp = memento.getResult();
    }
    /**
     * �v�Z���ʂ��擾���郁�\�b�h
     * @return temp
     */
    public int getTemp() {
        return this.temp;
    }

}
