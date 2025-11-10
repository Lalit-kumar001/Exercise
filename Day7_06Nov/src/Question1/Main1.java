package Question1;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum = 0;

        while(num>0){
            int x=num%10;
            sum+=x;
            num=num/10;
        }
        System.out.println("sum of Digits:"+sum);
    }
}
