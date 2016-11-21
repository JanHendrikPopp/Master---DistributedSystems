package uebunng4;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataBaseImpl implements DataBase {

    private HashMap<Integer, DBResult> database = new HashMap<>();

    @Override
    public DBResult getRecord(int index) throws RemoteException {
        return database.get(index);
    }

    @Override
    public void addRecord(int index, DBResult record) throws RemoteException {
        database.put(index, record);
    }

    @Override
    public int getSize() throws RemoteException {
        return database.size();
    }

    @Override
    public Integer getIndex(DBResult record) throws RemoteException {
        Iterator<Map.Entry<Integer, DBResult>> iter = database.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, DBResult> obj = iter.next();
            if (obj.getValue().equals(record)) {
                return obj.getKey();
            }
        }
        return null;
    }

}
