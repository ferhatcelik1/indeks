import java.util.Scanner;

public class indekshesaplama {
    public static void main(String[] args) {
        double kilo, boy, vucutindeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();
        vucutindeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + vucutindeks);
    }
}
