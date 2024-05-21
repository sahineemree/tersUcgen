import java.util.Scanner;

public class yildizUcgenTers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        int num = input.nextInt();

        for (int i = 1 ; i <= num ; i++){
            for (int j = 1 ; j<= (i-1) ; j++){
                System.out.print(" ");
            }
            int starCount = (num +1) - i;
            for (int k =1 ; k<=(2*starCount)-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
