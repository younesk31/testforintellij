import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    private final ArrayList<Integer> randomGeneratedNumbers;
    private int numbersToSet;

    public Lottery() {
        this.randomGeneratedNumbers = new ArrayList<>();
    }

    public void addNumbersToLottery(){
        Random rnd = new Random();
        while (randomGeneratedNumbers.size() < numbersToSet) {
            int rn = rnd.nextInt(10) + 1;
            if (!randomGeneratedNumbers.contains(rn)) {
                this.randomGeneratedNumbers.add(rn);
            }
        }
        System.out.println("Lotto nummre: \t"+randomGeneratedNumbers);
    }

    public int lotteryGuess(ArrayList<Integer> guess){
        int match = 0;
        for (int i = 0; i < guess.size(); i++) {
            if(randomGeneratedNumbers.contains(guess.get(i))){
                match++;
            }
        }
        if (match > 0) {
            System.out.println("\n"+match+" Match! - "+"Gevinst udregning = ("+match+"·"+match+")"+" = "+match*match+"·100"+" = "+(match*match)*100);
        } else {
            System.out.println("Ingen match desværre :(");
        }
        return (match*match)*100;
    }

    public void setNumbersToSet(int numbersToSet) {
        this.numbersToSet = numbersToSet;
    }
}
