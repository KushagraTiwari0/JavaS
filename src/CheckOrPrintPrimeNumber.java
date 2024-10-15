import java.util.Scanner;

public class CheckOrPrintPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check if a number is prime");
            System.out.println("2. Print prime numbers in a range");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (isPrime(number)) {
                        System.out.println(number + " is a prime number.");
                    } else {
                        System.out.println(number + " is not a prime number.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter the start of the range: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end of the range: ");
                    int end = scanner.nextInt();
                    System.out.println("Prime numbers in the range:");
                    for (int num = start; num <= end; num++) {
                        if (isPrime(num)) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please select 1, 2, or 0.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
