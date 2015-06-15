package jp.goldhonest.BuilderPattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.addSalt(40);
        builder.addSalvent(100);
        builder.abandonSolution(70);
        builder.addSalt(100);
        builder.addSalvent(15);

    }
}
