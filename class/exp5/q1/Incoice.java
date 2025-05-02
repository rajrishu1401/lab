public class Incoice extends TaxCalculator {
    public void calculateTotalWithTax(double amount){
        double taxAmount=amount*(GST_RATE/100);
        double totalAmount=amount+taxAmount;
        System.out.println("Toatl Amount:"+totalAmount);
    }
    @Override
    void displayGST(){
        System.out.println("Cant override");
        System.out.println("Tax rate:"+GST_RATE);
    }
}
