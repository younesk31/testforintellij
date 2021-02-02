import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lottery l = new Lottery();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myNums = new ArrayList<>();

        System.out.println("Indtast de numre du vil have i lotteriet!");
        for (int i = 0; i < 4; i++) {
            int in = input.nextInt();
            myNums.add(in);
        }

        l.setNumbersToSet(4);
        l.addNumbersToLottery();
        System.out.println("Mine gæt:\t\t"+ myNums);
        System.out.println("Gevinst: "+l.lotteryGuess(myNums)+" kr");
    }
}
