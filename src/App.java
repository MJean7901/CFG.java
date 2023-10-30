import java.util.Scanner;

public class App {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rings: ");
        int n = scanner.nextInt();
        scanner.close();

        long startTime = System.nanoTime();
        towerOfHanoi(n, 'A', 'C', 'B');
        long endTime = System.nanoTime();

        double timeTaken = (endTime - startTime) / 1e9; // Convert to seconds

        System.out.println("Time taken: " + timeTaken + " seconds");
    }
}
