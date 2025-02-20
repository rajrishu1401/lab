public class exp1_1 {
    int h;
    exp1_1(int h){
        System.out.println("hello");
        this.h=h;
    }
    void p(){
        System.out.println(h);
    }
    void p1(int h1){
        this(h1);
    }
    public static void main(String[] args){
        exp1_1 obj=new exp1_1(4);
        obj.p();
        obj.p1(8);
        obj.p();
    }
}