import java.util.Scanner; // to import Scanner class for user input
class SimpleInterest
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Principal(in Rs):  ");
        float principal = sc.nextFloat(); // Read the principal amount from user input
        System.out.print("Enter Rate of Interest(in %):  ");    
        float rate = sc.nextFloat(); // Read the rate of interest from user input
        System.out.print("Enter Time(in year):  ");
        int time = sc.nextInt(); // Read the time period from user input
        // Calculate simple interest using the formula: SI = (P * R * T) /100
        float si = (principal * rate * time) / 100;
        /*======================================================================== */
        /*--- Displaying data to the user--- */
        System.err.println("================================");
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate of Interest : " + rate + " %");
        System.out.println("Time : " + time + " year(s)");  
        System.out.println("Simple Interest : Rs " + si);
    }
}