package Users;

public class Representative
{
    private int employeeID;
    private String fName;
    private String lName;
    private String address;
    private String phone;
    private String email;
    private String password;
    private double salary;

    public Representative()
    {
        this.employeeID = 0;
        this.fName = "";
        this.lName = "";
        this.address ="";
        this.phone = "";
        this.email = "";
        this.password = "";
        this.salary = 0;
    }
    public Representative(int employeeID, String fName, String lName, String address, String phone, String email, String password, double salary) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }
    public Representative(Representative r) {
        this.employeeID = r.employeeID;
        this.fName = r.fName;
        this.lName = r.lName;
        this.address = r.address;
        this.phone = r.phone;
        this.email = r.email;
        this.password = r.password;
        this.salary = r.salary;
    }

    public String getPassword() {
        return password;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}