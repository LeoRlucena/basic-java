public class ExTemperature {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        int tf = Integer.parseInt(scanner.nextLine());

        int tc = (tf - 32) / 9 * 5;

        System.out.println("A temperatura " + tf + "Fº em graus Cº é: " + tc + "Cº");
    }
}
