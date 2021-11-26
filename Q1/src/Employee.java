public class Employee {

    private String Fname;
    private String Lname;
    private String SSN;

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getSSN() {
        return SSN;
    }

    public Employee(){
        this.Fname=null;
        this.Lname=null;
        this.SSN=null;

    }
    public Employee(String FN,String LN, String SSN){
        setFname(FN);
        setLname(LN);
        setSSN(SSN);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
