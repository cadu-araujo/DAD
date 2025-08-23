package serializacao;

import model.Cidade;
import model.Estado;

import java.io.*;

public class deserializaEstado {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream arquivo = new FileInputStream("estado.dat");
        ObjectInputStream deserializador = new ObjectInputStream(arquivo);

        Estado objeto = (Estado) deserializador.readObject();
        System.out.println(objeto);
        System.out.println(objeto.getNome());
        System.out.println(objeto.getSigla());

        for(Cidade cidade: objeto.getCidades()){
            System.out.println(cidade.getNome());
        }
    }
}
