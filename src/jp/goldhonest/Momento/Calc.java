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
    *途中経過をMementoとして取得するメソッド
    * @return memento
     */
    public Memento createMemento() {
        return new Memento(temp);
    }

    /**
     * Mementoから計算経過を取得して、temp　にセットする
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.temp = memento.getResult();
    }
    /**
     * 計算結果を取得するメソッド
     * @return temp
     */
    public int getTemp() {
        return this.temp;
    }

}
