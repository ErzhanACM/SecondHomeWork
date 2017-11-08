package kz.kstu.epam.javalab.almasov.homeworks.second.var15.entities;

public class ReceiptManager {

    private final static int COST_OF_ONE_WORD = 10;

    public static void printReceipt(StringBuilder sb){

        int numberOfWords = 0;
        int resultCost = 0;

        String[] words = sb.toString().split(" ");

        numberOfWords = words.length;
        resultCost = numberOfWords * COST_OF_ONE_WORD;

        System.out.println("Telegram - " + sb + " contains " + numberOfWords + " words");
        System.out.println("The cost of one word - " + COST_OF_ONE_WORD + " dollars");
        System.out.println("Cost of this telegram - " + resultCost + " dollars");
    }

}
