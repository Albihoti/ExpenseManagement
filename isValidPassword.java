

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class isValidPassword {
    public  static final int GJATESIA_FJALEKALIMIT =8;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("1.Fjalekalimi duhet te kete se paku 8 karaktere.\n" +
                         "2. Fjalekalimi duhet te permbaje vetem shkronja dhe numra.\n " +
                           "3. Fjalekalimi duhet te permbaje se paku 2 numra: \n " +
                           "4.Shkruaj nje fjalekalim: ");
                    String fjalekalimi = reader.nextLine();
if(eshte_fjalekalim_valid(fjalekalimi)){
    System.out.println("Fjalekalimi valid " +fjalekalimi);
}
else{
    System.err.println("Fjalekalimi jo valid: "+fjalekalimi);
}


    }

    public static boolean eshte_fjalekalim_valid(String fjalekalimi){
        if(fjalekalimi.length() <GJATESIA_FJALEKALIMIT)
            return false;
        int charCount =0;
        int numCount =0;
        for(int i=0; i<fjalekalimi.length(); i++){
            char ch = fjalekalimi.charAt(i);
            if(aEshteNumer(ch))numCount++;
            else if(aEshteShkronje(ch))charCount++;
            else return false;
        }
        return (charCount >=2 && numCount >=2);
    }
    public static boolean aEshteShkronje(char ch){
        ch = Character.toUpperCase(ch);
        return (ch>= 'A' && ch <='Z');
    }
    public static boolean aEshteNumer(char ch){
        return (ch >= '0' && ch<='9');
    }
}
