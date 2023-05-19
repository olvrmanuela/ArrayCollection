import java.util.HashMap;
import java.util.Map;

public class Agenda {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        // Adicionando contatos à agenda
        agenda.put("José", "123456789");
        agenda.put("Manuela", "987654321");
        agenda.put("Bruno", "456789123");

        // Acessando contatos na agenda
        String numeroJose = agenda.get("José");
        String numeroManuela = agenda.get("Manuela");

        System.out.println("Número de José: " + numeroJose);
        System.out.println("Número de Manuela: " + numeroManuela);
    }
}

