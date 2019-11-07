/*
Из двумерного массива целых чисел сформировать новый массив, исключив из исходного отрицательные числа.
В полученном массиве найти номер строки, среднее арифметическое значений в которой максимально.
Если таких строк несколько, вывести номер первой такой строки.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the height of array: ");
        int heightArray=in.nextInt();
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        for(int elem=0;elem<heightArray;elem++){
            ArrayList<Integer> arrayRow=new ArrayList<>();
            System.out.print("Enter the number of elements in row: ");
            int elementsInRow=in.nextInt();
            for (int flagRow=0;flagRow<elementsInRow;flagRow++){
                System.out.print("Enter the elem in row: ");
                int elemInRow=in.nextInt();
                arrayRow.add(elemInRow);
            }
            arrayList.add(arrayRow);
        }
        for (ArrayList<Integer> row:arrayList) {
            for (int elem=0;elem<row.size();elem++){
                if (row.get(elem)<0){
                    row.remove(elem);
                }
            }
        }
        System.out.println("Result array: "+arrayList);





        int sumResult=0;
        for (ArrayList<Integer> rowList:arrayList) {
            int sumCheck=0;
            for (int elem:rowList) {
                sumCheck=elem;
            }

        }
    }
}
