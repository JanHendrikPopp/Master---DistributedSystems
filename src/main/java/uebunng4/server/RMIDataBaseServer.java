package uebunng4.server;

import uebunng4.DataBase;
import uebunng4.DataBaseImpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;

public class RMIDataBaseServer {

    public static void main(String[] args) throws Exception {
        DataBase db = new DataBaseImpl();
        Remote obj = UnicastRemoteObject.exportObject(db, 8888);
        writeStubToFile("db", obj);
        System.out.println("DB initialized...");
        while (true) {
            //System.out.println("running");
        }
    }

    private static void writeStubToFile(String fileName, Remote stub)
            throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(stub);
        out.close();
    }

}
