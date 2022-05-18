package lamdas;

public class CapturingLambda {
    public interface Trade{
        public String getTradeValue(String val);
    }

    public void isTrade(String val){
        // parameter str is treated as final since it is used in anonymous class i.e lambda
        //if not it will throw error.
        Trade t=(str)->str+val;
        System.out.println("trade "+t.getTradeValue("hello !! "));
    }

    public static void main(String args[]){
        new CapturingLambda().isTrade("john ");
    }
}
