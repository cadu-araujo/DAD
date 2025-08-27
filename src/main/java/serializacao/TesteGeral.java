package serializacao;


import model.Serializer;
import model.Teste;

import java.io.IOException;

public class TesteGeral {
    public static void main(String[] args) throws IOException {
        Teste teste = new Teste("Carlos");
        Serializer serializer = new Serializer();

        serializer.Out(teste);
        try {
            Teste objeto = Serializer.Input(teste);
            System.out.println(objeto);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
