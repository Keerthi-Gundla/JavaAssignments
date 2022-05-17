package lamdas.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public void primitiveStream(){
        int a[]=new int[]{1,2,3,4,5};
        IntStream stream=IntStream.of(a);
        stream.forEach(System.out::println);

        double b[]=new double[]{1.0,2.0,3.0,5.0};
        DoubleStream doubles=DoubleStream.of(b);
        doubles.forEach(System.out::println);
    }
    public static void main(String args[]){
        new PrimitiveStreams().primitiveStream();
    }
}
