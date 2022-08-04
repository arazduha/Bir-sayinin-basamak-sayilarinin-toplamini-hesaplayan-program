import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int tpl =0, a;
        System.out.print("Sayi giriniz: ");
        a = input.nextInt();

        while (a!=0){
            tpl +=(a%10);
            a/=10;
        }
        System.out.print("Sayinin basamaklari toplami: "+tpl);

    }

}





