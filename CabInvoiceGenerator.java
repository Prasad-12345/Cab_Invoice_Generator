/*
* Aurhor: Prasad
* Given distance and time the invoice generator should return total fare for the journey
 */
public class CabInvoiceGenerator {
    /*
     *Given distance and time then this method will return total fare
     */
    public double calculateFare(float distance, int time){
        int costPerKm = 10;
        int costPerMin = 1;
        return (distance * costPerKm) + (costPerMin * time);
    }

    public static void main(String[] args) {
        //object
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(5,10);
        System.out.println("Total fare is: " + totalFare);
    }
}
