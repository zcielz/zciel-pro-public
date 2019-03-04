package cn.zciel.effectiveJava.bookSecondEdition.chapter10;

import java.util.Objects;

/**
 * @author YINZHEN
 * @date 2019/2/25 19:59
 * @Description 重写equals方法时准守通用约定
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        if (obj instanceof String)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }
}
