package ivyclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println("Nice to meet you, " + userName);
        String inputString = "";
        System.out.println("Where would you like to sail?");
        inputString = scan.nextLine();
        System.out.println("You have begun your journey to " + inputString);
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        while (inputString != "quit") {
            System.out.println("You begin to feel hungry do you fish or look for shore?");
            inputString = scan.nextLine();
            System.out.println("You try to " + inputString);
            if (inputString.contains("fish")) {
                System.out.println("Food finds you slowly, but you survive for now.");
            } else {
                if (Math.random() > 0.7) {
                    // find land
                    System.out.println("You find an island in the ocean.");
                    System.out.println("Do you land or move on?");
                    inputString = scan.nextLine();
                    if (inputString.contains("land")) {
                        if (Math.random() > 0.5) {
                            System.out.println("It's a mirage, you fall off the edge of the world.");
                            inputString = "quit";
                        } else {
                            System.out.println("You live happily ever after on a tropical island.");
                        }
                    } else {
                        System.out.println("You sail on.");
                    }
                } else {
                    // no land
                    System.out.println("You find no land, but many sharks and dolphins.");
                }
            }
        }

    }
}
