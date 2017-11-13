package kz.kstu.epam.javalab.almasov.homeworks.second.var15.entities;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ReceiptManager {

    private final static int COST_OF_ONE_WORD = 10;

    public static void printReceipt(StringBuilder sb){

        ResourceBundle resourceBundle = ResourceBundle.getBundle("myRB", Locale.getDefault());

        int numberOfWords = 0;
        int resultCost = 0;

        String[] words = sb.toString().split(" ");

        numberOfWords = words.length;
        resultCost = numberOfWords * COST_OF_ONE_WORD;

        System.out.println(resourceBundle.getString("telegram_word") + " '" + sb + "' " +
                resourceBundle.getString("contains_word") + " " + numberOfWords + " " + resourceBundle.getString("words_word"));

        System.out.println(resourceBundle.getString("the_cost_of_one_word") + " - " +
                NumberFormat.getCurrencyInstance(Locale.getDefault()).format(COST_OF_ONE_WORD));

        System.out.println(resourceBundle.getString("cost_of_this_telegram") + " - " +
                NumberFormat.getCurrencyInstance(Locale.getDefault()).format(resultCost));
    }



}
