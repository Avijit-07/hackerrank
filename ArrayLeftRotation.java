package hackerrank;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int size = 5;
        int rotation = 4;

        while(rotation != 0){

            int temp = arr[0];

            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[size - 1] = temp;

            rotation--;
        }


        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }

    }
}
