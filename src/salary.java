import java.util.Scanner;

        public class salary {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Salary : ");
                double salary = in.nextDouble();
                in.nextLine();

                System.out.println("401(k) : ");
                double fourZeroOneK = in.nextDouble();
                in.nextLine();

                System.out.println("Federal : ");
                double federal = in.nextDouble();
                in.nextLine();

                System.out.println("State : ");
                double state = in.nextDouble();

                double payCheck = salary/24;
                double retirement = payCheck - (payCheck * (fourZeroOneK / 100));

                double federalTax = (retirement * (federal / 100));
                double stateTax = (retirement * (state / 100));
                double finalResult = retirement - federalTax - stateTax;

                System.out.println(" ");
                System.out.printf("$%,.2f", finalResult); System.out.println(".");
                in.close();
            }
        }