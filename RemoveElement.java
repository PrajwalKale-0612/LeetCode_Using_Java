import java.util.Arrays;

public class RemoveElement {
    public static int removeElementInArray(int[] arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }


    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 1, 5, 3, 2, 5 };

        System.out.println(Arrays.toString(arr));

        int size = removeElementInArray(arr, 2);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
