public abstract class Libro {
    private String titolo;
    
    private String autore;

    private Integer annoDiPubblicazione;

    private Integer numeroPagine;

    //lo stato del libro può essere: disponibile, in prestito o in restauro
    private StatoLibro stato;

    public Libro(String titolo, String autore, Integer annoDiPubblicazione, Integer numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
        this.stato = StatoLibro.DISPONIBILE;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(Integer annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public StatoLibro getStato() {
        return stato;
    }

    public void setStato(StatoLibro stato) {
        this.stato = stato;
    }

    public abstract Double calcolaPrezzo();

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                '}';
    }

}
