package lesson7.homeWork;

public class task7_4 {
    public static void main(String[] args) {
        int userGuess= 10;
        int magicNumber =10;
        int maxAttempts=6;
        int counter = 3;

        int totalPayout=0;
        int  payaut= 200;
        int  prizeCounter=0;
        if (userGuess==magicNumber){ prizeCounter= maxAttempts-counter;
            totalPayout=prizeCounter*payaut;}
        System.out.println( "Your payout  - " + totalPayout);


    }
}
