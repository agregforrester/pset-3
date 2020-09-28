import java.util.Scanner;

        public class coins {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Amount : ");
                double amount = in.nextDouble();

                double quarterNumber = amount / 0.25;
                int realQuarterNumber = (int) quarterNumber;
                double amountAfterQuarters = amount - (realQuarterNumber * 0.25);

                double dimeNumber = amountAfterQuarters / 0.1;
                int realDimeNumber = (int) dimeNumber;
                double amountAfterDimes = amountAfterQuarters - (realDimeNumber * 0.1);

                double nickelNumber = amountAfterDimes / 0.05;
                int realNickelNumber = (int) nickelNumber;
                double amountAfterNickels = amountAfterDimes - (realNickelNumber * 0.05);

                double pennyNumber = amountAfterNickels / 0.01;
                int realPennyNumber = (int) pennyNumber;

                System.out.println(" ");
                System.out.println("Quarters : " + realQuarterNumber);
                System.out.println("Dimes : " + realDimeNumber);
                System.out.println("Nickels : " + realNickelNumber);
                System.out.println("Pennies : " + realPennyNumber);
                in.close();
            }
        }