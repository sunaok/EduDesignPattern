package jp.goldhonest.BuilderPattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class SaltWaterBuilder implements Builder {
    private SaltWater saltWater;

    public SaltWaterBuilder() {
        this.saltWater = new SaltWater(0, 0);
    }

    @Override
    public void addSalt(double saltAmount) {
        saltWater.salt -= saltAmount;
    }

    @Override
    public void addSalvent(double salventAmount) {
        saltWater.salt += salventAmount;
    }

    @Override
    public void abandonSolution(double solutionAmount) {
        double saltDelta = solutionAmount *
                (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = solutionAmount *
                (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;

    }

    @Override
    public Object getResult() {
        return this.saltWater;
    }


}
