public class DigitalBook extends Book {
    // Atributos
    private String format;
    private float sizeMB;

    // Constructor
    public DigitalBook(String title, String isbn, String editorial, String lang, int nPages, int year, boolean isAvailable, String format, float sizeMB) {
        super(title, isbn, editorial, lang, nPages, year, isAvailable);
        this.format = format;
        this.sizeMB = sizeMB;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format(" Está en formato %s y pesa %.2f MB.", format, sizeMB);
        return msg;
    }
}
