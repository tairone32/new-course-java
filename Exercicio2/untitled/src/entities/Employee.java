package entities;

public class Employee {
    public String name;

    public double grossSalary;

    public double tax;


    public double nextSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentage){
        this.grossSalary = (porcentage * this.grossSalary) / 100 + this.grossSalary;
    }


    public String toString() {
        return name + " " + " Gross Salary: " + grossSalary + " Tax: "+ tax  ;
    }
}
