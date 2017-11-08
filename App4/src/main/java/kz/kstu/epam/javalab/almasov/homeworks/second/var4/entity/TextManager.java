package kz.kstu.epam.javalab.almasov.homeworks.second.var4.entity;

public class TextManager {
    public static StringBuilder insertSubString(StringBuilder sb, String txt, int symbol) {
        sb.insert(symbol, txt);
        return sb;
    }
}
