package lamdas;

interface Greeting{
    public String sayHello(String a);
}
public class FirstLambda {
    public void greetings(String str,Greeting g){
        g.sayHello(str);
        System.out.println("hello ,"+str);
    }
    public static void main(String args[]){
        // this use of lambda is possible only when interface has only one abstract class.
        new FirstLambda().greetings("John",(str)->"hello "+str);
    }

}
