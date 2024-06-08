
import java.util.Arrays;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа,
 * равные заданному, нужно перенести эти элементы в конец массива. Таким
 * образом, первые несколько (или все) элементов массива должны быть отличны от
 * заданного, а остальные - равны ему.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 3, 6, 5,3, 2, 3};
        int val = 3;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                j++;
            }
        }
        System.err.println(Arrays.toString(nums));
    }
}
