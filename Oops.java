import java.util.Random;
import java.util.Scanner;

class Guesser {
    private int guessedNum;  // HAS-A Part 

    int guessNumber() {  // Does Part 
        Random rand = new Random();
        guessedNum = rand.nextInt(10); // Generates a number between 0 and 9
        System.out.println("Guesser has chosen a number!");
        return guessedNum;
    }
}

class Player {
    private int guessedNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player, please guess a number (0-9): ");
        guessedNum = sc.nextInt();
        return guessedNum;
    }
}

class Umpire {
    private int numFromGuesser;
    private int numFromPlayer1;
    private int numFromPlayer2;
    private int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    void compare() {
        System.out.println("The Guesser's number was: " + numFromGuesser);

        boolean isAnyPlayerWon = false;

        if (numFromPlayer1 == numFromGuesser) {
            System.out.println("Player 1 has guessed correctly!");
            isAnyPlayerWon = true;
        }
        if (numFromPlayer2 == numFromGuesser) {
            System.out.println("Player 2 has guessed correctly!");
            isAnyPlayerWon = true;
        }
        if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 3 has guessed correctly!");
            isAnyPlayerWon = true;
        }

        if (!isAnyPlayerWon) {
            System.out.println("No one guessed correctly. Game Over!");
        }
    }
}

public class Oops {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();

        // Collect number from Guesser
        umpire.collectNumFromGuesser();

        // Collect guesses from Players
        umpire.collectNumFromPlayers();

        // Compare the guesses
        umpire.compare();
    }
}
