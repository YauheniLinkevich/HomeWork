package HomeWork6;

import HomeWork6.api.ISearchEngine;
import HomeWork6.searchers.EasySearch;
import HomeWork6.searchers.RegExSearch;
import HomeWork6.searchers.SearchEngineIgnoreCaseDecorator;
import HomeWork6.searchers.SearchEnginePunctuationNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        ///читает файл только по абсолютному пути
        String text = readFileToString("C:\\Users\\Yauheni\\IdeaProjects\\course\\JD1\\HomeWork\\src\\HomeWork6\\Война и мир_книга.txt");
        //String text = readFileToString("Война и мир_книга.txt");
        List<String> wordsList = parseText(text);
        Set<String> wordsSet = new HashSet<>(wordsList);
        System.out.println("wordsSet size: " + wordsSet.size()); //40616

        Map<String, Integer> wordsMap = makeMap(wordsList);
        System.out.println("wordMap size: " + wordsMap.size());//40616

        List<Map.Entry<String, Integer>> sortedList = sortByValueInDecreasingOrder(wordsMap);
        System.out.println("Top 10 words in text:");
        printRequiredAmountWords(sortedList, 10);

        ISearchEngine easySearch = new EasySearch();
        System.out.println("Encounters of word -Мир-:" + easySearch.search(text, "Мир"));//4
        System.out.println("Encounters of word -Война-:" + easySearch.search(text, "Война"));//6
        System.out.println("Encounters of word -И-:" + easySearch.search(text, "И"));//1252

        ISearchEngine regExSearch = new RegExSearch();
        System.out.println("Encounters of word -Мир-:" + regExSearch.search(text, "Мир"));//0
        System.out.println("Encounters of word -Война-:" + regExSearch.search(text, "Война"));//6
        System.out.println("Encounters of word -И-:" + regExSearch.search(text, "И"));//726

        ISearchEngine ignoreCaseSearcher = new SearchEngineIgnoreCaseDecorator(new RegExSearch());
        System.out.println("Encounters of word -Мир-:" + ignoreCaseSearcher.search(text, "Мир"));//33
        System.out.println("Encounters of word -Война-:" + ignoreCaseSearcher.search(text, "Война"));//52
        System.out.println("Encounters of word -И-:" + ignoreCaseSearcher.search(text, "И"));//14601

        ISearchEngine punctuationNormalaizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        System.out.println("Encounters of word -Мир-:" + punctuationNormalaizer.search(text, "Мир"));//4
        System.out.println("Encounters of word -Война-:" + punctuationNormalaizer.search(text, "Война"));//6
        System.out.println("Encounters of word -И-:" + punctuationNormalaizer.search(text, "И"));//1252
    }

    public static String readFileToString(String filePath) {
        String text = null;

        try
        {
            text = Files.readString(Path.of(filePath));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return text;
    }

    public static void printRequiredAmountWords(List<Map.Entry<String, Integer>> list, int border) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Word " + entry.getKey() + " - encounters " + entry.getValue() + " times");
            count++;
            if (count == border) {
                break;
            }
        }
    }

    public static List<String> parseText(String text) {
        /*Pattern pattern = Pattern.compile("[ !\\\"\\\\#$%&'()*+,(-*)./:;<=>?@\\\\[\\\\]^_`{|}~]+");
        String[] words = pattern.split(text);

        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            wordsList.add(word);
        }*/

        ///\\s*(([а-яА-ЯёЁ0-9]+)-*([а-яА-ЯёЁ0-9]+)*)\\s* - так же хватает пробелы
        String regex = "([а-яА-ЯёЁ0-9]+)-*([а-яА-ЯёЁ0-9])*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> wordsList = new ArrayList<>();
        while (matcher.find()) {
            wordsList.add(matcher.group());
        }

        return wordsList;
    }

    public static void printMap(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + " times");
        }
    }

    public static Map<String, Integer> makeMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            Integer currentWordCounter = map.get(s);
            if(currentWordCounter == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        return map;
    }

    public static List<Map.Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });

        return list;
    }
}
