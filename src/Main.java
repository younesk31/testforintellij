import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast de numre du vil have i lotteriet!");
        for (int i = 0; i < 5; i++) {
            int in = input.nextInt();
            myNums.add(in);
        }

        Lottery l = new Lottery();
        l.setNumbersToSet(5);
        l.addNumbersToLottery();
        System.out.println("Mine gæt:\t\t"+ myNums);
        System.out.println("Gevinst: "+l.lotteryGuess(myNums)+" kr");

    }
}
