public class LocalInnerClass {
    int i=6;
    void hel(){
        int j=10;
        class InnerNestedClass{
            void show(){
                System.out.println(j);
            }
        }
        InnerNestedClass obj = new InnerNestedClass();
        obj.show();
        
    }
    public static void main(String [] arg){
        LocalInnerClass ob = new LocalInnerClass();
        ob.hel();
    }
}
