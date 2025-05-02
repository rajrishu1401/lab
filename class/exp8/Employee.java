import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id , double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void modifySal(double salary){
        this.salary+=salary;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
    public static void main(String[] arg){
        List<Employee> emp = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        int n1=n;
        while(n!=0){
            Employee e = new Employee(s.nextLine(),s.nextInt(),s.nextDouble());
            s.nextLine();
            emp.add(e);
            n-=1;
        }
        for( Employee ep: emp){
            System.out.println(ep.toString());
        }

        int id= s.nextInt();
        double sal=300;
        for( Employee ep: emp){
            if(id==ep.id){
                ep.modifySal(sal);
            }
        }
        for( Employee ep: emp){
            System.out.println(ep.toString());
        }
        id= s.nextInt();
        for(int j=0; j<n1; j++){
            if(id==emp.get(j).id){
                emp.remove(j);
                break;
            }
        }
        for( Employee ep: emp){
            System.out.println(ep.toString());
        }

    }
}
