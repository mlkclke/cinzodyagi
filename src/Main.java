import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumyili;


        Scanner input = new Scanner(System.in);
        System.out.print("doğum yılınızı girin : ");
        dogumyili = input.nextInt();


        if (dogumyili % 12 == 0){
            System.out.println("Maymun");
        }
        if (dogumyili % 12 == 1){
            System.out.println("Horoz");
        }
        if (dogumyili % 12 == 2){
            System.out.println("Köpek");
        }
        if (dogumyili % 12 == 3){
            System.out.println("Domuz");
        }
        if (dogumyili % 12 == 4){
            System.out.println("Fare");
        }
        if (dogumyili % 12 == 5){
            System.out.println("Öküz");
        }
        if (dogumyili % 12 == 6){
            System.out.println("Kaplan");
        }
        if (dogumyili % 12 == 7){
            System.out.println("Tavşan");
        }
        if (dogumyili % 12 == 8){
            System.out.println("Ejderha");
        }
        if (dogumyili % 12 == 9){
            System.out.println("Yılan");
        }
        if (dogumyili % 12 == 10){
            System.out.println("At");
        }
        if (dogumyili % 12 == 11){
            System.out.println("Koyun");
        }


    }
}