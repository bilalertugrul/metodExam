import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        int temp=number, reverseNumber=0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }
        if(number==reverseNumber){
            System.out.println(number + " Polindrom Sayıdır");
            return true;
        }else{
            System.out.println(number + " Herhangi Bir Sayı");
            return false;
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        isPalindrom(number);
    }
}