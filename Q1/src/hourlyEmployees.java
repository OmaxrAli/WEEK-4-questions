public class hourlyEmployees extends Employee{

    private double hours;
    private double wage;

    public hourlyEmployees(Employee HE, double hours, double wage){
        super(HE.getFname(), HE.getLname(), HE.getSSN());
        setHours(hours);
        setWage(wage);

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours>=0 && hours<=168)
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage>0)
        this.wage = wage;

    }


    public double earnings(){

        if (this.hours>=40)
        return (this.wage*1.5)*this.hours;

        else
            return this.wage*this.hours;
    }

    @Override
    public String toString() {
        return super.toString()+"\nearnings :"+earnings();
    }
}
