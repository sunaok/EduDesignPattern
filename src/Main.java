import jp.goldhonest.BuilderPattern.*;
import jp.goldhonest.CompositePattern.Directory;
import jp.goldhonest.CompositePattern.DirectoryEntry;
import jp.goldhonest.CompositePattern.File;
import jp.goldhonest.CompositePattern.SymbolicLink;
import jp.goldhonest.DecoratorPattern.CashewNutsToppingIcecream;
import jp.goldhonest.DecoratorPattern.GreenTeaIcecream;
import jp.goldhonest.DecoratorPattern.Icecream;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Builder builder = new SaltWaterBuilder();
//        Director dir = new Director(builder);
//        dir.construct();
//        SaltWater saltWater = (SaltWater) builder.getResult();
//        System.out.println(saltWater.salt);
        //Composite Pattern Start----------------
//        Directory dir = new Directory("TestFolder");
//        dir.add(new File("File1"));
//        dir.add(new SymbolicLink("SymboTest1"));
//        dir.remove();
        //Composite Pattern ENd -------------------
        Icecream ice = new GreenTeaIcecream();
        Icecream ice2 = new CashewNutsToppingIcecream(ice);
        System.out.println(ice2.getName());
    }
}
