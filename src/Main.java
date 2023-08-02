
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] nomi = {"Cristiano Ronaldo ", "Leo Messi ", "Maradona ", "Pelè", "Mario", "Luigi", "Giovanni", "Andrea", "Roberto",
                "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
                "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
                "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
                "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
                "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
                "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore"};



        Random random = new Random();

        Giocatore giocatori = null;

        for (int i = 0; i < 11; i++) {

            String nomeGiocatore = nomi[random.nextInt(nomi.length)];
            System.out.println("Nome = " + nomeGiocatore);
            int etaGiocatore = random.nextInt(16, 40);
            System.out.println("Eta = " + etaGiocatore);

            String[] ruoligc = {"ASA", "TD", "DE", "DC", "CM", "RM", "LM"};

            int posizionegc = (random.nextInt(0, ruoligc.length));
            String posizioneR = ruoligc[posizionegc];
            System.out.println(posizioneR);

            LocalDate dataNascitaGiocatore = LocalDate.of(random.nextInt(1985, 2007), random.nextInt(1, 13), random.nextInt(1, 29));
            System.out.println(dataNascitaGiocatore);

            giocatori = new Giocatore(nomeGiocatore, dataNascitaGiocatore, posizioneR);

            System.out.println(giocatori.toString());
        }
    }
}


