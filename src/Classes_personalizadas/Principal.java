package Classes_personalizadas;

public class Principal {
    public static void main(String[] args) {
        Armadura eqp1 = new Armadura("Armadura de ferro", 40, 100);
        Espada eqp2 = new Espada("Espada de ferro", 50.0, 100, 40);
        Personagem pers = new Personagem("Cavalheiro");

        eqp1.exibirInfo();
        eqp2.exibirInfo();
        pers.exibirInfo();

        pers.equiparArmadura(eqp1);
        pers.equiparEspada(eqp2);

        pers.exibirInfo();

        Personagem inimigo = new Personagem("Monstro");

        inimigo.exibirInfo();

        pers.atacar(inimigo);

        inimigo.exibirInfo();

        pers.exibirInfo();
    }
}
