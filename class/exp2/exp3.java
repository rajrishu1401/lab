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

    public void merge(int start , int middle, int last){
        int n1=middle-start+1;
        int n2=last-middle;

        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];
        int i = 0;
        int j = 0;
 
        for (i = 0; i < n1; i++){
            leftArr[i] = this.arr[start + i];
            System.out.print("Larr:"+this.arr[start + i]);
        }
            
        System.out.println("");
        for (j = 0; j < n2; j++){
            rightArr[j] = this.arr[middle + 1 + j];
            System.out.print("Rarr:"+this.arr[middle + 1 + j]);
        }
        System.out.println("");

        i=0;
        j=0;
        int k = start;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j] && leftArr[i]!=0) {
                arr[k] = leftArr[i];
                i++;
            }
            else if(rightArr[j]!=0){
                arr[k] = rightArr[j];
                j++;
            }else{
                arr[k]=leftArr[i];
                i++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        System.out.print("arr:");
        for (j =start; j <=last; j++){
            System.out.print(this.arr[j]);
        }
        System.out.println("");
    }
    

    public void sort(int start,int last){
        if(start>=last){
            return;
        }
        int j=start+(last-start)/2;
        this.sort(start,j);
        this.sort(j+1,last);
        this.merge(start,j,last);

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
