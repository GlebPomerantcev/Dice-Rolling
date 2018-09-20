
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String dec = "d";
        String [] nums = input.split(dec);
        int count = Integer.valueOf(nums[0]);
        int sides = Integer.valueOf(nums[1]);
        int [] res = new int[count];
        int sum = 0;
        //System.out.print("between " + count+ " and " + sides*count + " probably it's "
        //        + count*(random.nextInt(sides)+1));
        for (int i=0; i<count; i++){
            res[i]=random.nextInt(sides)+1;
        }
        for  (int i=0; i<res.length; i++){
            sum+=res[i];
        }
        System.out.print(sum + " comprises " + Arrays.toString(res).replaceAll("\\[|\\]",""));
    }
}
