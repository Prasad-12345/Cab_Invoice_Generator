package com.bridgelabz.cabinvoicegenerator;

/*
* Aurhor: Prasad
* The invoice generator should now take the multiple ride and calculate the aggregate total for all
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

    /*
     *This method will return the total fare for multiple rides
     */
    public double calculateFare(Ride[] rides){
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare = totalFare + calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    public static void main(String[] args) {
        //object
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(5.0f,10), new Ride(10.0f, 15)};
        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        System.out.println("Total fare is: " + totalFare);
    }
}
