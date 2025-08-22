package serializacao;

import model.Cidade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializaCidade {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    FileInputStream arquivo = new FileInputStream("cidade.dat");
    ObjectInputStream deserializador = new ObjectInputStream(arquivo);

    Cidade cidade1 = (Cidade) deserializador.readObject();

        System.out.println(cidade1);
        System.out.println(cidade1.getNome());
        System.out.println(cidade1.getEstado().getNome());
    }
}
