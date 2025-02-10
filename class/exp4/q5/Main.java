public class Main {
    public static void main(String arg[]) {
		Chef[] chefs = new Chef[3];
		chefs[0]=new ItalianChef();
        chefs[1]=new MexicanChef();
        chefs[2]=new ChineseChef();
		
		for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }
	}
}
