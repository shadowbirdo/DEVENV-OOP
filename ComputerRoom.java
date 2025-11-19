public class ComputerRoom extends Room {
    // Atributos
    int nComputers;

    // Constructor
    public ComputerRoom(String name, String type, int capacity, boolean hasBlackboard, User userInCharge, int nComputers){
        super(name, type, capacity, hasBlackboard, userInCharge);
        this.nComputers = nComputers;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format(" Tiene %d ordenadores.", nComputers);
        return msg;
    }
}
