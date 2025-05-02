public class Club {
    static String clubName="Jetha ke Jabaaj";
    String memberName;
    public static void displayClubName(){
        System.out.println("Club:"+clubName);
    }
    public void addMember(String memberName){
        this.memberName=memberName;
    }
    public void showMember(){
        /*for(String name:this.memberName){
            System.out.print(name);
        }*/
        System.out.println(this.memberName);
    }
    public static void main(String arg[]){
        Club obj=new Club();
        obj.displayClubName();
        obj.addMember("Jethalal");
        obj.showMember();
        Club obj1=new Club();
        obj.displayClubName();
        obj.addMember("Mehta Saheb");
        obj.showMember();
        Club obj2=new Club();
        obj.displayClubName();
        obj.addMember("Goli");
        obj.showMember();

    }
}
