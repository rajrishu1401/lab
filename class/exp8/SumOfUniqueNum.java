import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class SumOfUniqueNum {
    public static void main(String[] arg){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,4,7,8,4,1,1,9,2));
        HashSet<Integer> nums = new HashSet<>(num);
        int sum=0;
        for(int n: nums){
            sum+=n;
        }
        System.out.println(sum);
    }
}
