public class Pan {
    private String PanNumber;

    private String AadhaarNumber;

    private String BankDetails;

    private String Investment;

    public Pan(String panNumber, String aadhaarNumber, String bankDetails, String investment) {
        PanNumber = panNumber;
        AadhaarNumber = aadhaarNumber;
        BankDetails = bankDetails;
        Investment = investment;
    }

    public String getPanNumber() {
        return PanNumber;
    }

    public void setPanNumber(String panNumber) {
        PanNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return AadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        AadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return BankDetails;
    }

    public void setBankDetails(String bankDetails) {
        BankDetails = bankDetails;
    }

    public String getInvestment() {
        return Investment;
    }

    public void setInvestment(String investment) {
        Investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "PanNumber='" + PanNumber + '\'' +
                ", AadhaarNumber='" + AadhaarNumber + '\'' +
                ", BankDetails='" + BankDetails + '\'' +
                ", Investment='" + Investment + '\'' +
                '}';
    }
}

