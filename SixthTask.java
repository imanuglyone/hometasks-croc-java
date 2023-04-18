import ru.croc.javaschool.threads.Matcher;

public class SixthTask {
    /**
     * Javadoc.
     * A program that counts spaces using the Matcher method.
     * @author Popov Danil
     */
    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
            " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой";

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < INPUT_STRING.length(); i++) {
            if (Matcher.match(String.valueOf(INPUT_STRING.charAt(i)), " ")) {
                count++;
            }
        }
        System.out.println("Number of spaces: " + count);
    }
}
