package jp.goldhonest.FactoryMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class ImagawaCutPrint extends CutPrint {

    @Override
    protected void draw(Cuttable hanzai) {
        System.out.println("testDraw");
    }

    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println("testCut");
    }

    @Override
    protected void print(Cuttable hanzai) {
        System.out.println("testPrint");
    }

    @Override
    protected Cuttable createCuttable() {
        return new Potate();
    }
}
