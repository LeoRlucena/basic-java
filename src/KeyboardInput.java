public class KeyboardInput {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Texto 1: ");
        String info1 = scanner.nextLine();

        System.out.print("Texto 2: ");
        String info2 = scanner.nextLine();

        System.out.println(info1 + info2);
    }
}
