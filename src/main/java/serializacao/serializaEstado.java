package serializacao;

import model.Estado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializaEstado {
    public static void main(String[] args) throws IOException {

        Estado estado1 = new Estado("Amazonas", "AM");

        FileOutputStream arquivo = new FileOutputStream("Estado.dat");

        ObjectOutputStream serializador = new ObjectOutputStream(arquivo);

        serializador.writeObject(estado1);
    }
}
