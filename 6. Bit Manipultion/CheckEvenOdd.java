import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ") ;
        int num = sc.nextInt();
        Even_Odd(num);
    }

    // When we do & with 1 then the LSB must be
    public static void Even_Odd(int number){
        int bitMask = 1;

        if((number & bitMask) == 0){
            System.out.println("It is an even number");
        } else{
            System.out.println("It is an odd number");
        }
    }
}


