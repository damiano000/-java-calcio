import java.time.LocalDate;

public class Giocatore extends Persona {
    // ATTRIBUTI
    private String ruolo;

    public Giocatore(String nome, LocalDate datadiNascita, String ruolo) {
        super(nome, datadiNascita);
        this.ruolo = ruolo;

    }


    @Override
    public String toString() {
        return super.toString()+ "ruolo" + ruolo;
    }
}
