package kz.kstu.epam.javalab.almasov.homeworks.second.var15.runner;

import kz.kstu.epam.javalab.almasov.homeworks.second.var15.entities.ReceiptManager;

import java.util.Locale;
import java.util.ResourceBundle;

public class Runner {

    public static void main( String[] args ) {

        Locale locale = Locale.getDefault();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("myRB", locale);

        StringBuilder telegramm = new StringBuilder(resourceBundle.getString("telegram"));
        ReceiptManager.printReceipt(telegramm);

        System.out.println("\n--------------------------------------------------------------------------------------\n");

        locale.setDefault(Locale.US);

        StringBuilder telegramm2 = new StringBuilder(resourceBundle.getString("telegram"));
        ReceiptManager.printReceipt(telegramm2);

    }

}
