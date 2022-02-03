import java.util.List;

public class GameResult {

    public GameResult(String[] rightCharsAndPoischining, List<String> rightChars) {
        RightCharsAndPoischining = rightCharsAndPoischining;
        RightChars = rightChars;
    }

    public String[] RightCharsAndPoischining;
    public List<String> RightChars;

    public String[] getRightCharsAndPoischining() {
        return RightCharsAndPoischining;
    }

    public void setRightCharsAndPoischining(String[] rightCharsAndPoischining) {
        RightCharsAndPoischining = rightCharsAndPoischining;
    }

    public List<String> getRightChars() {
        return RightChars;
    }

    public void setRightChars(List<String> rightChars) {
        RightChars = rightChars;
    }
}
