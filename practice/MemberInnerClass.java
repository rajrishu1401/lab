public class MemberInnerClass {
    private int i=10;
    private static int j=6;
    int i1=11;
    static int j1=61;
    private class InnerNestedClass{
        void show(){
            System.out.println(j);
            System.out.println(i);
            System.out.println(j1);
            System.out.println(i1);
        }  
    }

    public static void main(String [] arg){
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.InnerNestedClass onj1=obj.new InnerNestedClass();
        onj1.show();
    }
}
