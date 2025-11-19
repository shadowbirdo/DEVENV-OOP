public class PaperBook extends Book { 
    // Atributos
    String location;

    // Constructor
    public PaperBook(String title, String isbn, String editorial, String lang, int nPages, int year, boolean isAvailable, String location) {
        super(title, isbn, editorial, lang, nPages, year, isAvailable);
        this.location = location;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format(" Se encuentra en %s.", location);
        return msg;
    }
}
