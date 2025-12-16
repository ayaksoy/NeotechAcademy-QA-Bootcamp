package lesson06;

public class LogicalOR {
    // Define an exam score
    // If the score is less than 0 or greater than 100, say 'wrong score'
    public static void main(String[] args) {

        int score = 100;

        if (score < 0 || score > 100) {
            System.out.println("Wrong score");
        } else {
            System.out.println("Your score is " + score);
        }

    }

}