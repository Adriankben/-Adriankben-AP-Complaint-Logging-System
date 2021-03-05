package Users;

public class Technicians {
    private int techId;
    private String fName;
    private String lName;
    private String address;
    private String phone;
    private String email;


    public Technicians() {
        this.techId = 0;
        this.fName = "";
        this.lName = "";
        this.address = "";
        this.phone = "";
        this.email = "";
    }

    public Technicians(int techId, String fName, String lName, String address, String phone, String email) {
        this.techId = techId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public Technicians(Technicians t) {
        this.techId = t.techId;
        this.fName = t.fName;
        this.lName = t.lName;
        this.address = t.address;
        this.phone = t.phone;
        this.email = t.email;
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
}
