package jp.goldhonest.StrategyPattern;

/**
 * Created by 1256670 on 2015/06/16.
 * <p>
 * Strategy パターンでは、戦略の部分を意識して別クラスとして作成するようにしています。
 * 戦略x部分を別クラスとして作成しておき、戦略を変更したい場合には、利用する戦略クラスを変更するという方法で対応します。
 * 状況に応じてアルゴリズムを変えなければならないことは多々あります。
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
