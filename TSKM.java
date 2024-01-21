import java.util.Random;
import java.util.Scanner;

public class TSKM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen seçiminizi giriniz (0: Taş, 1: Kağıt, 2: Makas):");
        int userChoice = scanner.nextInt();
        int computerChoice = new Random().nextInt(3);

        String userChoiceStr = "";
        String computerChoiceStr = "";

        switch (userChoice) {
            case 0:
                userChoiceStr = "Taş";
                break;
            case 1:
                userChoiceStr = "Kağıt";
                break;
            case 2:
                userChoiceStr = "Makas";
                break;
            default:
                System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz.");
                return;
        }

        switch (computerChoice) {
            case 0:
                computerChoiceStr = "Taş";
                break;
            case 1:
                computerChoiceStr = "Kağıt";
                break;
            case 2:
                computerChoiceStr = "Makas";
                break;
        }

        System.out.println("Siz: " + userChoiceStr);
        System.out.println("Bilgisayar: " + computerChoiceStr);

        if (userChoice == computerChoice) {
            System.out.println("Berabere, oyun tekrar edin.");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("Tebrikler, siz kazandınız.");
        } else {
            System.out.println("Bilgisayar kazandı, oyunu tekrar edin.");
        }

        scanner.close();
    }
}