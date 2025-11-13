public class Book {
    // Atributes
    private String title, isbn, editorial, lang;
    private int nPages, year;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String isbn, String editorial, String lang, int nPages, int year, boolean isAvailable) {
        this.title = title;
        this.isbn = isbn;
        this.editorial = editorial;
        this.lang = lang;
        this.nPages = nPages;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public void setNPages(int nPages) {
        this.nPages = nPages;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public String getLang() {
        return lang;
    }
    
    public int getNPages() {
        return nPages;
    }
    
    public int getYear() {
        return year;
    }
    
    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Methods
    public String isAvailableMsg() {
        String msg = (isAvailable) ? "Está disponible." : "No está disponible.";
        System.out.println(msg);
        return msg;
    }

    public boolean isForeign() {
        String msg = (lang.equals("ESP")) ? "Nacional" : "Extranjero";
        System.out.println(msg);
        return !lang.equals("ESP");
    }

    public String info() {
        String msg = String.format("Book: %s - %s (%d). %s, %d. %s", title, editorial, year, lang, nPages, isAvailableMsg());
        System.out.println(msg);
        return msg;
    }
}
