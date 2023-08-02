import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] nomi = {"Cristiano Ronaldo ", "Leo Messi ", "Maradona ", "Pelè", "Mario", "Luigi", "Giovanni", "Andrea", "Roberto"};
        String[] ruolidifensivi = {"Portiere", "Difensore", "Centrocampista", "Attaccante"};

        Giocatore[] giocatori = new Giocatore[11];
        Random random = new Random();
        String nomeGiocatore= nomi[random.nextInt(nomi.length)];
        System.out.println(nomeGiocatore);
        int etaGiocatore = random.nextInt( 16, 40);
        System.out.println(etaGiocatore);




    }
}
