package lamdas;

public class MethodReferences {
    interface Movie{
        public boolean topTen(int rating);
    }

    public boolean isTopTen(int rating){
        boolean top=rating>(10)?true:false;
        return top;
    }
    public void check(){
        Movie movie=(rating)->rating>10;

        //method reference
        MethodReferences m1=new MethodReferences();
        Movie m2=m1::isTopTen;
        System.out.println("method ref : "+m2.topTen(11));
        System.out.println("normal lambda : "+movie.topTen(9));
    }
    public static void main(String[] args){
        MethodReferences obj=new MethodReferences();
        obj.check();
    }
}
