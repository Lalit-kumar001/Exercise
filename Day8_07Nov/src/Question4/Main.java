package Question4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum");
        int target = sc.nextInt();

        targetSum(arr,target);
    }

    public  static  void targetSum(int [] arr , int target) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        int flag =0;
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if (map.get(x) != null) {
                System.out.println(map.get(x)+" "+i);
                flag=1;
                break;
            } else {
                map.put(arr[i],i);
            }

        }
        if(flag==0){
            System.out.println("Target sum not possible");
        }
    }

}
