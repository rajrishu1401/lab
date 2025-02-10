public class Professor extends Staff{
    String Specialization;
    Professor(String name,int age,String address,int staffId,String department,String Specialization){
    	super(name,age,address,staffId,department);
    	this.Specialization=Specialization;
    }
    void conductLecture(){
        System.out.println("Conducting Lecture.");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Specialization: " + this.Specialization);
    }
}