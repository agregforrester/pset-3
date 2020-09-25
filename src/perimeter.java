import java.util.Scanner;

        public class perimeter {
                public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);

                    System.out.println("Height : ");
                    double height = in.nextDouble();
                    in.nextLine();

                    System.out.println("Width : ");
                    double width = in.nextDouble();

                    double perimeter = (2 * height * 2.54) + (2 * width * 2.54);

                    System.out.println(" ");
                    System.out.printf("%,.2f", perimeter); System.out.println(" square centimeters.");
                    in.close();
             }
        }