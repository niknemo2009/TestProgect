package lambda;

//ВРОДЕ РАБОТАЕТ. НО КАК-ТО КОРЯВЕНЬКО, ПО МОЕМУ.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFunctionInter {
    int x = 9;
    int y = 5;

    void sum(LambdaOne sumLam) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        TestLamb tl=new TestLamb();
        int[]  arr={1,2,3,4,5,6,7,8,9,11};
        System.out.println(Arrays.toString(tl.filtr(arr,(w)-> w % 2 == 0)));


//        LambdaOne one = (x, y) -> {
//            System.out.println("sdds");
//            return x + y;
//        };
//
//        LambdaTwo two = (x, y) -> {
//            return x.trim();
//        };
//
//        ClassLamThree ololo = new ClassLamThree();
//        ololo.arrOlolo(new int[]{5, 8, 9, 10});
//
//        ClassLamTwo x = new ClassLamTwo();
//        System.out.println(x.trimX("    5 4 4   ", 5));
//
//        LambdaFunctionInter lamb1 = new LambdaFunctionInter();
//        lamb1.sum(new LambdaOne() {
//            @Override
//            public int sum(int x, int y) {
//                return x + y;
//            }
//        });
    }

}

@FunctionalInterface
interface LambdaOne {
    int sum(int x, int y);
}

@FunctionalInterface
interface LambdaTwo {
    String trimX(String x, int y);
}

@FunctionalInterface
interface LambdaThree {
    void arrOlolo(int[] ololo);
}

@FunctionalInterface
interface LambdaMoreFive {

    int[] moreFive(int[] ololo);

    default int[] isMore(int[] ololo) {
        int[] ololoMore = new int[ololo.length];
        for (int i = 0; i > ololo.length; i++) {
            if (ololo[i] > 5) {
                ololoMore[i] = ololo[i];
            }
        }
        return ololoMore;
    }
}

class MoreFive implements LambdaMoreFive {

    @Override
    public int[] moreFive(int[] ololo) {
        return new int[0];
    }

}

class ClassLamTwo implements LambdaTwo {

    @Override
    public String trimX(String x, int y) {
        return x.trim();
    }
}

class ClassLamThree implements LambdaThree {

    @Override
    public void arrOlolo(int[] ololo) {
        for (int temp : ololo) {
            System.out.println(temp);
        }
    }
}

interface Condition {
    boolean equ(int element);
}

class TestLamb {


    Integer[] filtr(int[] arr, Condition condition) {

        List<Integer> arrList = new ArrayList<>();
        for (int temp : arr) {
            if (condition.equ(temp)) {
                arrList.add(temp);
            }
        }

        Integer[] result = new Integer[arrList.size()];
        return arrList.toArray(result);
    }
}