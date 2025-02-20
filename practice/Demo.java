
public class Demo {
    void meth1()throws NoNegative{
        Add(-1,3);
    }
    void Add(int a,int b) throws NoNegative{
        if(a<0){
            throw new NoNegative();
        }
        else{
            System.out.println(a+b);
        }
    }
    public static void main(String[] args) throws NoNegative {
        Demo o=new Demo();
        o.meth1();
    }
}
