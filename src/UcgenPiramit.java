import java.util.Scanner;

public class UcgenPiramit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgeniniz kaç satır olsun?");
        int satirsayisi= scan.nextInt();

        for(int satir=0 ; satir < satirsayisi ; satir++) {

            for(int bosluk=0 ; bosluk < satirsayisi - (satir+1) ; bosluk++) {
                System.out.print(" ");
            }


            for(int yildiz=0 ; yildiz < 1+ (satir*2) ; yildiz++) {
                System.out.print("*");

            }

            System.out.println();


        }
    }
}
