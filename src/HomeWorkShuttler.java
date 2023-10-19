import java.util.Arrays;
import java.util.Random;

public class HomeWorkShuttler {
    public static void main(String[]args){
        int quanityShattler = 0;
        int numberShattler = 0;

        for (int i = 0;quanityShattler < 100; i++) {
            numberShattler++;

            if(numberShattler % 10 == 4 || numberShattler % 10 == 9 || numberShattler / 10 == 4 || numberShattler / 10 == 9 || numberShattler % 100 == 9 || numberShattler / 10 % 10 == 4){
                continue;
            }

            System.out.println("Номер шатлу " + numberShattler);
            quanityShattler++;;

        }

        System.out.println("Всього шатлів = " + quanityShattler );




        }






        }



