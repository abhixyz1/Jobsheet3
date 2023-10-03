import java.util.Scanner;
public class persegipanjang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int lebar, panjang;
        float luas;

        System.out.println("Lebar :");
        lebar = sc.nextInt();
        System.out.println("Panjang :");
        panjang = sc.nextInt();

        luas = lebar * panjang;

        System.out.println("Luas Persegi = " + luas);


    }
}