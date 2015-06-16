package jp.goldhonest.TemplateMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 * TemplateMethod パターンは、テンプレートの機能を持つパターンです。スーパークラスで処理の枠組みを定め、サブクラスでその具体的内容を実装します。スーパークラスでは、アルゴリズムの流れの中で利用される抽象的なメソッドと、この抽象的なメソッドを利用して、処理のアルゴリズムを定義する templateMethod メソッドを定義
 */
public abstract class WoodCutPrint {
    public abstract void draw(Cuttable hanzai);
    public abstract void cut(Cuttable hanzai);

    public abstract void print(Cuttable hanzai);

    public void createWoodCutPrint() {
        Wood hanzai = new Wood(); //Wood クラスは Cuttableインターフェースを実装済と仮定
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
