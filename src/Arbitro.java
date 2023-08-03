import java.time.LocalDate;

public class Arbitro extends Persona {
    private String ruolo;

    public Arbitro(String nome, LocalDate datadiNascita, String ruolo) {
        super(nome, datadiNascita);
        this.ruolo = ruolo;
    }



}

