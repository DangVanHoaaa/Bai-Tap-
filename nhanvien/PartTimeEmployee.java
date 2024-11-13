package bai6;

public class PartTimeEmployee extends Employee{
    private int hourPerWeek;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, int age, char gender, String mnv, int luong, int hourPerWeek) {
        super(name, age, gender, mnv, luong);
        this.hourPerWeek = hourPerWeek;
    }

    public int getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(int hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() +"PartTimeEmployee [hourPerWeek=" + hourPerWeek +  "]";
    }
    
    
    
}