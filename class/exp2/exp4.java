import java.util.*;

public class exp4 {
    
    public void reverseWords(String s) {
        StringBuilder word=new StringBuilder();
        int i=s.length()-1;
        int count=0;
        int k=0;
        while(i>=0){
            
            if(s.charAt(i)!=' '&&i!=0){
                i--;
                count++;
            }            
            else{
                int m=i+1;
                if(i==0){
                    count++;
                    m--;
                }
                for(;m<=count+i;m++){
                    word.append(s.charAt(m));
                    k++; 
                }
                if(i!=0){
                    word.append(" ");
                }
                k++;
                count=0;
                i--;
            } 
        }
        System.out.println(word);
            
    }
    public static void main(String arg[]){
    exp4 ojb=new exp4();
    String s="This is decent";
    System.out.println(s);
    ojb.reverseWords(s);
        
    }
}
