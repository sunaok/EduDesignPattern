package jp.goldhonest.ChainofResponsibilityPattern;

/**
 * Created by 1256670 on 2015/06/24.
 */
public abstract class Responsible {
    private Responsible next = null;
    private String responsiblePerson = null;

    public Responsible(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Responsible setNext(Responsible next) {
        this.next = next;
        return next;
    }

    public final void putQuestion(Question question) {
        if (beAbleToJudge(question)) {
            judge(question);
        }else if(next != null){
           next.putQuestion(question);
        }else{
            System.out.println("íNÇ…Ç‡îªífÇ≈Ç´Ç‹ÇπÇÒÇ≈ÇµÇΩÅB");
        }
    }
    protected abstract boolean beAbleToJudge(Question question);
    protected abstract void judge(Question question);
}
