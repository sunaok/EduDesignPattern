package jp.goldhonest.PrototypePattern;
import java.util.*;
/**
 * Created by 1256670 on 2015/06/15.
 */
public class PrototypeKeeper {
    private Map<String,Clonable> map;

    public PrototypeKeeper() {
        this.map = new HashMap<String, Clonable>();
    }

    public void addClonable(String key, Clonable prototype) {
        map.put(key, prototype);
    }

    public Clonable getClone(String key) {
        Clonable prototype = map.get(key);
        return prototype.createClone();
    }
}
