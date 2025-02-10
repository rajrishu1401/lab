public class Staff extends Person{
    int staffId;
    String department;
    Staff(String name,int age,String address,int staffId,String department){
    	super(name,age,address);
    	this.staffId=staffId;
    	this.department=department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" Staff ID: " + this.staffId + ", Department: " + this.department);
    }
}