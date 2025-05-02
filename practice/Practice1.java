
public class Practice1 {

    int s1;
    int s2;

    Practice1(int s1,int s2){
        this.s1=s1;
        this.s2=s2;
    }

    public static void main(String arg[]){

        Practice1 obj=new Practice1(1, 2);
        System.out.println(obj.s1);
        System.out.println(obj.s2);
        System.out.println(arg[0]);

    }
}