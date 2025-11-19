import java.util.List;

public class ReadingRoom extends Room {
    // Atributos
    private List<Book> booksInRoom;

    // Constructor
    public ReadingRoom(String name, String type, int capacity, boolean hasBlackboard, User userInCharge, List<Book> booksInRoom){
        super(name, type, capacity, hasBlackboard, userInCharge);
        this.booksInRoom = booksInRoom;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + "\n\nLista de libros en la sala:";
        for(Book book : booksInRoom) msg += "\n- " + book.getTitle();
        return msg;
    }
}
