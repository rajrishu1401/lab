public class Employee {
    public String name;
    public int empId;
    public double salary;
    Employee(){
        this.name="Rishu Raj";
        this.empId=500119484;
        this.salary=9999999;
    }

    Employee(String name,int empId,double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    public void display(){
        System.out.println("name:"+this.name+" salary:"+this.salary);
    }

    public void increaseSalary(double percentage){
        double perSal=this.salary*(percentage/100);
        this.salary=this.salary+perSal;
    }
}



