import java.util.Scanner;

        public class area {
                public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);

                    System.out.println("Height : ");
                    double height = in.nextDouble();
                    in.nextLine();

                    System.out.println("Width : ");
                    double width = in.nextDouble();

                    double area = ((height *25.4) * (width * 25.4));
                    
                    System.out.println(" ");
                    System.out.printf("%,.2f", area); System.out.println(" square millimeters.");
                    in.close();
                }
        }
