package jp.goldhonest.CompositePattern;

/**
 * Created by sunao on 2015/06/16.
 */
public class File implements DirectoryEntry {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void removeFile() {
        System.out.println("File Removed!!");
    }

    @Override
    public void remove() {
        System.out.println(name + "removed!!");
    }
}
