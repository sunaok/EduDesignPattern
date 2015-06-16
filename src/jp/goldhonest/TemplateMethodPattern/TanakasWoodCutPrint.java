package jp.goldhonest.TemplateMethodPattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class TanakasWoodCutPrint extends WoodCutPrint {
    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("drawing preferable girl with magic pen on hanzai");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("drawing preferable girl with Edge on hanzai");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("drawing preferable girl with ink and Baren on hanzai");
    }
}
