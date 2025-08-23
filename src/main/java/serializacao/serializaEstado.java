package serializacao;

import model.Cidade;
import model.Estado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serializaEstado {
    public static void main(String[] args) throws IOException {

        Estado est = new Estado("Amazonas", "AM");
        Cidade cidade1 = new Cidade("Manaus", est);
        Cidade cidade2 = new Cidade("Tefé", est);
        Cidade cidade3 = new Cidade("Coari", est);

        FileOutputStream arquivo = new FileOutputStream("Estado.dat");

        ObjectOutputStream serializador = new ObjectOutputStream(arquivo);

        serializador.writeObject(est);
    }
}
