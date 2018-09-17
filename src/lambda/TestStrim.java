package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStrim {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Stream.of(2,3,4,5,7,9).filter((a) -> {

            return a % 2 == 0;}).forEach((w)->{
            System.out.println(w.getClass()+" " +w.toString());
        });
         int sum=IntStream.rangeClosed(1,114).filter((w) -> w % 50 == 0).sum();

        System.out.println(sum);
        Set<Integer> list=Stream.of(3,4,4,5,9,9).collect(Collectors.toSet());
        System.out.println(list);
        Apelsin ap=new Apelsin(100,"spain");
        Apelsin ap1=new Apelsin(1100,"brasil");
        Set<Apelsin> set=Stream.of(ap1,ap).collect(Collectors.toSet());
        Stream.of(ap1,ap).map((w)-> {return w.weigt;}).sorted();
        System.out.println(set);

    }

}
class Apelsin implements Comparable<Apelsin>{
    int weigt;
    String sort;

    public Apelsin(int weigt) {
        this.weigt = weigt;
    }

    public Apelsin(int weigt, String sort) {
        this.weigt = weigt;
        this.sort = sort;
    }

    @Override
    public int compareTo(Apelsin o) {
        return this.weigt-o.weigt;
    }

    @Override
    public int hashCode() {
        Object a;
        return 117*this.weigt;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.weigt-((Apelsin)obj).weigt)==0;
    }
}
