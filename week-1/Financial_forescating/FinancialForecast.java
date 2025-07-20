package financial_forecasting;

import java.util.*;
public class FinancialForecast {

    public static double forecast(double cv, double gr, int yr) {
        if (yr == 0) {
            return cv;
        }
        return forecast(cv * (1 + gr), gr, yr - 1);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter current value");
        double cv = sc.nextInt();  
    	System.out.println("Enter growth rate");
        double gr = sc.nextInt();
    	System.out.println("Enter years");
        int yr = sc.nextInt();          
        

        double fv = forecast(cv, gr, yr);
        System.out.printf("Predicted future value after %d years: %.2f\n", yr, fv);
        sc.close();
    }
}
