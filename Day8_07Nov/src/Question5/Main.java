package Question5;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println("Enter first list in sorted Order to stop enter -1");
       int num;
        while(true){
             num = sc.nextInt();
             if(num==-1){
                 break;
             }
            list1.add(num);
        }

        System.out.println("Enter Second list in sorted Order to stop enter -1");
        ArrayList<Integer> list2 = new ArrayList<>();
        num=0;
        while(true){
            num=sc.nextInt();
            if(num==-1){
                break;
            }
            list2.add(num);

        }

        //merging
        ArrayList<Integer> merge = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                merge.add(list1.get(i));
                i++;
            }
            else if(list1.get(i)>list2.get(j)){
                merge.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            merge.add(list1.get(i));
            i++;
        }

        while(j<list2.size()){
            merge.add(list2.get(j));
            j++;
        }

        System.out.print("Merge list ");

        for(int elem : merge){
            System.out.print(elem+" ");
        }

    }
}
