import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] nomi = {"Cristiano Ronaldo ", "Leo Messi ", "Maradona ", "Pelè", "Mario", "Luigi", "Giovanni", "Andrea", "Roberto"};
        String[] ruoligc = {"ASA", "TD", "DE", "DC", "CM", "RM", "LM"};


        Giocatore[] giocatori = new Giocatore[11];
        Random random = new Random();


            String nomeGiocatore = nomi[random.nextInt(nomi.length)];
            System.out.println("Nome = " + nomeGiocatore);
            int etaGiocatore = random.nextInt(16, 40);
            System.out.println("Eta= " + etaGiocatore);

            int posizionegc = (random.nextInt(0, ruoligc.length));
            System.out.println(ruoligc[((posizionegc))]);


        }


        }
