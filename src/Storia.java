public class Storia extends Libro {

    public Storia(String titolo, String autore, Integer annoDiPubblicazione, Integer numeroPagine) {
        super(titolo, autore, annoDiPubblicazione, numeroPagine);
    }

    /**
     * Restituisce il prezzo del libro, facendo un calcolo basato
     * sul tipo di libro e sul numero di pagine
     * @return il prezzo del libro di storia
     */
    @Override
    public Double calcolaPrezzo() {
        double libroDiStoria = 14.99;

        if(getNumeroPagine() >= 100) {
            libroDiStoria += 10.0;
        }
        return libroDiStoria;
    }
}
