
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author User
 */
public class Proba {

    public List<Integer> list2 = new ArrayList();

    ArrayList<Integer> addList(int start, int stop) {
        ArrayList<Integer> result = new ArrayList<>();
        int start1, stop1;
        start1 = (start < stop ? start : stop);
        stop1 = (stop < start ? start : stop);

        for (int i = start1; i <= stop1; i++) {
                result.add(i);
            }

//        if (start < stop) {
//            for (int i = start; i <= stop; i++) {
//                result.add(i);
//            }
//        } else {
//            for (int i = stop; i <= start; i++) {
//                result.add(i);
//            }
//        }

        return result;
    }

    void rabotaDiaposonov(int p1,int p1_1,int p2,int p2_2){
        ArrayList<Integer> list1 = addList(p1, p1_1);
        ArrayList<Integer> list2 = addList(p2, p2_2);
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer temp: list1){
            for (Integer temp1: list2) {
                if(temp.equals(temp1)){
                    result.add(temp);
                    break;
                }
            }
        }
        System.out.println(result);
    }

//        Proba pr=new Proba();
//        System.out.println("Это решение задачи по поиску пересечения диапазонов - "+Arrays.toString(pr.commonElement(11,1,133,-1)));
//        int[] test=pr.spisokElementov(15, 29);
//        int[] test1=pr.spisokElementov(25, 40);
//        System.out.println(Arrays.toString(test));
//        System.out.println(Arrays.toString(test1));
//        int[]  union=pr.unionArrays(test,test1);
//        System.out.println(Arrays.toString(union));
//        System.out.println(pr.calculateDubli(union));


//    int[] commonElement(int period1,int period1_1,int period2,int period2_2){
//        int[] result=null;
//        int[] allElement1=spisokElementov(period1,period1_1);
//        int[] allElement2=spisokElementov(period2,period2_2);
//        int[] sumArrays=unionArrays(allElement1,allElement2);
//        int countDubley=calculateDubli(sumArrays);
//        result=new int[countDubley];
//        if(countDubley!=0){
//            result=dubliInArray(sumArrays);
//        }
//        return result;
//    }
//
//    private int[] spisokElementov(int period1, int period1_1) {
//        int[] result=new int[Math.abs(period1-period1_1)+1];
//        int start=period1>period1_1?period1_1:period1;
//        int end=start==period1?period1_1:period1;
//        for(int i=0;i<result.length;i++){
//            result[i]=start;
//            start++;
//        }
//        return result;
//    }
//
//    private int[] unionArrays(int[] ... arrays) {
//        int[] result=null;
//        int size=0;
//        for(int[] temp:arrays){
//            size+=temp.length;
//        }
//        result=new int[size];
//        int stop=0;
//        for(int[] temp:arrays){
//            writeArray(stop,result,temp);
//            stop+=(temp.length);
//        }
//        return result;
//    }
//
//    private void writeArray(int stop, int[] result, int[] temp) {
//        for(int i=0;i<temp.length;i++){
//            result[i+stop]=temp[i];
//        }
//
//    }
//
//    private int calculateDubli(int[] sumArrays) {
//        int result = 0;
//        for (int temp : sumArrays) {
//            int count = 0;
//            for (int temp1 : sumArrays) {
//                if (temp == temp1) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                result++;
//            }
//            if (count > 2) {
//                System.out.println("Количество повторов более 2. Результаты метода  неверны");
//                return 0;
//            }
//        }
//        return result / 2;
//    }
//
//    private int[] dubliInArray(int[] sumArrays) {
//        int[] result=new int[calculateDubli(sumArrays)];
//        int i=0;
//        for (int temp : sumArrays) {
//            int count = 0;
//            for (int temp1 : sumArrays) {
//                if (temp == temp1) {
//                    count++;
//                }
//            }
//            if (count >1 & i<result.length) {
//                result[i]=temp;
//                i++;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        Proba pb = new Proba();
        pb.rabotaDiaposonov(11, 50, 21, 60);

    }

}






