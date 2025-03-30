public class RepeatBreak {

    public static void main(String[] args) {

        int i = 0;
        while (i < 200) {
            System.out.println(i);
            i++;

            if (i == 100) {
                break;
            }
        }
        System.out.println("FIM");
    }
}
