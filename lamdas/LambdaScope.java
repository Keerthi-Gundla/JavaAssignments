package lamdas;

class SuperClass{
    public String member="God Father";
}
public class LambdaScope extends SuperClass {
    String member="Father";
    interface Family{
        public void who(String member);
    }

    public void printFamily(String member){
        Family family=(person)->{
            System.out.println("member in superclass : "+super.member);
            System.out.println("Member in present class : "+this.member);
            System.out.println("Member passed as argument to function : "+member);
            System.out.println("Member passed as argument to lambda : "+person);
        };

        family.who("grandson");
    }
    public static void main(String args[]){
        new LambdaScope().printFamily("son");
    }
}
