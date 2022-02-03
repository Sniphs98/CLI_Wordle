import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInAndOutput {
    public Scanner scanner;
    public Game game;
    public UserInAndOutput() throws IOException {
        this.scanner = new Scanner(System.in);
        this.game = new Game();
    }

    public void consolInput() {

        String uersInput;
        System.out.println();
        do {
            System.out.println("Bitte geben sie ein Word mit 5 Stellen an");
            uersInput = scanner.nextLine();

            uersInput.toUpperCase();
        }while (uersInput.length() != 5);


        GameResult result = game.gameLoop(uersInput);
        consolOutput(result.getRightCharsAndPoischining(),result.getRightChars());

    }

    public void consolOutput(String[] rightCharAndRightPositoning, List<String> rightChars) {

        printFullHits(rightCharAndRightPositoning);
        printOnlyRightChars(rightChars);

    }

    public void printOnlyRightChars(List<String> rightChars){
        System.out.print("    ");
        for (String stringChar:rightChars) { // :D
            System.out.print(stringChar);
        }

    }

    public void printFullHits(String[] inputArray){
        System.out.print("|");
        for(int i = 0;i < inputArray.length; i++){
            if(inputArray[i] != null) {
                System.out.print(inputArray[i]);
                System.out.print("|");
            }
        }
    }

    public Game getGameObject() {
        return this.game;
    }
}
