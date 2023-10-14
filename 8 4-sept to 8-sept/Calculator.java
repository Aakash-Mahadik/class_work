import java.util.Scanner;

class Calc {
    public void add(double[] arr) {
        double addSum = 0;
        for (double i : arr) {
            addSum += i;
        }
        System.out.println("Result: " + addSum);
    }

    public void sub(double[] arr) {
        if (arr != null) {
            double subResult = arr[0];
            for (int i = 1; i < arr.length; i++) {
                subResult -= arr[i];
            }
            System.out.println("Result: " + subResult);
        } else {
            System.out.println("Invalid input for subtraction.");
        }
    }

    public void mul(double[] arr) {
        double mulResult = 1;
        for (double i : arr) {
            mulResult *= i;
        }
        System.out.println("Result: " + mulResult);
    }

    public void div(double[] arr) {
        if (arr != null) {
            double divResult = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    divResult /= arr[i];
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
            }
            System.out.println("Result: " + divResult);
        } else {
            System.out.println("Invalid input for division.");
        }
    }

    public double[] convert(String input) {
        String[] string = input.split(" ");
        double[] arr = new double[string.length];

        for (int i = 0; i < string.length; i++) {
            arr[i] = Double.valueOf(string[i]);
        }
        return arr;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();
        boolean flag = true;

        while (flag) {
            System.out.println("Enter choice: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            double [] arr;
            switch (choice) {
                case 1:
                    System.out.print("Enter numbers separated by spaces: ");
                    String input = sc.nextLine();
                    arr = c.convert(input);
                    c.add(arr);
                    break;
                case 2:
                    System.out.print("Enter numbers separated by spaces: ");
                    input = sc.nextLine();
                    arr = c.convert(input);
                    c.sub(arr);
                    break;
                case 3:
                    System.out.print("Enter numbers separated by spaces: ");
                    input = sc.nextLine();
                    arr = c.convert(input);
                    c.mul(arr);
                    break;
                case 4:
                    System.out.print("Enter numbers separated by spaces: ");
                    input = sc.nextLine();
                    arr = c.convert(input);
                    c.div(arr);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        sc.close();
    }
}
