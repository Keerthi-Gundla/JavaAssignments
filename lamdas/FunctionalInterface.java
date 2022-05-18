package lamdas;

public class FunctionalInterface {
    @java.lang.FunctionalInterface
    interface Snack{
        public int crunch(int i,int j);
    }
    public void makeCrunch(int i, int j,Snack s){
        System.out.println("result ="+s.crunch(i,j));
    }
    public static void main(String[] args){
        FunctionalInterface obj=new FunctionalInterface();

        //client1
        obj.makeCrunch(10,20,(i,j)->i*j);

        //client2
        obj.makeCrunch(20,10,(i,j)->i+j);
    }
}
