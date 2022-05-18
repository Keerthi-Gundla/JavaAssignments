package lamdas.streams;

import java.util.stream.Stream;

public class CreatingStreams {
    public void randomNumbers(){
        Stream<Double> doubles=Stream.generate(Math::random).limit(20);
        doubles.forEach(System.out::println);
    }
    public static void stringStreams(){
        Stream<String> fruits=Stream.of("banana","apple","graphes","guava","graphes");
        fruits.filter((t)->t.startsWith("g")).distinct().forEach(System.out::println);
    }
    public static void main(String args[]){
        new CreatingStreams().randomNumbers();
        stringStreams();
    }
}

