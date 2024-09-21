public class Aadhaar {
private String AadhaarNumber;

private String Name;

private String FatherName;

private String Address;


    public Aadhaar(String aadhaarNumber, String name, String fatherName, String address) {
        AadhaarNumber = aadhaarNumber;
        Name = name;
        FatherName = fatherName;
        Address = address;
    }

    public String getAadhaarNumber() {
        return AadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        AadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "AadhaarNumber='" + AadhaarNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

