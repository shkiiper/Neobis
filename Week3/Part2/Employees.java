public class Employees {
    private long EmployeeId;
    private String Name;
    private String Position;
    private double salary;
    private String Adress;
    private String Email;
    private String Number;

    public Employees() {
    }

    public Employees(long employeeId, String Name, String position, double salary, String adress, String email, String number) {
        this.EmployeeId = employeeId;
        this.Name = Name;
        this.Position = position;
        this.salary = salary;
        this.Adress = adress;
        this.Email = email;
        this.Number = number;
    }

    public long getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(long employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        Name = Name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

}