public class ExEvenSum {

    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i <= 100; i++) {
            x += i % 2 == 0 ? i : 0;
        }
        System.out.println(x);
    }
}
