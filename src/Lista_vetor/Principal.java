package Lista_vetor;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa humano1 = new Pessoa("Guilherme", 19, Profissao.MOTORISTA);
        Pessoa humano2 = new Pessoa("Bruno", 19, Profissao.VENDEDOR);

        ArrayList<Pessoa> minhaLista = new ArrayList<>();

        minhaLista.add(humano1);
        minhaLista.add(humano2);

        for(Pessoa p:minhaLista) {
                System.out.println(p);
        }


        //Pessoa[] meuVetor = new Pessoa[3];

        //meuVetor[0] = humano1;
        //meuVetor[1] = humano2;

        //for(Pessoa p:meuVetor) {
            //if(p != null){
                //System.out.println(p);
            //}
        //}
    }
}