import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b , c, s;
        double alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("a kenar sayısı: ");
        a = girdi.nextInt();
        System.out.print("b kenar sayısı: ");;
        b = girdi.nextInt();
        System.out.print("c kenar sayısı: ");;
        c = girdi.nextInt();

        s = (a+b+c)/2;
        alan = Math.sqrt((s*(s-a)*(s-b)*(s-c)));

        System.out.println("Üçgenin Alanı: " + alan);


    }
}
