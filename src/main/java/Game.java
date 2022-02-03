import java.io.*;
import java.util.*;

public class Game {

    String datasource;

    public Game() throws IOException {
        this.datasource = getWordFromFile(new File("src/main/resources/Woerter.txt"));
    }

    public GameResult gameLoop(String userInput){
        if (userInput.toUpperCase().equals(datasource.toUpperCase())){
            System.out.println("Du hast gewonnen!!!");
            System.exit(0);
        }
        String[] rightCharAndRightPosishining = findCharsOnRightPosishining(userInput);
        List<String> rightChars = findRightChars(userInput);
        return new GameResult(rightCharAndRightPosishining,rightChars);
    }

    private String[] findCharsOnRightPosishining(String userInput){

        String[] userInputAsArray = convertToArray(userInput);
        String[] wordelTextAsArray = convertToArray(datasource);

        String[] resultArray = new String[5];

        for (int i = 0;i < userInputAsArray.length; i++){
            if (Objects.equals(userInputAsArray[i], wordelTextAsArray[i])){
                resultArray[i] = wordelTextAsArray[i];
            }else {
                resultArray[i] = " ";
            }
        }
        return resultArray;
    }

    private List<String> findRightChars(String userInput){

        String[] userInputAsArray = convertToArray(userInput);
        String[] wordelTextAsArray = convertToArray(datasource);

        List<String> resultList = new ArrayList<>();

        for (int i = 0;i < wordelTextAsArray.length; i++){
            for (int k = 0;k < userInputAsArray.length; k++){
                if (Objects.equals(wordelTextAsArray[i], userInputAsArray[k]) && !resultList.contains(userInputAsArray[k])){
                    resultList.add(userInputAsArray[k]);
                    break;
                }
            }
        }
        Collections.shuffle(resultList);
        return resultList;
    }

    private String[] convertToArray(String input){
        String[] stringAsArray = input.split("");
        return stringAsArray;
    }

    public static String getWordFromFile(File file) throws FileNotFoundException
    {
        String result = null;
        Random rand = new Random();
        int n = 0;
        for(Scanner sc = new Scanner(file); sc.hasNext(); )
        {
            ++n;
            String line = sc.nextLine();
            if(rand.nextInt(n) == 0)
                result = line;
        }
        return result;
    }

    public void printWord() {
        System.out.println();
        System.out.println("Das word war: " + datasource);
    }
}
