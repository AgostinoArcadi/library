public class Fantasy extends Libro {

    public Fantasy(String titolo, String autore, Integer annoDiPubblicazione, Integer numeroPagine) {
        super(titolo, autore, annoDiPubblicazione, numeroPagine);
    }

    /**
     * Restituisce il prezzo del libro, facendo un calcolo basato
     * sul tipo di libro e sul numero di pagine
     * @return il prezzo del libro fantasy
     */
    @Override
    public Double calcolaPrezzo() {
        double libroFantasy = 24.99;

        if(getNumeroPagine() >= 100) {
            libroFantasy += 10.0;
        }
        return libroFantasy;
    }
}
