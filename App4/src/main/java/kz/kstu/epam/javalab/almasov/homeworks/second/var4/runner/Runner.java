package kz.kstu.epam.javalab.almasov.homeworks.second.var4.runner;

import kz.kstu.epam.javalab.almasov.homeworks.second.var4.entity.TextManager;

import java.util.Locale;
import java.util.ResourceBundle;

public class Runner {

    public static void main(String[] args) {

        Locale.setDefault(Locale.GERMANY);

        ResourceBundle deafultBundle = ResourceBundle.getBundle("myRB");
        ResourceBundle russianBundle = ResourceBundle.getBundle("myRB", new Locale("ru", "RU"));
        ResourceBundle englishBundle = ResourceBundle.getBundle("myRB", Locale.US );
        ResourceBundle frenchBundle = ResourceBundle.getBundle("myRB", Locale.FRANCE);

        StringBuilder defaultText = new StringBuilder(deafultBundle.getString("my_text"));
        String defaultSubString = new String(deafultBundle.getString("subString"));
        System.out.println(TextManager.insertSubString(defaultText, defaultSubString, 2));

        StringBuilder russianText = new StringBuilder(russianBundle.getString("my_text"));
        String russianSubString = new String(russianBundle.getString("subString"));
        System.out.println(TextManager.insertSubString(russianText, russianSubString, 2));

        StringBuilder englishText = new StringBuilder(englishBundle.getString("my_text"));
        String englishSubString = new String(englishBundle.getString("subString"));
        System.out.println(TextManager.insertSubString(englishText, englishSubString, 2));

        StringBuilder frenchText = new StringBuilder(frenchBundle.getString("my_text"));
        String frenchSubString = new String(frenchBundle.getString("subString"));
        System.out.println(TextManager.insertSubString(frenchText, frenchSubString, 2));
    }
}
