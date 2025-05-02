import java.io.Serializable;
public class PersonInfo implements Serializable{
    String name;
    int age;
    public PersonInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return """
               
               Person Details

               Name ="""+this.name+
                "\nAge ="+this.age;
     
    } 
}
