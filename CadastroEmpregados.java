import java.util.ArrayList;
import java.util.List;

public class CadastroEmpregados {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();

        Empregado empregado1 = new Empregado("José", 1200);
        Empregado empregado2 = new Empregado("Manuela", 1600);
        Empregado empregado3 = new Empregado("Bruno", 3500);

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
}

class Empregado {
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}
