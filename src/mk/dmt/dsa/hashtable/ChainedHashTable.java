package mk.dmt.dsa.hashtable;

import java.util.LinkedList;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for(int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
