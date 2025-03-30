public class IfElse {

    public static void main(String[] args) {
        int hour = 12;

        if (hour > 0 && hour < 12) {
            System.out.println("Bom dia!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Boa tarde!");
        } else if (hour >= 18 && hour <=23){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida");
        }
    }
}
