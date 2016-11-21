package uebunng4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataBase extends Remote {

    DBResult getRecord(int index) throws RemoteException;

    void addRecord(int index, DBResult record) throws RemoteException;

    int getSize() throws RemoteException;

    Integer getIndex(DBResult record) throws RemoteException;
}
