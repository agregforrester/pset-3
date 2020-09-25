import java.util.Scanner;

        public class wage {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Wage : ");
                double wage = in.nextDouble();
                in.nextLine();

                System.out.println("Monday : ");
                double monday = in.nextDouble();
                in.nextLine();

                System.out.println("Tuesday : ");
                double tuesday = in.nextDouble();
                in.nextLine();

                System.out.println("Wednesday : ");
                double wednesday = in.nextDouble();
                in.nextLine();

                System.out.println("Thursday : ");
                double thursday = in.nextDouble();
                in.nextLine();

                System.out.println("Friday : ");
                double friday = in.nextDouble();
                in.nextLine();

                System.out.println("Saturday : ");
                double saturday = in.nextDouble();
                in.nextLine();

                System.out.println("Sunday : ");
                double sunday = in.nextDouble();

                double finalWage = (wage * monday) + (wage * tuesday) + (wage * wednesday) + (wage * thursday) + (wage * friday) + (wage * saturday) + (wage * sunday);

                System.out.println(" ");
                System.out.printf("$%.2f", finalWage); System.out.println(".");
                in.close();
            }
        }