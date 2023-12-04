public class Main {
    public static void main(String[] args) {
        Romanzo romanzo = new Romanzo("1", "2", 2010, 20);
        Fantasy fantsy = new Fantasy("a", "b", 2000, 100);
        Storia storia = new Storia("titolo", "autore", 2023, 300);

        Libreria libreria = new Libreria();
        libreria.getLibri().add(romanzo);
        //libreria.getLibri().add(fantsy);
        libreria.getLibri().add(storia);


        System.out.println(romanzo.calcolaPrezzo());

        libreria.prestaLibro(fantsy);

        libreria.searchByTitle("1");
        libreria.searchByAuthor("b");
        libreria.searchByYear(2023);

        System.out.println("\nLibri disponibili:");
        libreria.availableBooks();
    }
}
