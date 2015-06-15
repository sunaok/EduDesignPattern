import jp.goldhonest.BuilderPattern.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director(builder);
        dir.construct();
        SaltWater saltWater = (SaltWater) builder.getResult();
        System.out.println(saltWater.salt);
    }
}
