
import java.util.*;
import java.util.Scanner;

public class TicTacToe {
    static  String[] tabela;
    static String radha;

    static String kontrolloFituesin()
    {
        for (int i = 0; i< 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = tabela[0] + tabela[1] + tabela[2];
                    break;
                case 1:
                    line = tabela[3] + tabela[4] + tabela[5];
                    break;
                case 2:
                    line = tabela[6] + tabela[7] + tabela[8];
                    break;
                case 3:
                    line = tabela[0] + tabela[3] + tabela[6];
                    break;
                case 4:
                    line = tabela[1] + tabela[4] + tabela[7];
                    break;
                case 5:
                    line = tabela[2] + tabela[5] + tabela[8];
                    break;
                case 6:
                    line = tabela[0] + tabela[4] + tabela[8];
                    break;
                case 7:
                    line = tabela[2] + tabela[4] + tabela[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return  "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(tabela).contains(
                    String.valueOf(i + 1))) {
                break;
            }
            else if (i == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on tabela.
        System.out.println(
                radha + "'s radha; Shkruaj nje numer te vendosni  "
                        + radha + " in:");
        return null;
    }
    static void printoTabelen(){
        System.out.println("|---|---|---|");
        System.out.println("| " + tabela[0] + " | "
                + tabela[1] + " | " + tabela[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabela[3] + " | "
                + tabela[4] + " | " + tabela[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabela[6] + " | "
                + tabela[7] + " | " + tabela[8]
                + " |");
        System.out.println("|---|---|---|");
    }














    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    tabela = new String[9];
    radha ="X";


    String fituesi = null;
    for(int i =0; i<9; i++){
        tabela[i] = String.valueOf(i+1);
    }
        System.out.println("Miresevini ne 3x3 Tic Tac Toe.");
    printoTabelen();
        System.out.println("x do te luaj i pari. Shkruaj numrin e vendit ku deshironi te vendosni x-in:");
        while(fituesi==null){
            int numri =reader.nextInt();
            if(!(numri >0 && numri <=9)){
                System.out.println("Numri jo valid. ri-shkruaj numrin: ");
                continue;
            }
            if(tabela[numri -1].equals(String.valueOf(numri))){
                tabela[numri-1]=radha;
                if(radha.equals("X")){
                    radha="0";
                }
                else{
                    radha ="X";
                }
                printoTabelen();
                fituesi = kontrolloFituesin();
            }
            else
            {
                System.out.println("Vendi i zene, rishkruaj numrin: ");
        }
    }
if(fituesi.equalsIgnoreCase("Vizato")){
    System.out.println("Eshte nje vizatim faleminderit per lojen:");
}
else{
    System.out.println("Urime!" +fituesi+"'s ka fituar! Faleminderit per Lojen");

}}}
