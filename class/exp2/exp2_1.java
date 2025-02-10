import java.util.*;

public class exp1 {
    int arr[];
    int size;

    exp1(int size){
        this.size=size;
        this.arr=new int[size];
        this.addNum();
    }

    public void addNum(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter no in array:");
        for(int i=0;i<this.size;i++){
            arr[i]=scanner.nextInt();
        }
    }
    public void findMaj(){
        int count=0;
        int candidate=this.arr[0];
        for(int i=0;i<this.size;i++){
            if(this.arr[i]==candidate){
                count++;
            }
            else{
                if(count==0){
                    candidate=arr[i];
                    count=0;
                }
                else{
                    count--;
                }
            }
        }
        System.out.println("Majority:"+candidate);
        
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter lenght of arr:");
        exp1 ojb=new exp1(scanner.nextInt());
        ojb.findMaj();
        
    }
}
