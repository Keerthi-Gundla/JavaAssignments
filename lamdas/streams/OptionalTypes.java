package lamdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTypes {
    public static void optionalExample(){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(i);
        Optional<Integer> sum=list.stream().reduce(Integer::sum);
        System.out.println("sum :"+sum);

        list=new ArrayList<>();
        Optional<Integer> sum1=list.stream().reduce(Integer::sum);
        if(sum1.isPresent())
            System.out.println("sum1 :"+sum1);
    }
    public static void main(String args[]){
        optionalExample();
    }
}
