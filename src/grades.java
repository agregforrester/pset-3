import java.util.Scanner;

        public class grades {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Homework 1 : ");
                double homework1 = in.nextDouble();
                in.nextLine();

                System.out.println("Homework 2 : ");
                double homework2 = in.nextDouble();
                in.nextLine();

                System.out.println("Homework 3 : ");
                double homework3 = in.nextDouble();
                in.nextLine();

                System.out.println("Quiz 1 : ");
                double quiz1 = in.nextDouble();
                in.nextLine();

                System.out.println("Quiz 2 : ");
                double quiz2 = in.nextDouble();
                in.nextLine();

                System.out.println("Test 1 : ");
                double test1 = in.nextDouble();

                double finalGrade = (((homework1 + homework2 + homework3) / 3) * .15) + (((quiz1 + quiz2) / 2) * .35) + (test1 * .5);

                System.out.println(" ");
                System.out.printf("%.2f", finalGrade); System.out.println("%.");
                in.close();
            }
        }