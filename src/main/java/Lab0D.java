import java.time.format.SignStyle;

public class Lab0D {
    public static double computeTax(double income, double exemptions, boolean nonProfit) {
        double adjustedIncome = income - (exemptions * 500);
        if (nonProfit || adjustedIncome < 0){
            return 0;
        } else if (adjustedIncome < 10000) {
            return adjustedIncome * .1;
        } else if (adjustedIncome < 20000) {
            return adjustedIncome * .15;
        } else if (adjustedIncome < 50000) {
            return adjustedIncome * .2;
        } else {
            return adjustedIncome * .25;
        }
    }
    public static double grossIncome(double income, double exemptions, boolean nonProfit) {
        return income - computeTax(income, exemptions, nonProfit);
    }

    public static double findExemptions(double income){
        double exemptions = 1.0;
        while (grossIncome(income, exemptions, false) < (income * .95)){
            exemptions++;
        }
        return exemptions;
    }

    public static long sumDigits(long accountNumber){
        long sum = 0;

        boolean isDoubled = false;
        while(accountNumber != 0L){
            if (isDoubled){
                long accountNumberDoubled = (accountNumber % 10) * 2;
                if (accountNumber > 10){
                    sum += accountNumberDoubled % 10 + accountNumberDoubled / 10;
                } else {
                    sum += accountNumberDoubled;
                }
            } else {
                sum += accountNumber % 10;
            }
            accountNumber /= 10;
            isDoubled = !isDoubled;
        }
        return sum;
    }

    public static boolean isValidCCNum(long accountNumber){
        return (sumDigits(accountNumber) % 10 == 0 && accountNumber > 1000000000000L);
    }

    public static void main(String[] args) {
        System.out.println(computeTax(30000, 2, false));
        System.out.println(computeTax(10000, 6, false));
        System.out.println(computeTax(75000, 1, false));
        System.out.println(computeTax(75000, 1, true));
        // call gross_income
        System.out.println(grossIncome(30000, 2, false));
        System.out.println(grossIncome(10000, 6, false));
        System.out.println(grossIncome(75000, 1, false));
        System.out.println(grossIncome(75000, 1, true));

        System.out.println(sumDigits(0L));
        System.out.println(isValidCCNum(0L));
        System.out.println(sumDigits(7994769871003L));
        System.out.println(isValidCCNum(7992739871003L));
        System.out.println(sumDigits(7992739871005L));
        System.out.println(isValidCCNum(7992739871005L));
    }

}
