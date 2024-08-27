package challenges2;

import java.util.Scanner;

public class ASCIIconverter {

    // Define the constant for space character ASCII value
    private static final int SPACE_CHAR = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption;
        String userName, charToASCII;
        
        do {
            System.out.println("\nASCII Converter Menu................");
            System.out.println("1. Show ASCII Table");
            System.out.println("2. Convert a Character to ASCII");
            System.out.println("3. Convert your name to ASCII");
            System.out.println("4. Quit");

            System.out.println("Enter a number and return");

            // get a user's option
            userOption = scanner.nextInt();
            scanner.nextLine(); // this clears out the return character (nextInt takes just the int entered)

            switch (userOption) {
                case 1:
                    System.out.println("ASCII Table");
                    for (int loop = 32; loop <= 128; loop++) {
                        System.out.println(loop + "\t " + (char) loop);
                    }
                    break;
                case 2:
                    System.out.println("Enter character to see the ASCII value");
                    charToASCII = scanner.next();
                    // now get the first char
                    char character = charToASCII.charAt(0);
                    System.out.println(character + "\t \t " + (int) character);
                    break;
                case 3:
                    System.out.println("Enter your name ");
                    userName = scanner.nextLine();
                    System.out.println("ASCII \t");
                    for (int loop = 0; loop < userName.length(); loop++) {
                        // ignoring any space characters
                        if ((int) userName.charAt(loop) != SPACE_CHAR) {
                            System.out.print((int) userName.charAt(loop) +
                                    "\t" + userName.charAt(loop) + "\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Quitting");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (userOption != 4);
        
        scanner.close();
    }
}
