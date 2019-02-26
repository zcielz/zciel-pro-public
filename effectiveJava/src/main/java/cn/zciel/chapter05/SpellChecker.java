package cn.zciel.chapter05;

import java.util.List;
import java.util.Objects;

/**
 * @author YINZHEN
 * @date 2019/2/25 18:59
 * @Description 使用依赖注入取代硬连接资源
 */
public class SpellChecker {

    private final Lexicon dictionary;


    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {

        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }

}
