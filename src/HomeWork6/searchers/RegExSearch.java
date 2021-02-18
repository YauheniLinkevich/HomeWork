package HomeWork6.searchers;

import HomeWork6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    private int mask;

    public void setFlag(int flag) {
        this.mask = flag;
    }

    @Override
    public long search(String text, String word) {
        long counter = 0;
        String regex = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(regex, mask);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            counter++;
        }

        return counter;
    }
}
