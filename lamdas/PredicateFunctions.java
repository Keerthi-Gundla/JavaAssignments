package lamdas;

import java.util.function.Predicate;

public class PredicateFunctions {
    Predicate<String> predicate=(str)->str.isEmpty();
    Predicate<Integer> pred=(n)->n>10?true:false;
    Predicate<Integer> pred2=(n)->n<20?true:false;

    Predicate<Integer> pred3=pred.and(pred2);
    Predicate<Integer> pred4=pred.or(pred2).and(pred3);
    Predicate<Integer> pred5=pred.negate();

    public static void main(String args[]){
        PredicateFunctions obj=new PredicateFunctions();
        System.out.println("String empty ? "+obj.predicate.test("Hello"));
        System.out.println("Number greater than ten ? "+obj.pred.test(11));
    }
}
