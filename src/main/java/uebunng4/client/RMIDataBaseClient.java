package uebunng4.client;

import uebunng4.DBResult;
import uebunng4.DataBase;
import uebunng4.DataBaseImpl;

import javax.xml.crypto.Data;
import java.io.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMIDataBaseClient {

    public static void main(String[] args) throws Exception {
        DataBase db = readStubFromFile("db");
        System.out.println("DB-Size: " + db.getSize());
        //System.out.println("Adding records to db...");
        //addRecordsToDb(db);
        System.out.println("DB-Size: " + db.getSize());
        System.out.println("Index for Appen: " + db.getIndex(new DBResult("Appen")));
    }

    private static DataBase readStubFromFile(String fileName)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        /* Deserialize stub using Java Serialization */
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fis);
        DataBase remoteObj = (DataBase)in.readObject();
        in.close();
        return remoteObj;
    }

    private static void addRecordsToDb(DataBase db) throws RemoteException {
        db.addRecord(4101, new DBResult("Appen"));
        db.addRecord(4102, new DBResult("Ahrensburg"));
        db.addRecord(4103, new DBResult("Wedel"));
        db.addRecord(4104, new DBResult("Aumühle"));
        db.addRecord(4105, new DBResult("Seevetal"));
        db.addRecord(4106, new DBResult("Quickborn"));
    }

}
