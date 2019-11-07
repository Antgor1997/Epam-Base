/*
В двух одномерных массивах чисел найти такие числа, которые есть в обоих исходных массивах.
*/

import java.util.ArrayList;

public class IdenticalNumbers {
    public static void main(String[] args) {
        int arrayFirst[]=new int[]{1,3,5,2,9};
        int arraySecond[]=new int[]{2,0,11,5,3,1};
        ArrayList<Integer> result=new ArrayList<>();
        for (int elemFirst:arrayFirst) {
            for (int elemSecond:arraySecond) {
                if (elemFirst==elemSecond){
                    result.add(elemFirst);
                }
            }
        }
        System.out.println("Result: "+result);
    }
}
