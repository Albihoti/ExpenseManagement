

import java.util.Scanner;

public class countLetters {
    public static void main(String[] args) {
String test = "Pershenetje si jeni ?";
count(test);
    }
    public static void count(String x){

        char [] ch=x.toCharArray();
        int letter =0;
        int space =0;
        int num =0;
        int other =0;
        for(int i=0; i<x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("The string is: "+x);
        System.out.println("Numri i shkronjave eshte: " +letter);
        System.out.println("Numri i hapsirave eshte: " +space);
        System.out.println("Numri i numrave eshte: " +num);
        System.out.println("Te tjera: "+other);
    }
}
