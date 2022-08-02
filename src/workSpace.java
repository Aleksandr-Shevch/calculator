import java.util.InputMismatchException;
import java.util.Scanner;

public class workSpace {
    public static java.util.Scanner result()throws InputMismatchException {
        double num1;
        double num2;
        double answer;
        char a;

        try {
            java.util.Scanner reader = new java.util.Scanner(System.in);
            System.out.print("Enter first number: ");
            num1 = reader.nextDouble();
            System.out.print("Enter mathematical sign: ");
            a = reader.next().charAt(0);
            System.out.print("Enter second number: ");
            num2 = reader.nextDouble();
            switch (a) {
                case '+':
                    answer = num1 + num2;
                    System.out.println(num1 + "+" + num2 + " = " + answer);
                    break;
                case '-':
                    answer = num1 - num2;
                    System.out.println(num1 + "-" + num2 + " = " + answer);
                    break;
                case '*':
                    answer = num1 * num2;
                    System.out.println(num1 + "*" + num2 + " = " + answer);
                    break;
                case '/':
                    answer = num1 / num2;
                    if (num2 == 0) {
                        System.out.println("can't divide by zero");
                        break;
                    }
                    System.out.println(num1 + "/" + num2 + " = " + answer);
                default:
                    System.out.println("error");
                    break;
            }
        }
        catch(InputMismatchException e){
                System.out.println("Numbers only!  ");
            }
        System.out.println("Finishing!");
        System.out.println("You can repeat operation below: ");
        return result();
        }
    }