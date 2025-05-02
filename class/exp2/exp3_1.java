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

    public void zeroATLast(){
        int p=-1;
        for(int i=0;i<this.size;i++){
            if(this.arr[i]==0&&p==-1){
                p=i;
            } else if(this.arr[i]!=0&&p!=-1){
                arr[p]=arr[i];
                arr[i]=0;
                p++;
            }
        }
        System.out.println("array:");
        for (int i = 0; i < this.size; i++)
            System.out.print(this.arr[i]);
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter lenght of arr:");
        exp1 ojb=new exp1(scanner.nextInt());
        ojb.zeroATLast();
        
    }
}
