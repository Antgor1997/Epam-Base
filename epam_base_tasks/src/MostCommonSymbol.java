/*
Строка содержит символы английского алфавита (A…Z и a..z), символ “пробел” и знаки препинания.
Найти символ, который встречается чаще всего (без учета регистра).
Если таких символов несколько, вывести любой из них.
 */

public class MostCommonSymbol {
    public static void main(String[] args) {
        String word="Hello, i am a designer or programmer";
        word=word.toLowerCase();

        int check=0;
        int max=0;
        char mostCommon=' ';

        for (int elem=0;elem<word.length();elem++) {
            for (int elem2=0; elem2<word.length(); elem2++){
                if (word.charAt(elem)==word.charAt(elem2)){
                    check++;
                }
            }
            System.out.println("Check: "+check);
            if (max<check){
                max=check;
                mostCommon=word.charAt(elem);
            }
            check=0;
            System.out.println(word.charAt(elem));
        }
        System.out.println("Most common symbol: "+mostCommon);
    }
}
