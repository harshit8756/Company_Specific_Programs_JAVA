
class InterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return principal * rate * time / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, int time, int compoundingFrequency) {
        double n = compoundingFrequency;
        double r = rate / 100;
        double compoundedAmount = principal * Math.pow(1 + r / n, n * time);
        return compoundedAmount - principal;
    }
}
public class program4 {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 3;
        int compoundingFrequency = 12;

        double simpleInterest = InterestCalculator.calculateSimpleInterest(principal, rate, time);
        double compoundInterest = InterestCalculator.calculateCompoundInterest(principal, rate, time, compoundingFrequency);

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
