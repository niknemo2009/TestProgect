package lambda;

ВРОДЕ РАБОТАЕТ. НО КАК-ТО КОРЯВЕНЬКО, ПО МОЕМУ.

public class LambdaFunctionInter {
    int x = 9;
    int y = 5;
    void sum(LambdaOne sumLam){
        System.out.println(x+y);
    }

    public static void main(String[] args) {


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
