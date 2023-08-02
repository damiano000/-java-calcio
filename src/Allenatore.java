import java.time.LocalDate;

public class Allenatore extends Persona {
    // ATTRIBUTI
    String strategia;

    public Allenatore(String nome, LocalDate datadiNascita, String strategia) {
        super(nome, datadiNascita);
        this.strategia = strategia;
    }


    // COSTRUTTORI

    @Override
    public String toString() {
        return super.toString() + "strategia " + strategia;
    }


    // GETTER E SETTER

    // METODI


}
