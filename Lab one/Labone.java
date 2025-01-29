// Code to calculate factorial of a number and print a series
public class Labone {

        public int calFactorial(int number) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    
        public void printSeries(int length) {
            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            Labone lab = new Labone();
            int number = 5;
            int result = lab.calFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
    
            int seriesLength = 5;
            System.out.println("Series:");
            lab.printSeries(seriesLength);
        }
    }
    
