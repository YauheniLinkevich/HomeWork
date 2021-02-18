package HomeWork6.searchers;

import HomeWork6.api.ISearchEngine;

import java.util.Locale;
import java.util.regex.Pattern;

public class SearchEngineIgnoreCaseDecorator implements ISearchEngine {
    private final ISearchEngine engine;

    public SearchEngineIgnoreCaseDecorator(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        if(engine instanceof RegExSearch) {
            ((RegExSearch) engine).setFlag(Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            return engine.search(text, word);
        } else {
            return engine.search(text.toLowerCase(Locale.ROOT), word.toLowerCase(Locale.ROOT));
        }
    }
}
