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

    

    public void sortWithZeroATLast(){
        this.sort(0,size-1);
        System.out.println("array:");
        for (int i = 0; i < this.size; i++)
            System.out.print(this.arr[i]);
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter lenght of arr:");
        exp1 ojb=new exp1(scanner.nextInt());
        ojb.sortWithZeroATLast();
        
    }
}
