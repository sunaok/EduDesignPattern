package jp.goldhonest.PrototypePattern;

/**
 * Created by 1256670 on 2015/06/15.
 */
public class Paper implements Clonable {
    private String name;
    public Paper(){}

    public Paper(String name) {
        this.name = name;
    }

    @Override
    public Clonable createClone() {
        Paper newPaper = new Paper();
        newPaper.name = this.name;
        //newPaper‚Æthis‚ğd‚Ë‚ÄAthis‚ÌŒ`‚ÉØ‚è”²‚­
        return newPaper;
    }
}
