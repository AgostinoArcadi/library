import java.util.HashSet;
import java.util.Set;

public class Libreria implements gestionePrestito {

    private Set<Libro> libri = new HashSet<>();

    public Libreria() {}

    public Set<Libro> getLibri() {
        return libri;
    }

    /**
     * Stampa tutti i libri con lo stato DISPONIBILE all'interno
     * della libreria, controllando se lo stato è
     * ugale a DISPONIBILE
     */
    public void availableBooks() {
        for (Libro libro : libri) {
            if (libro.getStato().equals(StatoLibro.DISPONIBILE)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Stampa tutti i libri con il titolo uguale a quello specificato
     * nel primo parametro
     * @param titolo il titolo del libro da carcare
     */
    public void searchByTitle(String titolo) {
        for (Libro libro : libri) {
            if (libro.getTitolo().equals(titolo)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Stampa tutti i libri con l'autore uguale a quello specificato
     * nel primo parametro
     * @param autore l'autore del libro da carcare
     */
    public void searchByAuthor(String autore) {
        for (Libro libro : libri) {
            if (libro.getAutore().equals(autore)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Stampa tutti i libri con l'anno di publicazione uguale a
     * quello specificato nel primo parametro
     * @param annoDiPubblicazione l'anno di pubblicazione del libro da carcare
     */
    public void searchByYear(Integer annoDiPubblicazione) {
        for (Libro libro : libri) {
            if (libro.getAnnoDiPubblicazione() == annoDiPubblicazione) {
                System.out.println(libro);
            }
        }
    }


    /**
     * Imposta lo stato del libro passato in input a IN_PRESTITO
     * @param libroDaPrestare libro prestato, che sarà impostato a prestito
     */
    @Override
    public void prestaLibro(Libro libroDaPrestare) {
        if(libri.contains(libroDaPrestare)) {
            libroDaPrestare.setStato(StatoLibro.IN_PRESTITO);

        } else {
            System.out.println("Il libro '" + libroDaPrestare.getTitolo() + "' non esiste");
        }
    }

    /**
     * Imposta lo stato del libro passato in input a DISPONIBILE
     * @param libroDaRestituire libro restituito, che sarà impostato a disponibile
     */
    @Override
    public void restituisciLibro(Libro libroDaRestituire) {
        if(libri.contains(libroDaRestituire)) {
            libroDaRestituire.setStato(StatoLibro.DISPONIBILE);

        } else {
            System.out.println("Il libro '" + libroDaRestituire.getTitolo() + "' non esiste");
        }
    }

}
