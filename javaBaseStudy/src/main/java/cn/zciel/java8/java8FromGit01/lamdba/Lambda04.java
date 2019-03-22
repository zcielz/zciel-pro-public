package cn.zciel.java8.java8FromGit01.lamdba;

/**
 * @author YINZHEN
 * @date 2019/3/22 17:13
 * @Description
 */
public class Lambda04 {

    static int outerStaticNum;

    int outerNum;

    void testScopes() {
        int num = 1;

        Lambda02.Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        String convert = stringConverter.convert(2);
        System.out.println(convert);

        Lambda02.Converter<Integer, String> stringConverter2 =
                (from) -> {
                    outerNum = 13;
                    return String.valueOf(from);
                };

        String[] array = new String[1];
        Lambda02.Converter<Integer, String> stringConverter3 =
                (from) -> {
                    array[0] = "Hi there";
                    return String.valueOf(from);
                };

        String convert1 = stringConverter3.convert(23);
        System.out.println(convert1);
        System.out.println(array[0]);

    }

    public static void main(String[] args) {
        new Lambda04().testScopes();
    }

}
