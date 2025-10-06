package Lista3;

public class Principal {
    public static void main(String[] args) {
        Funcionario trabalhador = new Funcionario("Henrique", 2000);
        Gerente gerente = new Gerente("Gregory", 2000, 400);
        Programador programador = new Programador("Guilherme", 4000, "Python", 20, 40.0);
    }
}
