package lambda;

import java.time.LocalDate;
import java.util.*;

public class Fish {
    int massa;
    String name;

    public Fish(int massa,String name) {
        this.name=name;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "massa=" + massa +
                ", name='" + name + '\'' +
                '}';
    }
}

class Fisherman {

    Map<LocalDate,Integer> fishingDay = new TreeMap<>();
    Map<LocalDate,Map<Fish,Integer>> fishingDay1 = new TreeMap<>();
 //   static int  sumMasFish;
 {
    fishingDay.put(LocalDate.of(2018, 9, 21), 12);
    fishingDay.put(LocalDate.of(2018, 10, 21), 10);
    fishingDay.put(LocalDate.of(2018, 8, 21), 9);
}

    void goFishing (LocalDate date, Fish fish){
//       // fishingDay.add(date, qwantity);
        if(fishingDay.get(date)==null){
            fishingDay.put(date, fish.massa);
        }else{
            int oldMass=fishingDay.get(date);
            fishingDay.put(date,oldMass+fish.massa);
        }
    }

    void goFishin(LocalDate date){

    }

    void sumMassToPeriod(LocalDate start, LocalDate stop){
        LocalDate start1 = start.isBefore(stop)?start:stop;
        LocalDate stop1 = start1.equals(start)?stop:start;
        //Integer sumMassaFish=Integer.valueOf(0);
        Set<Map.Entry<LocalDate,Integer>> temp= fishingDay.entrySet(); // коллекция для бега по Map(итератор, foreach)
        int sum=temp.stream().filter(n->n.getKey().isAfter(start1) && n.getKey().isBefore(stop1)).
                mapToInt(t-> t.getValue()).sum();
        System.out.println(sum);
 }

    public static void main(String[] args) {
        Fisherman howMatchFish = new Fisherman();
       howMatchFish.sumMassToPeriod(LocalDate.of(2018, 1, 1),
               LocalDate.of(2018, 10, 1));
    }
}
