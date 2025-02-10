public class Manager extends Employee{
    public String department;
    Manager(String name,int empId,double salary,String department){
        super(name,empId,salary);
        this.department=department;
    }
    @Override
    public void display(){
        System.out.println("name:"+super.name+" salary:"+super.salary+"department:"+this.department);
    }
}