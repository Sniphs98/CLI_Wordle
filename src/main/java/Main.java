import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        UserInAndOutput userInAndOutput = new UserInAndOutput();

        for(int i = 4; i >= 0;i--) {

            userInAndOutput.consolInput();
            System.out.println();
            System.out.println("Noch " + i +" versuche");
        }
        userInAndOutput.getGameObject().printWord();
    }
}
