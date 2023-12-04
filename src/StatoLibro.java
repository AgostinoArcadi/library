public enum StatoLibro {
    DISPONIBILE ("Disponibile"),
    IN_PRESTITO("In prestito"),
    IN_RESTAURO("In restauro");

    private final String stato;

    StatoLibro(String stato) {
        this.stato = stato;
    }

    public String getStato() {
        return stato;
    }

}
