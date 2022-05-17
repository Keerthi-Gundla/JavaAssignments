package lamdas;

class Movie{
    Movie(int i){

    }
    Movie(int i, String s){}

    interface MovieFactory{
        public Movie create(int i);
    }
    interface MovieFactory2{
        public Movie create(int i,String s);
    }
    static MovieFactory movie1=Movie::new; //constructor reference refers first constructor
    static MovieFactory2 movie2=Movie::new; //refers second constructor

}
public class ConstructorReference {
    public static void main(String args[]){
        Movie m=Movie.movie1.create(10);
        Movie m1=Movie.movie2.create(10,"hello");
    }
}
