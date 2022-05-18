package com.java.assignments.javaAssignment6;

public class VampireDemo
{
    public static void main(String[] args) {
        VampireNumber vampire = new VampireNumber();
        int number = 1000;
        int count = 0;
        while (count < 100)
        {
            //checking the numbers with even number of digits
            if (((int) (Math.log10(number) + 1))%2 == 0)
            {
                int[] integerArray = vampire.breakNumber(number);
                vampire.findPermutations(integerArray , 0, number);
                if (vampire.isVampire)
                {

                    System.out.println((count+1)+" "+number);
                    count++;
                    vampire.isVampire = false;
                }
            }
            number++;
        }
    }
}
