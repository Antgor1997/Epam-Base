/*
В одномерном массиве целых чисел найти наибольшее нечетное число.
 */
import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int resultNumber=0;
        System.out.print("Input the number of elements which you want to add in array: ");
        int numberElements=in.nextInt();
        int array[]=new int[numberElements];
        for (int i=0;i<numberElements;i++){
            System.out.print("Input the number: ");
            array[i]=in.nextInt();
        }
        for (int elem:array) {
            if (elem>resultNumber&&elem%2!=0){
                resultNumber=elem;
            }
        }
        System.out.println("Result: "+resultNumber);
    }
}
