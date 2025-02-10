public class Main{
	public static void main(String arg[]) {
		Person[] persons = new Person[3];
		persons[0]=new GraduateStudent("Rishu",20,"Jamshedpur,Jharkhand",500119484,"Btech Cse","Cloud Security and Privacy");
		persons[1]=new Professor("Amit",45,"Dehradun,Uttarakhand",300116768,"Cse","Cloud Computing");
		persons[2]=new GraduateStudent("Raghav",21,"Dehradun,Uttarakhand",500118494,"Btech Cse","AI");
		
		for (Person person : persons) {
            person.displayInfo();
            if (person instanceof Professor) {
                ((Professor) person).conductLecture();
            } else if (person instanceof GraduateStudent) {
                ((GraduateStudent) person).submitThesis();
            }
        }
	}
}