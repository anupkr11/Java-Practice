import java.util.Scanner;
import java.util.Random;

class Game {
    int number , computer, noOfGuess = 0;

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    Game() {
        Random rand = new Random();
        this.computer = rand.nextInt(100);
        System.out.println(computer);
    }

   void takeUserInput() {
        System.out.println("Guess the number");
        try (Scanner scan = new Scanner(System.in)) {
            scan.nextInt();
        }
    }

    boolean isCorrectNumber(){
        noOfGuess ++;
        if (number==computer){
            System.out.format("Right Guess , the number was %d \n in %d attempts",computer, noOfGuess);
            return true;
        }
        if(number < computer){
            System.out.println("Number is less than the actual number");
        }
        if(number > computer){
            System.out.println("Number is more than the actual number");
        }

        return false;

    }

}
public class guess_the_number {
    public static void main(String[] args) {
        Game gm = new Game();
        boolean b = false;
        while(!b){
            gm.takeUserInput();
            b = gm.isCorrectNumber();
            System.out.println(b);
        }
    }

}