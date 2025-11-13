public class User {
    // Atributes
    private String name, surnames, dni, email, tlfn, job;
    private int expYears, age;

    // Constructor
    public User(String name, String surnames, String dni, String email, String tlfn, String job, int expYears, int age){
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
        this.email = email;
        this.tlfn = tlfn;
        this.job = job;
        this.expYears = expYears;
        this.age = age;
    }

    // Setters
    public void setAge(int age) {
        this.age = (age > 0) ? age : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }
    
    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getTlfn() {
        return tlfn;
    }

    public String getJob() {
        return job;
    }

    public int getExpYears() {
        return expYears;
    }

    // Methods
    public boolean isRetired() {
        return age > 65;
    }

    public String info(){
        String msg = String.format(
            "Datos del usuario:\n- Edad: %d\n- Nombre: %s\n- Apellidos: %s\n- DNI: %s\n- Email: %s\n- Tlfn.:%s\n- Trabajo: %s\n- Años de experiencia: %d",
            age, name, surnames, dni, email, tlfn, job, expYears);
        System.out.println(msg);
        return msg;
    }
}