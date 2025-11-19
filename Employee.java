public class Employee extends User {
    // Atributos
    private int salary;
    private String position;

    // Constructor
    public Employee(String name, String surnames, String dni, String email, String tlfn, String job, int expYears, int age, int salary, String position){
        super(name, surnames, dni, email, tlfn, job, expYears, age);
        this.salary = salary;
        this.position = position;
    }

    // Métodos
    @Override
    public String info(){
        String msg = super.info() + String.format("\n- Trabaja de %s y tiene un salario de %d euros.", position, salary);
        return msg;
    }
}
