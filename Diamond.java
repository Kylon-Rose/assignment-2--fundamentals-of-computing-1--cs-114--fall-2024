import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter a number.");
        int input = scanner.nextInt();
}

        if (input % 2 != 0){
        // Odd case
            int middle = input / 2;
        // Upper half
            for (int row = 0; row <= middle; row++) {
                for (int column = 0; column < middle - row; column++){
                    System.out.print(" ");
                }
    






