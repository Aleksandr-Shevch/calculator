import java.util.Scanner;

public class workSpace {
    public static java.util.Scanner result() {
        double num1;
        double num2;
        double answer;
        char a;

        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.print("������� ������ �����: ");
        num1 = reader.nextDouble();
        System.out.print("������� �������������� ����: ");
        a = reader.next().charAt(0);
        System.out.print("������� ������ ����� �����: ");
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
                    System.out.println("�����, ������ �� 0 ������");
                    break;
                }
                System.out.println(num1 + "/" + num2 + " = " + answer);
            default:
                System.out.println("error");
                break;
        }

        System.out.println("������� ��������, welldone!");
        return result();
    }
}