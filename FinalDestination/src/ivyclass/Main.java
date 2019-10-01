package ivyclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username!");
        String userName = scan.nextLine();
        System.out.println("Username is: " + userName);
        String inputString = "";
        while (!inputString.equals("quit")) {
            System.out.println("Where would you like to go?");
            inputString = scan.nextLine();
            System.out.println(inputString + " is beautiful this time of year!");
            if (Math.random() > 0.9) {
                System.out.println("Unfortunately your plane was delayed so you won'y be making it to " + inputString);
                inputString = "quit";
            }
        }
    }
}
