public class AnonymousInnerMethod {
    int i=6;

    void show(AnonymousInnerMethod ob){
        System.out.println(ob.i);
        ob.he();
    }
    void he(){
        System.out.println("hleoo:"+i);
    }

    public static void main(String [] arg){
        AnonymousInnerMethod obj = new AnonymousInnerMethod();
        obj.show(new AnonymousInnerMethod(){
            int i=10;
            @Override
            void he(){
                System.out.println("hleooMethod:"+i);
            }
        });
    }
}
