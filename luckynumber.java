package preparation;

public class luckynumber {

    public static void main(String[] args) {
        int n = 13;
        if (isLucky(n)) {
            System.out.println("lucky");
        } else {
            System.out.println("not lucky");
        }
    }

    private static boolean isLucky(int n) {
        return isLuckyRecursive(n, 2);
    }

    private static boolean isLuckyRecursive(int n, int counter) {
        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;
        int np = n - n / counter;
        return isLuckyRecursive(np, counter + 1);
    }
}
