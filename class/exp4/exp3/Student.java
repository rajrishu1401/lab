public class Student extends Person{
    int studentId;
    String course;
    Student(String name,int age,String address,int studentId,String course){
    	super(name,age,address);
    	this.studentId=studentId;
    	this.course=course;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" Student ID: " + this.studentId + ", Course: " + this.course);
    }
}
