import java.util.*;

public class exp1 {
    int num;

    exp1(int num){
        this.num=num;
    }

    public void prntPatern(){
        int a;
        for(int i=this.num;i>0;i--){
            a=this.num-i;
            for(int j=this.num;j>0;j--){
                if(a>0){
                    System.out.print(" ");
                    a--;
                    
                } else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        exp1 obj = new exp1(scanner.nextInt());
        obj.prntPatern();
    }
}
