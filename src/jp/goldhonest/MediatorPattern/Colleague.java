package jp.goldhonest.MediatorPattern;

/**
 * Created by 1256670 on 2015/07/02.
 */
public interface Colleague {
    void needsAdvice();
    void setSecretLover(Colleague colleague);
    String getName();
}
