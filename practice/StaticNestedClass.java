public class StaticNestedClass {
    int i=10;
    static int j=6;
    private static class InnerNestedClass {
        void show(){
            System.out.println(j);
        }  
    }

    public static void main(String [] arg){
        //StaticNestedClass.InnerStaticNestedClass obj = new StaticNestedClass.InnerStaticNestedClass();
        InnerNestedClass obj1 = new InnerNestedClass();
        obj1.show();
        //StaticNestedClass.InnerStaticNestedClass.show();
    }
}
