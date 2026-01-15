import java.util.Scanner;

public class NumberConverter {

    static void decimalToBinary(int num) {
        System.out.println("Binary: " + Integer.toBinaryString(num));
    }

    static void binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);
    }

    static void decimalToHex(int num) {
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nNumber Converter");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Decimal to Hexadecimal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter decimal number: ");
                    int dec = sc.nextInt();
                    decimalToBinary(dec);
                    break;

                case 2:
                    System.out.print("Enter binary number: ");
                    String bin = sc.next();
                    binaryToDecimal(bin);
                    break;

                case 3:
                    System.out.print("Enter decimal number: ");
                    int hex = sc.nextInt();
                    decimalToHex(hex);
                    break;

                case 4:
                    System.out.println("Exiting converter.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
