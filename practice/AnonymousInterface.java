public interface AnonymousInterface {
    abstract void show();
    public static void main(String [] arg){
        AnonymousInterface obj = new AnonymousInterface(){
            @Override
            public void show(){
                System.out.println("anon:");
            }
        };
        obj.show();
    }
}

