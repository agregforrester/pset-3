import java.util.Scanner;

        public class bus {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Students : ");
                double students = in.nextDouble();
                in.nextLine();

                System.out.println("Teachers : ");
                double teachers = in.nextDouble();
                in.nextLine();

                System.out.println("Capacity : ");
                double capacity = in.nextDouble();
                in.nextLine();

                double total = students + teachers;
                double numberOfBuses = total / capacity;
                double remainder = total % capacity;

                System.out.println(" ");
                System.out.printf("Buses required      : %.0f", numberOfBuses);
                System.out.println(" ");
                System.out.printf("Overflow passengers : %.0f", remainder);
                in.close();
            }
        }