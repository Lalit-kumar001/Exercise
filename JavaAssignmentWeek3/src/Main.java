import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    interface NumberRule{
        boolean apply(int n);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 7, 10, 12);

        NumberRule isEven = (n) -> n % 2 == 0;

        NumberRule isPrime = (n) -> {
            if(n <= 1) return false;

            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
            return true;
        };

        List<Integer> result = nums.stream().filter(n -> isEven.apply(n) && isPrime.apply(n)).map(n -> n*n).collect(Collectors.toList());

        Optional<Integer> firstElement = result.stream().findFirst();

        if(firstElement.isPresent()){
            System.out.println(firstElement.get());
        }
        else{
            System.out.println("No matching number found");
        }

    }
}