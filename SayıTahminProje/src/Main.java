import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        Scanner inp = new Scanner(System.in);
        int[] hatali = new int[5];
        int a = 0;
        int sıralama = 1;
        int selected;
        boolean isWrong = false;

        while (a < 5) {

            System.out.println(sıralama + ". Sayı giriniz: ");
            selected = inp.nextInt();
            sıralama++;

            if (selected < 0 || selected > 99) {


                    System.out.println("Seçtiğiniz sayı hatalıdır.");
                    if (!isWrong) {
                        isWrong = true;
                        System.out.println("Sonraki sefer hakkınızdan düşülecektir. ");
                    } else {
                        a++;
                        System.out.println("Birden fazla hatalı giriş yapıldı kalan can : " + (5 - a));
                    }
                    continue;

                }

                if (selected == number) {

                    System.out.println("Tebriler doğru bildiniz.\n" + number);

                    break;

                } else {

                    System.out.println("Hatalı bir değer girdiniz. ");
                    if (selected < number) {
                        System.out.println("Girdiğiniz sayı değerden küçüktür");
                    } else {
                        System.out.println("Girdiğiniz sayı değerden büyüktür.");
                    }
                    hatali[a++] = selected;

                    if (5 - a > 0) {
                        System.out.println("Kalan hakkınız: " + (5 - a));
                    } else {
                        System.out.println("Hakkınız bitmiştir.");
                        System.out.println(Arrays.toString(hatali));
                    }

                }


        }
    }
}

