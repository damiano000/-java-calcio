public class Squadra {

    private String nome;
    Giocatore[] giocatori;
    Allenatore allenatore;

    public Squadra(String nome, Giocatore giocatori, Allenatore allenatore) {
        this.giocatori = new Giocatore[]{giocatori};
        this.allenatore = allenatore;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
