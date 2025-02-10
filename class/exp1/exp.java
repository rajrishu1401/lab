import java.util.*;

public class exp {
    int unit;
    
    exp(int unit){
        this.unit=unit;
    }

    public void getCost(){
        System.out.print("cost:Rs");
        if(this.unit>=1 && this.unit<=100){
            System.out.print(5*this.unit);
        } else if(this.unit>=101 && this.unit<=200){
            System.out.print(((this.unit-100)*7)+(100*5));
        } else if(this.unit>=201 && this.unit<=300){
            System.out.print(((this.unit-200)*10)+(100*5)+(100*7));
        } else if(this.unit>300){
            System.out.print(((this.unit-300)*15)+(100*5)+(100*7)+(100*10));
        } else{
            System.out.print("wrong input");
        }
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter ur unit:");
        exp ojb=new exp(scanner.nextInt());
        ojb.getCost();
        scanner.close();
    }
}
