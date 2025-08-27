package model;

import java.io.*;

public class Serializer {

    public static <T> void Out (T obj) throws IOException {
        FileOutputStream arquivo = new FileOutputStream(obj.getClass().getName()+ ".dat");
        ObjectOutputStream serializador = new ObjectOutputStream(arquivo);
        serializador.writeObject(obj);
    }

    public static <T> T Input  (T obj) throws IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream(obj.getClass().getName()+ ".dat");
        ObjectInputStream deserializador = new ObjectInputStream(arquivo);
        return (T) deserializador.readObject();
    }

}
