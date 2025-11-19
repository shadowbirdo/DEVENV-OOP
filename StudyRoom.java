public class StudyRoom extends Room {
    // Atributos
    int nTables;

    // Constructor
    public StudyRoom(String name, String type, int capacity, boolean hasBlackboard, User userInCharge, int nTables){
        super(name, type, capacity, hasBlackboard, userInCharge);
        this.nTables = nTables;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format(" Tiene %d mesas.", nTables);
        return msg;
    }
}
