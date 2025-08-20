package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Gradle!!!");

        Aluno a1 = new Aluno();
        a1.setID(1);
        a1.setNome("Marco");
        a1.setIdade(45);

        System.out.println(a1.getNome());

    }
}