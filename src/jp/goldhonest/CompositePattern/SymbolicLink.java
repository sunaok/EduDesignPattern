package jp.goldhonest.CompositePattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class SymbolicLink implements DirectoryEntry {
    private String name = null;

    public SymbolicLink(String name) {
        this.name = name;
    }

    @Override
    public void remove() {
        System.out.println("SymbolicLink Removed!!");
    }
}
