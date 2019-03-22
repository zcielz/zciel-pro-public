package cn.zciel.java8.java8FromGit01.lamdba;


/**
 * @author YINZHEN
 * @date 2019/3/22 16:01
 * @Description
 */
public class Interface01 {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double calculate = formula.calculate(100);
        double sqrt = formula.sqrt(-23);
        int positive = Formula.positive(-4);
        System.out.println(calculate + ".." + sqrt + ".." + positive);


//        Formula formula2 = (a) -> sqrt(a * 100);
    }
}
