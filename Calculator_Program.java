import java.util.Scanner;

class Calculator_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user till theuser does not press X or x
        int result = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                //Input two numbers
                System.out.print("Enter the operands: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (ch == '%') {
                    result = num1 % num2;
                }
            } else if (ch == 'x' || ch == 'X'){
                break;
            } else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(result);
        }
        sc.close();
    }
}
