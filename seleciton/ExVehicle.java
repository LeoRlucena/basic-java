public class ExVehicle {

    public static void main(String[] args) {

        int allowed = 100;
        int current = 100;
        int amount;

        if (allowed < current) {

            int considered;

            if (allowed < 100) {
                considered = current + 7;
            } else {
                considered = current + (int) (current * 0.1);
            }

            int diff = considered - allowed;
            amount = diff * 10;
        } else {
            amount = 0;
        }

        System.out.println("Value: " + amount);
    }
}
