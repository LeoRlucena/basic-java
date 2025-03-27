public class SwitchExpressions {

    public static void main(String[] args) {
        int month = 3;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Inválido");
                yield 0;
            }
        };

        System.out.println(days + " dias.");
    }
}
