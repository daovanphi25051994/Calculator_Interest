import java.util.Scanner;

public class CalculatorInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int investmentAmount;
        int months;
        double interestRate;
        System.out.println("enter investment amount : ");
        investmentAmount = scanner.nextInt();
        System.out.println("enter months : ");
        months = scanner.nextInt();
        System.out.println("enter interest rate : ");
        interestRate = scanner.nextDouble();
        double totalInterest = investmentAmount * months * (interestRate / 12) / 100;
        System.out.printf("Total of interest: %.0f" , totalInterest);
    }
}
