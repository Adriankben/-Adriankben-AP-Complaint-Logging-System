package Users;

public class Technicians
{
    private int techId;
    private String fName;
    private String lName;
    private String address;
    private String phone;
    private String email;
    private String password;
    private int hoursWorked;


    public Technicians() {
        this.techId = 0;
        this.fName = "";
        this.lName = "";
        this.address = "";
        this.phone = "";
        this.email = "";
        this.password = "";
        this.hoursWorked = 0;
    }

    public Technicians(int techId, String fName, String lName, String address, String phone, String email, String password, int hoursWorked) {
        this.techId = techId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.hoursWorked = hoursWorked;
    }
    public Technicians(Technicians t) {
        this.techId = t.techId;
        this.fName = t.fName;
        this.lName = t.lName;
        this.address = t.address;
        this.phone = t.phone;
        this.email = t.email;
        this.password = t.password;
        this.hoursWorked = t.hoursWorked;
    }

    public int getTechId() {
        return techId;
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

    public String getPassword() {
        return password;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setTechId(int techId) {
        this.techId = techId;
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

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
