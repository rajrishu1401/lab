import java.util.*;

public class exp3_1 {
    int arr[];
    int size;

    exp3_1(int size){
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
        int index=-1;
        for(int i=0;i<this.size;i++){
            if(index==-1){
                if(arr[i]==0){
                    index=i;
                }
            }else if(arr[i]!=0){
                arr[index]=arr[i];
                arr[i]=0;
                index=i;
            }
            

        }
    }
    public void display(){
        for(int i:this.arr){
            System.out.print(i);
        }
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter lenght of arr:");
        exp3_1 ojb=new exp3_1(scanner.nextInt());
        ojb.zeroATLast();
        ojb.display();
        
    }
}
