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

    public int[] findMinMax(){
        int minMax[]=new int[]{this.arr[0],this.arr[0]};
        for(int i=0;i<this.size;i++){
            if(arr[i]>minMax[0]){
                minMax[0]=arr[i];
            } else if(arr[i]<minMax[1]){
                minMax[1]=arr[i];
            }

        }
        return minMax;
    }

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter lenght of arr:");
        exp1 ojb=new exp1(scanner.nextInt());
        int minMax[]=new int[2];
        minMax=ojb.findMinMax();
        System.out.println("Min:"+minMax[1]+" Max:"+minMax[0]);
    }
}
