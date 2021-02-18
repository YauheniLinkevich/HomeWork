package HomeWork6.searchers;

import HomeWork6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private int mask;

    public void setFlag(int flag) {
        this.mask = flag;
    }

    @Override
    public long search(String text, String word) {
        int index = 0;
        long counter = 0;

        while (true) {
            index = text.indexOf(word, index);
            if (index != -1) {
                counter ++;
                index += word.length();
            } else {
                break;
            }
        }

        return counter;
    }
}
