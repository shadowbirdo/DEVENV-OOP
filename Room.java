import java.util.ArrayList;
import java.util.List;

public class Room {
    // Atributes
    private String name, type;
    private int capacity;
    private boolean hasBlackboard, isAvailable;
    private List<User> users = new ArrayList<>();

    // Contructor
    public Room(String name, String type, int capacity, boolean hasBlackboard) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.hasBlackboard = hasBlackboard;
        this.isAvailable = true;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHasBlackboard(boolean hasBlackboard) {
        this.hasBlackboard = hasBlackboard;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
 
    
    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getHasBlackboard() {
        return hasBlackboard;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public int getUsersSize(){
        return users.size();
    }

    // Methods
    public String isAvailableMsg() {
        String msg = (isAvailable) ? "está disponible" : "no está disponible";
        System.out.println(msg);
        return msg;
    }

    public String hasBlackboardMsg() {
        String msg = (hasBlackboard) ? "tiene pizarra" : "no tiene pizarra";
        System.out.println(msg);
        return msg;
    }

    public String info(){
        String msg = String.format("Sala: %s - %d. Se utilizará para %s, %s y %s.", name, capacity, type, hasBlackboardMsg(),isAvailableMsg());
        System.out.println(msg);
        return msg;
    }

    // # User related methods
    public int userGoesIn(User u){
        int error = 0;

        if(this.getCapacity() - users.size() > 0) users.add(u);
        else error = 1;

        return error;
    }

    public int userExits(User u){
        int error = 0;

        if(users.size() > 0) users.remove(u);
        else error = 1;

        return error;
    }

    public String showUsers(){
        String userList = "User(s) in room:";
        for (User user : users) userList += "\n- " + user;
        return userList;
    }
}
