import java.util.ArrayList;
import java.util.List;

public class Member extends User {
    // Atributos
    private int memberId;
    private List<Book> lentBooks = new ArrayList<>();

    // Constructor
    public Member(String name, String surnames, String dni, String email, String tlfn, String job, int expYears, int age, int memberId, List<Book> lentBooks){
        super(name, surnames, dni, email, tlfn, job, expYears, age);
        this.memberId = memberId;
        this.lentBooks = lentBooks;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format("\n- Su número de usuario es %d y ha sacado los siguientes libros:", memberId);
        for (Book book : lentBooks) {
            msg += "\n- " + book.getTitle();
        }
        return msg;
    }
}
