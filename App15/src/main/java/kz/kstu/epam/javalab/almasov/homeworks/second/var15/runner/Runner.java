package kz.kstu.epam.javalab.almasov.homeworks.second.var15.runner;

import kz.kstu.epam.javalab.almasov.homeworks.second.var15.entities.ReceiptManager;

public class Runner {

    public static void main( String[] args ) {
        StringBuilder telegramm = new StringBuilder("Erzhan Almasov did second home work");
        ReceiptManager.printReceipt(telegramm);
    }

}
