import java.util.*;
import java.lang.*;


public class Bilet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tip;
      do {
          System.out.println("Yolculuk Tipini Seçiniz 1:Tek Yön  2:Gidiş Dönüş");
          tip = sc.nextInt();

      }while (tip<0 || tip>2);

      System.out.println("Yaşınızı giriniz");
        int yas= sc.nextInt();

        System.out.println("Mesafeyi Giriniz");
        int yol=sc.nextInt();


        double price=yol*(0.10);
        if(tip==2){
                price=2*price*(0.8);

            }
        System.out.println("Toplam tutar: "+yol);
            if(yas<12 ){
                price/=2;
            }else if (yas>12&& yas<25){
                price=price*(0.9);

            }else if(yas>65){
                price=price*(0.7);
            }
            sc.close();
            System.out.println("Toplam tutar: "+price);
    }
}
