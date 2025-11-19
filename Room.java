import java.util.ArrayList;
import java.util.List;

public class Room {
    // Atributes
    private String name, type;
    private int capacity, usersInside;
    private boolean hasBlackboard, isAvailable;
    private List<User> users = new ArrayList<>();
    private User userInCharge;

    // Contructor
    public Room(String name, String type, int capacity, boolean hasBlackboard, User userInCharge) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.hasBlackboard = hasBlackboard;
        this.isAvailable = true;
        this.userInCharge = userInCharge;
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

    public void setUserInCharge(User userInCharge){
        this.userInCharge = userInCharge;
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

    public User getUserInCharge(){
        return userInCharge;
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
        String msg = String.format("Sala: %s - %d. Se utilizará para %s, %s y %s. Hay %d personas en la sala.", name, capacity, type, hasBlackboardMsg(),isAvailableMsg(),usersInside);
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
        for (User user : users) userList += "\n- " + user.getName();
        return userList;
    }
}
