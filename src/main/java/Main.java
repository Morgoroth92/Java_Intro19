public class Main {
    public static void main(String[] args) {
        sumWhileLimit(5);
    }
    public static void sumWhileLimit(int x) {
        int i =0;
        int sum = 0;
        while (i < x) {
            sum = sum + i;
            i = i + 1;
            System.out.println(sum);
        }
    }
}

