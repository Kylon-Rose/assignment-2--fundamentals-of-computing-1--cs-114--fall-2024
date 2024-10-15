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
    

                for (int column = 0; column < 2 * row + 1; column++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        // Lower half
            for (int row = middle - 1; row >= 0; row--) {
                for (int column = 0; column < middle - row; column++) {
                    System.out.print(" ");
                }

                for (int column = 0; column < 2 * row + 1; column++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {
        // Even Case
            int middle = input / 2;
            int spaces = input;
        //Upper Half
            for (int column = 0; column < spaces - 1; column++) {
                System.out.print(" ");
            }
            System.out.println("*");

            for (int row = 1; row < middle; row++) {
                for (int column = 0; column < spaces - row * 2; column++) {
                    System.out.print(" ");
                }
                
                for (int column = 0; column < 2 * row; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        
        //Middle Half
            for (int column = 0; column < input; column++) {
                System.out.print("* ");
            }
            System.out.println();
        

