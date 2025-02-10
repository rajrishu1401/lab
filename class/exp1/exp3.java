
public class exp3 {

	exp3(int s){
		System.out.println("size of square:"+(s*s));
	}

	exp3(int h,int b){
		System.out.println("area of rectangle:"+(h*b));
	}

	exp3(int r,double pi){
		System.out.println("area of rectangle:"+(pi*r*r));
	}

	exp3(int h,int b,double half){
		System.out.println("area of rectangle:"+(h*b*half));
	}



	public static void main(String[] args) {
		exp3 areaRec=new exp3(4,5);
		exp3 areaSq= new exp3(4);
		exp3 areaCircle= new exp3(4,3.414);
		exp3 areaTriangle= new exp3(2,3,0.5);

	}

}
