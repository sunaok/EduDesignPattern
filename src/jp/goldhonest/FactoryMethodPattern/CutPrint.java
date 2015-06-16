package jp.goldhonest.FactoryMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 * TemplateMethod パターンは、テンプレートの機能を持つパターンです。スーパークラスで処理の枠組みを定め、サブクラスでその具体的内容を実装します。スーパークラスでは、アルゴリズムの流れの中で利用される抽象的なメソッドと、この抽象的なメソッドを利用して、処理のアルゴリズムを定義する templateMethod メソッドを定義
 */
public abstract class CutPrint {
    protected abstract void draw(Cuttable hanzai);
    protected abstract void cut(Cuttable hanzai);
    protected abstract void print(Cuttable hanzai);
    protected Cuttable createCuttable() {
        return new Wood();
    }
    public void createWoodCutPrint() {
        Cuttable hanzai = createCuttable(); //Wood クラスは Cuttableインターフェースを実装済と仮定
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
