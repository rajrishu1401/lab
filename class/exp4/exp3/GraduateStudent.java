public class GraduateStudent extends Student{
    String researchTopic;
    GraduateStudent(String name,int age,String address,int studentId,String course,String researchTopic){
    	super(name,age,address,studentId,course);
    	this.researchTopic=researchTopic;
    }
    void submitThesis(){
    	System.out.println("Thesis Submitted.");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Research Topic: " + this.researchTopic);
    }
}