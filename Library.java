import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Library {
    // Atributes
    private String name, address;
    private int openTime, closeTime;
    private List<Book> books = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    // Constructor
    public Library(String name, String address, int openTime, int closeTime) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
    
    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setOpenTime(int openTime){
        this.openTime = openTime;
    }

    public void setCloseTime(int closeTime){
        this.closeTime = closeTime;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getOpenTime(){
        return openTime;
    }

    public int getCloseTime(){
        return closeTime;
    }

    // Methods
    public boolean isOpen(int time){
        String msg = (openTime <= time && time <= closeTime) ? "Está abierta" : "Está cerrada";
        System.out.println(msg);
        return openTime <= time && time <= closeTime;
    }

    public String info(){
        String msg = String.format("Biblioteca: %s - %s. Abierto de %d a %d", name, address, openTime, closeTime);
        System.out.println(msg);
        return msg;
    }

    public String showLibrary(){
        String msg = "Books:";

        for(Book book:books) msg += "\n- " + book.getTitle();
        
        msg += "\n\nRooms:";

        for(Room room:rooms) msg += "\n- " + room.getName();

        System.out.println(msg);
        return msg;
    }

    // # Book related methods
    public void addBook(){
        Scanner in = new Scanner(System.in);

        System.out.print("Título: ");
        String title = in.nextLine();

        System.out.print("ISBN: ");
        String isbn = in.nextLine();

        System.out.print("Editorial: ");
        String editorial = in.nextLine();

        System.out.print("Idioma: ");
        String lang = in.nextLine();

        System.out.print("Número de páginas: ");
        int nPages = in.nextInt();

        System.out.print("Año de publicación: ");
        int year = in.nextInt();

        System.out.print("Disponibilidad(y/n): ");
        boolean isAvailable = (in.nextLine() == "y") ? true : false;

        Book newBook = new Book(title, isbn, editorial, lang, nPages, year, isAvailable);
        books.add(newBook);

        in.close();
    }

    public void removeBook(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public Book searchBookByTitle(String title){
        Book foundBook = null;
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                foundBook = book;
                break;
            }
        }
        return foundBook;
    }

    // # Room related methods
    public void addRoom(){
        Scanner in = new Scanner(System.in);

        System.out.print("Nombre: ");
        String name = in.nextLine();

        System.out.println("Tipo: 1. Estudio - 2. Lectura - 3. Infantil");
        String type;
        switch (in.nextInt()) {
            case 3:
                type = "kids";
                break;
            case 2:
                type = "reading";
                break;
            default:
                type = "studying";
                break;
        }

        System.out.print("Capacidad: ");
        int capacity = in.nextInt();

        System.out.print("Pizarra(y/n): ");
        boolean hasBlackboard = (in.nextLine() == "y") ? true : false;

        Room newRoom = new Room(name, type, capacity, hasBlackboard);
        rooms.add(newRoom);

        in.close();
    }
    
    public void removeRoom(String name){
        rooms.removeIf(room -> room.getName().equals(name));
    }

    public String showRooms(){
        String msg = "Rooms";
        for(Room room : rooms){
            msg += "-\n " + room.getName() + ": " + room.getUsersSize();
        }
        return msg;
    }

    public String showAvailableRooms(){
        String msg = "Available rooms";

        for(Room room : rooms) if(room.getUsersSize() == 0) msg += room.getName();

        return msg;
    }

    // # User related methods
    public int getCurrentUsersInLibrary(){
        int currentUsersInLibrary = 0;
        for(Room room : rooms) currentUsersInLibrary += room.getUsersSize();
        return currentUsersInLibrary;
    }
}