package lamdas.streams;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public void streams(){
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<30;i++){
            numbers.add(i);
        }
        numbers.add(13);
        numbers.add(24);

        List<Integer> result= numbers.stream().filter((n)->n>10).distinct().limit(15).toList();

        for (Integer x:result) {
            System.out.print(x+" ");
        }
    }

    public static void main(String args[]){
        new StreamExample().streams();
    }
}
