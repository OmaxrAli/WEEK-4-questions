public abstract class Employee {

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
