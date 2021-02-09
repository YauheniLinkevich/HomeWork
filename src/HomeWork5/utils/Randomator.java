package HomeWork5.utils;

import HomeWork5.utils.api.IRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Randomator implements IRandom {

    String charsConsonants = "бвгджзклмнпрстфхцчшщ";
    String charsVowels = "аеёиоуэюя";
    List<String> normalNames;

    public Randomator() {
        normalNames = new ArrayList<>();
        normalNames.add("Влад");
        normalNames.add("Лена");
        normalNames.add("Мария");
        normalNames.add("Егор");
        normalNames.add("Виталик");
        normalNames.add("Дима");
        normalNames.add("Валера");
        normalNames.add("Саша");
        normalNames.add("Юля");
        normalNames.add("Алена");
        normalNames.add("Денис");
        normalNames.add("Арсен");
    }

    @Override
    public int randInt(int lowerBorder, int upperBorder) {
        return ThreadLocalRandom.current().nextInt(lowerBorder, upperBorder);
    }

    @Override
    public double randDouble(double lowerBorder, double upperBorder) {
        return ThreadLocalRandom.current().nextDouble(lowerBorder, upperBorder);
    }

    @Override
    public String randString(int lowerBorder, int upperBorder, int randomType) {
        String name = "";
        switch(randomType) {
            case 0:
                name = randomName();
                break;
//            case 1:
//                name = randomNormalName();
//                break;
//            case 2:
//                name = randomNormalNameFromFile();
//                break;
            default:
                break;
        }
        return name;
    }

    @Override
    public boolean randBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    public String randomName() {
        String name = "";

        for(int i= 0; i < ThreadLocalRandom.current().nextInt(3, 6); i++) {
            if(ThreadLocalRandom.current().nextBoolean()) {
                name += charsVowels.charAt(ThreadLocalRandom.current().nextInt(0, 7));
            } else {
                name += charsConsonants.charAt(ThreadLocalRandom.current().nextInt(0, 20));
            }
        }

        return name;
    }
/**
 * TODO:random normal names and random normal names from files
 */
//    public String randomNormalName() {
//        String string;
//        boolean isNameCreated = false;
//
//        while(!isNameCreated) {
//            for(int i = 0; i < ThreadLocalRandom.current().nextInt(3, 7); i++) {
//
//            }
//        }
//
//        return string;
//    }

//    public String randomNormalNameFromFile() {
//        String string;

//        return string;
//    }
}
