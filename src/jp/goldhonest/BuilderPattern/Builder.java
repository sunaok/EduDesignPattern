package jp.goldhonest.BuilderPattern;

import java.util.Objects;

public interface Builder {
    public void addSalt(double saltAmount);

    public void addSalvent(double salventAmount);

    public void abandonSolution(double solutionAmount);

    public Object getResult();
}