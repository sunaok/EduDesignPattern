package jp.goldhonest.MediatorPattern;

/**
 * Created by 1256670 on 2015/07/02.
 */
public class Nitta implements Colleague{
    private String name = "êVìc";
    private int tention;
    private Colleague secretLover = null;
    private LoveMediator mediator = new Saito();

    public String getName() {
        return name;

    }

    @Override
    public void needsAdvice() {
        this.tention = mediator.consultation(this,secretLover);
    }

    @Override
    public void setSecretLover(Colleague colleague) {
       this.secretLover = colleague;
    }
}
