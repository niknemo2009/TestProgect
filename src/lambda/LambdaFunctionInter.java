package lambda;

public class LambdaFunctionInter {
    int x = 9;
    int y = 5;
    void sum(LambdaOne sumLam){
        System.out.println(x+y);
    }

    public static void main(String[] args) {


        ClassLamTwo x = new ClassLamTwo();
        System.out.println(x.trimX("    5 4 4   ", 5));

        LambdaFunctionInter lamb1 = new LambdaFunctionInter();
        lamb1.sum(new LambdaOne(){

            @Override
            public int sum(int x, int y) {
                return x+y;
            }
        });
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
    int sum(String x, int y);
}


        class ClassLamTwo implements LambdaTwo{

            @Override
            public String trimX(String x, int y) {
                return x.trim();
            }
        }