import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prime {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        List<Integer> lst= new ArrayList<>();
        int n=s.nextInt();
        while(n!=0){
            lst.add(s.nextInt());
            n-=1;
        }
        for(int i: lst){
            int k=1;
            for(int j=i/2; j>1 ; j--){
                if(i%j==0){
                    System.out.println(i+": not prime");
                    k=0;
                    break;
                }
            }
            if(k==1){
                System.out.println(i+": prime");
            }
        }
    }
}
