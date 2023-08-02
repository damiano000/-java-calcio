import java.time.LocalDate;

public class Persona {
    // ATTRIBUTI

    String nome;

    LocalDate datadiNascita;

    // COSTRUTTORI

    public Persona(String nome, LocalDate datadiNascita) {
        this.nome = nome;
        this.datadiNascita = datadiNascita;
    }


    // GETTER AND SETTER

    // METODI

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", datadiNascita=" + datadiNascita +
                '}';
    }
}

