

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodat {
    static double r1;
    static double r2;
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
//        CiftApoTek(10);
//        mbusheNjeVarg();
//        ekuacioniKuadratik();
//        checkElement();
//       findLongestString();
//        System.out.println("Syprina rrethit eshte:" +syprinaRrethit(5));
//        finmaxElement();
//         RandomArray();
//        System.out.println(aEshteFjalekalimiValid("Albi1234"));
//        validmiFjalekalimit();
//        NumratCift();
//        printoMatricen();
//        checkPalindrome();

    }


    public static double syprinaRrethit(double r) {
        double PI = 3.14;
        double syprinaRrethit = PI * Math.sqrt(r);
        return syprinaRrethit;
    }

    public static void finmaxElement() {
        int vargu[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = 0;
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] > max) {
                max = vargu[i];
            }
        }
        System.out.println("Numri me i madh ne varg eshte: " + max);

    }

    public static void CiftApoTek(int numri) {
        if (numri % 2 == 0) {
            System.out.printf("Numri %d eshte Cift", numri);
        } else {
            System.out.printf("Numri %d eshte tek", numri);
        }
    }

    public static void mbusheNjeVarg() {

        int vargu[] = new int[10];
        for (int i = 0; i < vargu.length; i++) {
            System.out.printf("Shkruani vleren %d: ", i);
            vargu[i] = reader.nextInt();

        }
        System.out.println(Arrays.toString(vargu));
    }

    private static void ekuacioniKuadratik() {

        System.out.println("shkruani vleren e a: ");
        double a = reader.nextDouble();
        System.out.println("Shkruani vleren e b: ");
        double b = reader.nextDouble();
        System.out.println("Shkruani vleren e c: ");
        double c = reader.nextDouble();

        double d = b * b - 4.0 * a * c;

        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }

    }

    static void checkElement() {

        int vargu[] = new int[10];
        for (int i = 0; i < vargu.length; i++) {
            System.out.printf("Shkruani numrin %d", i);
            vargu[i] = reader.nextInt();
        }
        System.out.print("Shkruani nje numer: ");
        int numri = reader.nextInt();
        for (int element : vargu) {
            if (element == numri) {
                System.out.printf("Numri %d ne varg!", numri);
                break;
            }
        }
    }


    public static void findLongestString() {
        String vargu[] = {"Albi", "Diellza", "Erioni", "Leo", "Adrian"};

        int j = 0;
        for (j = 0; j < vargu.length; j++) {
            if (vargu[j].length() > vargu[j + 1].length()) {
                System.out.println(vargu[j]);
            }
        }

        System.out.println();
    }


    public static void RandomArray() {
        System.out.println("Sa vlera deshironi qe ti permbaje vargu: ");
        int n = reader.nextInt();
        int vargu[] = new int[n];
        Random RandNum = new Random();
        for (int i = 0; i < n; i++) {
            vargu[i] = RandNum.nextInt();

        }
        System.out.println(Arrays.toString(vargu));

    }

    public static void validmiFjalekalimit() {
        System.out.print(
                "1. Fjalekalimi duhet te permbaje se paku 8 karaktere.\n" +
                        "2.Fjalekalimi duhet te permbaje vetem shkronja dhe numra.\n" +
                        "3.Fjalekalimi duhet te permbaje se paku 2 numra.\n" +
                        "4. Shkruani nje fjalekalim: "
        );
        String fjalekalimi = reader.nextLine();
        if (aEshteFjalekalimiValid(fjalekalimi)) {
            System.out.println("Fjalekalimi eshte valid: " + fjalekalimi);
        } else {
            System.err.println("Fjalekalim jo valid: " + fjalekalimi);
        }
    }

    public static boolean aEshteFjalekalimiValid(String fjalekalimi) {
        int FJALEKALIMI_GJATESIA = 8;


        if (fjalekalimi.length() < FJALEKALIMI_GJATESIA) return false;

        int charCount = 0;
        int numcount = 0;
        for (int i = 0; i < fjalekalimi.length(); i++) {
            char ch = fjalekalimi.charAt(i);
            if (eshteNumer(ch)) numcount++;
            else if (eshteShkronje(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numcount >= 2);
    }

    public static boolean eshteNumer(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public static boolean eshteShkronje(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static void NumratCift() {
        System.out.println("Shkruani nje numer: ");
        int n = reader.nextInt();
        for (int i = 2; i < n; i++) {
            if (eshteCift(i) && eshteCift(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }


    public static boolean eshteCift(long n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printoMatricen() {
        System.out.print("Shkruaj nje numer: ");
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }

    }


    public  static void checkPalindrome(){
        System.out.print("Shkruaj nje numer: ");
        int number = reader.nextInt();
        if(aEshtePalindrom(number)){
            System.out.println("Numri eshte palindrom");
        }
        else{
            System.out.println("Numri nuk eshte palindrom");
        }
    }


    public static boolean aEshtePalindrom(int number){
        int temp = number;
        int remainder;
        int reverse=0;

        while(temp>0){
            remainder = temp %10;
            temp=temp/10;
            reverse = reverse*10 + remainder;
        }

        return  reverse== number;
    }
    public static void pagesaTvsh() {
        System.out.println("Shkruani qarkullimin ditor: ");
        double qarkullimiDitor = reader.nextDouble();
        double tvsh = 0.18;
        System.out.println("Ju gjat dites keni bere shitje " + qarkullimiDitor);
        System.out.println("Nga kjo shum ju do te paguani " + qarkullimiDitor * tvsh + "TVSH.");

    }


    public static int faturERrymes() {
        System.out.println("Shkruani sa kilovat keni hargjuar tere muajin: ");
        int kvMujor = reader.nextInt();
        int pagesaPerOr = 6;
        int shpenzimi = kvMujor * pagesaPerOr;
        int faktura = shpenzimi / 24;
        System.out.println("Ju keni shpenzuar " + kvMujor + "kilovat, dhe do te paguani " + faktura + "euro kete muaj.");
        return faktura;

    }
    public static int shpenzimiWat() {
        System.out.println("Shkruani nje pajisje qe deshironi tja llogaritni shpenzimet:\n" +
                "1-Frigorifer\n 2-Laptop\n3-Televizor\n4-Kompjuteri\n5-Bojleri\n6.Llampa. ");
        int pajisja = reader.nextInt();
        System.out.println("Ju keni zgjedhur: " + pajisja);
        System.out.println("Shkruani se sa ka kapacitet (ne volt)?");
        int shpenzimiPerOr = reader.nextInt();
        System.out.println("Sa ore ka punuar pajisja?");
        int orPunuese = reader.nextInt();
        System.out.println("Shkruani se sa dit ka punuar kete muaj pajisja: ");
        int ditMuaji = reader.nextInt();
        int totaliShpenzimit = shpenzimiPerOr * orPunuese*ditMuaji;
        System.out.println("Pajisja qe ju keni zgjedhur e cila ka punuar per " + shpenzimiPerOr + "ore kete muaj dhe ka shpenzuar " + totaliShpenzimit + " vat");
        System.out.println("");
        return totaliShpenzimit;
    }

}
