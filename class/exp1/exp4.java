import java.util.*;

public class exp4 {
    exp4(int a,int b,int c){
        switch(c){
            case 1:
                System.out.println("sum:"+(a+b));
                break;
            case 2:
                System.out.println("sub:"+(a-b));
                break;
            case 3:
                System.out.println("mul:"+(a*b));
                break;
            case 4:
                System.out.println("divide:"+(a/b));
                break;
            case 5:
                System.out.println("remainder:"+(a%b));
                break;
        }
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("select 1 for + , 2 for - , 3 for *, 4 for /:,5 for %:");
        int cas=scanner.nextInt();
        exp4 obj= new exp4(scanner.nextInt(),scanner.nextInt(),cas);
    }
}
