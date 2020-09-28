import java.util.Scanner;

        public class temperature {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Fahrenheit : ");
                double fahrenheit = in.nextDouble();

                double celsius = ((fahrenheit - 32) * 5) / 9;
                double kelvin = celsius + 273.15;

                System.out.println(" ");
                System.out.printf("Celsius : %.2f", celsius);
                System.out.println(" ");
                System.out.printf("Kelvin : %.2f", kelvin);
                in.close();
            }
        }