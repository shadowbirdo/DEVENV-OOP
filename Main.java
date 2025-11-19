import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksInRoom1 = new ArrayList<>(), booksLentToJuan = new ArrayList<>();
        Library centralLibrary = new Library("Central", "Random St. 123", 800, 2000);
        PaperBook treasureIsland = new PaperBook("La Isla del Tesoro", "123ABC", "Una", "ESP", 250, 1234, true, "Sala 1");
        DigitalBook communistManifesto = new DigitalBook("Manifiesto Comunista", "CBA321", "El Pueblo", "RUS", 999, 4321, true, "PDF", 56);
        StudyRoom roomForStudying = new StudyRoom("Sala 1", "Studying", 10, true, null, 2);
        ReadingRoom roomForReading = new ReadingRoom("Sala 2", "Reading", 10, true, null, booksInRoom1);
        Member juan = new Member("Juan", "ito Golondrina", "1234", "a@a.a", "123456", "nini", 25, 25, 1, booksLentToJuan);
        Employee pepe = new Employee("Pepe", "Pepito", "3214", "c@c.c", "951456", "Bibliotecario", 59, 65, 100, "Mostrador");
        booksInRoom1.add(communistManifesto);
        booksInRoom1.add(treasureIsland);
        booksLentToJuan.add(communistManifesto);
        centralLibrary.addRoom(roomForReading);
        centralLibrary.addRoom(roomForStudying);
        centralLibrary.setUserInChargeOfRoom(juan, roomForReading);
        
        System.out.println("\n\nDiálogo para añadir sala a la biblioteca:\n");
        centralLibrary.addRoomDialog();

        System.out.println("\n\nInformación Isla del Tesoro\n" + treasureIsland.info());
        
        System.out.println("\n\nInformación Manifiesto Comunista\n" + communistManifesto.info());
        
        System.out.println("\n\nInformación Sala 1\n" + roomForStudying.info());
        
        System.out.println("\n\nInformación Sala 2\n" + roomForReading.info());
        
        System.out.println("\n\nInformación Juan\n" + juan.info());
        
        System.out.println("\n\nInformación Pepe\n" + pepe.info());
        
        System.out.println("\n\nInformación Biblioteca Central\n" + centralLibrary.info());
    }
}



