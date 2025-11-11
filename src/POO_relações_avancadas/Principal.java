package POO_relações_avancadas;

public class Principal {
    public static void main(String[] args) {
        Jogador objetoJogador1 = new Jogador("Pedro", 20, "0123456", "Atacante", 2000.00);
        Jogador objetoJogador2 = new Jogador("Paulo", 30, "987654", "Goleiro", 2000.00);
        Time objetoTime = new Time("15 de novembro", "10/11/2025");

        objetoTime.escalarJogador(objetoJogador1);
        objetoTime.escalarJogador(objetoJogador2);

        objetoTime.verTime();

        objetoTime.escalarJogador(objetoJogador1);

        objetoTime.aumentarSalario(objetoJogador1, 3000);

        System.out.println(objetoJogador1.getSalario());

        objetoTime = null;

        objetoTime.verTime();
    }
}
