package HomeWork6.searchers;

import HomeWork6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        String stringWithoutPunctuation = text.replaceAll("\\p{Punct}", "");
        return engine.search(stringWithoutPunctuation, word);
    }
}
