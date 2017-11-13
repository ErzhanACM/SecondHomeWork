package kz.kstu.epam.javalab.almasov.homeworks.second.var4.entity;

import java.util.ResourceBundle;

public class TextManager {
    public static StringBuilder insertSubString(StringBuilder string, String subString, int symbolIndex) {
        string.insert(symbolIndex, subString);
        return string;
    }
}
