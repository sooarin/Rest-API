package demo.model;

public class UserProfile {
    private String id;
    private String passwd;
    private String name;
    private String phonenumber;
    private String address;

    public UserProfile(String id, String passwd, String name, String phonenumber, String address) {
        super();
        this.id = id;
        this.passwd = passwd;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() { return passwd; }

    public void setPasswd() { this.passwd = passwd; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
