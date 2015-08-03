package jp.goldhonest.CommandPattern;

/**
 * Created by 1256670 on 2015/07/27.
 * ToDo: CommandPatternの続きをやる
 */
public class Beaker {
    private double water = 0; //水
    private double salt = 0; //食塩
    private boolean melted;
    public static final int ADD_SALT = 1; //食塩を加えて、かき混ぜる場合
    public static final int ADD_WATER = 2; //水を加えて、かき混ぜる場合
    public static final int MAKE_SALT_WATER = 3; //水を加えて、かき混ぜる場合


    public Beaker(double water, double salt) {
        this.water = water;
        this.salt = salt;
        this.mix();
    }
    /** --Command Patternのためにコード修正
    //各実験を行うメソッド
    public void experiment(int param) {
        if (param == ADD_SALT) {
            //食塩を1gずつ加えて飽和食塩水を作る実験をする場合
            //完全に溶けている間は食塩を加える
            while (isMelted()) {
                this.addSalt(1);//食塩を1g入れる
                this.mix();//かき混ぜる
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
    //ビーカーに食塩水を入れるメソッド
    public void addSalt(double salt) {
        this.salt += salt;
    }

    //ビーカーに水を入れるメソッド
    public void addWater(double water) {
        this.water += water;
    }
    //かき混ぜるメソッド
    public void mix() {
        //溶液をかき混ぜる
        //溶けたか溶け残ったかをセットする
        //常温での飽和食塩水の濃度は約26.4%
        if ((this.salt / (this.salt + this.water)) * 100 < 26.4) {
            melted = true;
        } else {
            melted = false;
        }
    }

    //食塩の量を返すメソッド
    public double getSalt() {
        return salt;
    }

    //水の量を返すメソッド
    public double getWater() {
        return water;
    }

    //  溶けたか溶け残ったかを調べるメソッド
    public boolean isMelted() {
        return melted;
    }
    //実験結果をノートに記録する
    public void note() {
        System.out.println("Water:" + water + "g");
        System.out.println("Salt:" + salt + "g");
        System.out.println("Concentration:" + (salt / (water + salt)) * 100 + "%");
    }
}
