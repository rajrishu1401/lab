import java.util.Arrays;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] arg){
        String[] names = {"Aman","Varchasv","Sourabh","Varchasv","Aman"};
        System.out.println(Arrays.toString(names));
        HashSet<String> name = new HashSet<>();
        name.addAll(Arrays.asList(names));
        System.out.println(name);

        System.out.println(name.contains("Aman"));
    }
}
