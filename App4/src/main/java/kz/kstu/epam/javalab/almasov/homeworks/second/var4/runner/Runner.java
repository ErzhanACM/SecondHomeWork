package kz.kstu.epam.javalab.almasov.homeworks.second.var4.runner;

import kz.kstu.epam.javalab.almasov.homeworks.second.var4.entity.TextManager;

public class Runner {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("LONDON");
        System.out.println(TextManager.insertSubString(text, "milan", 3));
    }
}
