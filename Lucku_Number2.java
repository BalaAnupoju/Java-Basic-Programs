package coding;

public class Lucku_Number2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int num = 13;

        boolean isLucky = isLuckyNumber(arr, num, 2);

        if (isLucky) {
            System.out.println(num + " is a Lucky number.");
        } else {
            System.out.println(num + " is not a Lucky number.");
        }
    }

    private static boolean isLuckyNumber(int[] arr, int num, int count) {
        if (arr.length == 1) {
            return arr[0] == num;
        }
        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if ((i + 1) % count != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return isLuckyNumber(newArr, num, count + 1);
    }
}

