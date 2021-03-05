package Users;

public class Customer
{
    private int customerId;
    private String fName;
    private String lName;
    private String address;
    private String email;
    private String phone;
    private double billAmount;

    public Customer()
    {
        this.customerId =0;
        this.fName ="";
        this.email="";
        this.lName ="";
        this.address ="";
        this.phone ="";
        this.billAmount =0.0;
    }

    public Customer(int customerId, String fName, String lName, String address, String email, String phone, double billAmount)
    {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.email=email;
        this.phone = phone;
        this.billAmount = billAmount;
    }
    public Customer(Customer c)
    {
        this.customerId = c.customerId;
        this.fName = c.fName;
        this.lName = c.lName;
        this.address = c.address;
        this.email= c.email;
        this.phone = c.phone;
        this.billAmount = c.billAmount;
    }


    public int getCustomerId() {
        return customerId;
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
    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }


}
