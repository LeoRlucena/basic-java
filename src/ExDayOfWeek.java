public class ExDayOfWeek {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        String dow = switch (n) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid";
        };

        System.out.println("Day of the Week: " + dow);
    }
}
