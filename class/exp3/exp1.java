public class Book {
    String title;
    String Author;

    Book(){
        this.title="The Legends";
        this.Author="Raj";
        System.out.println("title:"+this.title+" Author:"+this.Author);
    }
    Book(String title,String Author){
        this.title=title;
        this.Author=Author;
        System.out.println("title:"+this.title+" Author:"+this.Author);
    }
    Book(String title,String Author,int year){
        this.title=title;
        this.Author=Author;
        System.out.println("title:"+this.title+" Author:"+this.Author+" Year:"+year);
    }
    public static void main(String arg[]){
        Book obj1=new Book();
        Book obj2=new Book("The OGs","Ragav");
        Book obj3=new Book("The OGs","Ragav",2010);
    }
}
