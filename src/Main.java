import jp.goldhonest.BuilderPattern.*;
import jp.goldhonest.CompositePattern.Directory;
import jp.goldhonest.CompositePattern.DirectoryEntry;
import jp.goldhonest.CompositePattern.File;
import jp.goldhonest.CompositePattern.SymbolicLink;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Builder builder = new SaltWaterBuilder();
//        Director dir = new Director(builder);
//        dir.construct();
//        SaltWater saltWater = (SaltWater) builder.getResult();
//        System.out.println(saltWater.salt);
        Directory dir = new Directory("TestFolder");
        dir.add(new File("File1"));
        dir.add(new SymbolicLink("SymboTest1"));
        dir.remove();

    }
}
