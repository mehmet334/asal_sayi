import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number= scanner.nextInt();
        boolean deger=asalsayi(number,number-1);
        if (deger){
            System.out.println(number +" Bir Asal Sayıdır");
        }else {
            System.out.println(number + " Bir Asal Değildir");
        }
    }
    private static boolean asalsayi(int sayi,int bolen){
        if(sayi<2) return false;
        if (bolen==1)return true;
        if (sayi%bolen==0) return false;
        return asalsayi(sayi,bolen-1);
    }
}

