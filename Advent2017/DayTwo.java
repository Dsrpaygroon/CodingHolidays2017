import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class DayTwo{
    public static void main(){
        String[] numbers = new String[];
        Scanner key = new Scanner(System.in);
        System.out.println("Input each set of number, and when you are finished, enter a done");
        String input = key.next();
        numbers.add(input);
        int sum = 0;
        while (!input.equals("done")){
            numbers.add(input);
            input = key.next();
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++){
            int[] list = new int[numbers.get(i).length()];
            for (int j = 0; j < list.length; j++){
                list[j] = Integer.parseInt(numbers[i].substring(j, j+1));
            }
            Arrays.sort(list);
            int min = list[0];
            int max = list[list.length - 1];
            sum += max - min;
        }
        System.out.println(sum);
    }
}
