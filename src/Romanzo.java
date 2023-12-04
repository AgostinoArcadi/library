public class Romanzo extends Libro {

    public Romanzo(String titolo, String autore, Integer annoDiPubblicazione, Integer numeroPagine) {
        super(titolo, autore, annoDiPubblicazione, numeroPagine);
    }

    /**
     * Restituisce il prezzo del libro, facendo un calcolo basato
     * sul tipo di libro e sul numero di pagine
     * @return il prezzo del libro romanzo
     */
    @Override
    public Double calcolaPrezzo() {
        double romanzo = 19.99;

        if(getNumeroPagine() >= 100) {
            romanzo += 10.0;
        }
        return romanzo;
    }
}
