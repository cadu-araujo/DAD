package serializacao;

import model.Cidade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializacaoCidade {
    public static void main(String[] args) throws IOException {
        Cidade cidade1 = new Cidade("Manaus", "MAO");

        FileOutputStream arquivo = new FileOutputStream("cidade.dat");

        ObjectOutputStream serializador = new ObjectOutputStream(arquivo);

        serializador.writeObject(cidade1);
    }
}
