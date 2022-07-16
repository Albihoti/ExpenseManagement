

import java.util.Scanner;
//Detyra 7
//Shkruani një metodë Java për të llogaritur vlerën  e investimit të ardhshëm
// me një normë interesi të caktuar për një numër të caktuar vitesh.

public class InterestRate {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani shumën e investimit: ");
        double investimi = reader.nextDouble();
        System.out.println("Shkruani raten e interesit: ");
        double rata = reader.nextDouble();
        System.out.println("Shkruani numrin e viteve: ");
        int viti = reader.nextInt();
        rata *= 0.01;

        System.out.println("Vitet      VleratEArdhshme");
        for (int i = 1; i <= viti; i++) {
            int formatter = 19;
            if (i >= 10)
                formatter = 18;
                System.out.printf(i + "%" + formatter + ".2f\n", vleraEArdhshmeEInvestimit(investimi, rata / 12, i));
            }
        }

        public static double vleraEArdhshmeEInvestimit( double vleraInvestimit, double rataeInteresitMujor, int vitet){
            return vleraInvestimit * Math.pow(1 + rataeInteresitMujor, vitet * 12);
        }
    }

