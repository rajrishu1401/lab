

public class AnonymousInnerClass {
    int i=6;
    void show(){
        System.out.println(i);
    }
    public static void main(String [] arg){
        AnonymousInnerClass obj = new AnonymousInnerClass(){
            @Override
            void show(){
                System.out.println("anon:"+i);
            }
        };
        obj.show();
    }
}
