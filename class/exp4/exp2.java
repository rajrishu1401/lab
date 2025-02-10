class Employee {
    String name;
    int empId;
    double salary;
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

    void display(){
        System.out.println("name:"+this.name+" salary:"+this.salary);
    }

    void increaseSalary(double percentage){
        double perSal=this.salary*(percentage/100);
        this.salary=this.salary+perSal;
    }
}
class Manager extends Employee{
    String department;
    Manager(String name,int empId,double salary,String department){
        super(name,empId,salary);
        this.department=department;
    }
    @Override
    void display(){
        System.out.println("name:"+super.name+" salary:"+super.salary+"department:"+this.department);
    }
}

public class Main{
    public static void main(String arg[]){
        Manager obj=new Manager("Rahul",500119898,100000,"Design");
        obj.display();
    }
}