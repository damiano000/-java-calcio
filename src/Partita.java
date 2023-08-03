import java.util.Random;

public class Partita {

    Squadra casa;
    Squadra ospite;
    Arbitro arbitro;
    private int goal;

    private boolean confermaPartita;

    public Partita(Squadra casa, Squadra ospite, Arbitro arbitro, boolean confermaPartita, int goal) {
        this.casa = casa;
        this.ospite = ospite;
        this.arbitro = arbitro;
        this.confermaPartita = false;
        this.goal = 0;
    }

    public void startPartita() {
        this.confermaPartita = true;
        System.out.println("La partita è iniziata!");
    }

    public int aumentaGoal() {
        return goal++;
    }
    public void goalCasual(){
        if (!confermaPartita){
            System.out.println("La partita non  è ancora iniziata");
        }
        Random random = new Random();

        boolean goalCasa = random.nextBoolean();
        if (goalCasa){
            System.out.println("HA SEGNATO LA SQUADRA " + casa.getNome());
            casa.equals(aumentaGoal());
        }else {
            System.out.println("Ha segnato la squadra " + ospite.getNome());
            ospite.equals(aumentaGoal());
        }
        goal++;
    }
    public void endPartita(){
        this.confermaPartita = false;
        System.out.println("La partita è finita!");
    }
}
