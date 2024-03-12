import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        PersonaImpl persona1 = new PersonaImpl();
        persona1.setName("Luisa");
        persona1.setLastName("Londoño");
        persona1.setAge(21);

        PersonaImpl persona2 = new PersonaImpl();
        persona2.setName("Miladis");
        persona2.setLastName("Hernandez");
        persona2.setAge(42);

        personas.add(persona1);
        personas.add(persona2);

        String nombreBuscado = "Luisa";
        for (Persona persona : personas) {
            if (persona.getName().equals(nombreBuscado)) {
                System.out.println("Persona encontrada");
                break;
            }
        }

        String nameUpdate = "Luisa";
        for (Persona persona : personas) {
            if (persona.getName().equals(nameUpdate)) {
                persona.setAge(22);
                break;
            }
        }

        String nameDelete = "Miladis";
        personas.removeIf(persona -> persona.getName().equals(nameDelete));

        System.out.println("Lista de personas:");
        for (Persona persona : personas) {
            System.out.println(persona.getName() + " " + persona.getLastName() + ", Edad: " + persona.getAge());
        }
    }
}
