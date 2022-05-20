package com.bridgelabz.cabinvoicegenerator;

/*
* Aurhor: Prasad
* The invoice generator should now return number of rides, total fare, average fare per ride
 */
public class CabInvoiceGenerator {
    static Ride[] rides;
    static double totalFare;
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
        totalFare = 0;
        for(Ride ride : rides){
            totalFare = totalFare + calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    //Method to calculate number of rides, total fare, average fare per ride
    public void invoiceDetails(){
        int numberOfRides = rides.length;
        System.out.println("Number of rides are: " + numberOfRides);

        System.out.println("Total fare is: " + totalFare);

        double averageFarePerRide = (totalFare / numberOfRides);
        System.out.println("Average fare per ride is" + averageFarePerRide);
    }

    public static void main(String[] args) {
        //object
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        rides = new Ride[]{new Ride(5.0f, 10), new Ride(10.0f, 15)};
        totalFare = cabInvoiceGenerator.calculateFare(rides);
        System.out.println("Total fare is: " + totalFare);
        cabInvoiceGenerator.invoiceDetails();
    }
}
