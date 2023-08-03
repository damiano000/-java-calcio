
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
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
            System.out.println("ruolo = " + posizioneR);

            LocalDate dataNascitaGiocatore = LocalDate.of(random.nextInt(1985, 2007), random.nextInt(1, 12), random.nextInt(1, 29));
            System.out.println(dataNascitaGiocatore);

            giocatori = new Giocatore(nomeGiocatore, dataNascitaGiocatore, posizioneR);

        }
        String nomeAllenatore = nomi[random.nextInt(nomi.length)];
        System.out.println("Nome = " + nomeAllenatore);
        int etaallenatore = random.nextInt(16, 40);
        System.out.println("Eta = " + etaallenatore);
        String[] tattiche = { "offensiva", "difensiva", "contrattaco", "ribasso", "avanzata"};
        int indice = (random.nextInt(0 , tattiche.length));
        String tatticheP = tattiche[indice];
        System.out.println("strategia=" + tatticheP);

        LocalDate dataNascitaAllenatore = LocalDate.of(random.nextInt(1975, 2000), random.nextInt(1, 12), random.nextInt(1, 29));
        System.out.println( dataNascitaAllenatore);

        Allenatore allenatore = new Allenatore(nomeAllenatore, dataNascitaAllenatore , tatticheP);

        String nomeArbitro = nomi[random.nextInt(nomi.length)];
        LocalDate etaArbitro = LocalDate.of(random.nextInt(1990, 2005), random.nextInt(1, 12), random.nextInt(1, 29));
        String ruolo = ("Arbitro pricipale");

        Arbitro arbitro = new Arbitro(nomeArbitro, etaArbitro, ruolo);

        Squadra squadra1 = new Squadra("Juventus", giocatori , allenatore);
        Squadra squadra2 = new Squadra("Napoli", giocatori , allenatore);

        boolean start = false;
        int goal = 0;

        Partita partita = new Partita(squadra1, squadra2, arbitro, start, goal);

        partita.startPartita();

        partita.goalCasual();
        partita.goalCasual();
        partita.goalCasual();
        partita.goalCasual();
        partita.goalCasual();
        partita.goalCasual();
        partita.endPartita();

    }
}


