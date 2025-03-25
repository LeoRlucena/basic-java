public class ExAverage {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a segunda nota: ");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a terceira nota: ");
        double n3 = Double.parseDouble(scanner.nextLine());

        double avg = (n1 + n2 + n3) / 3;

        System.out.println("A média do aluno é: " + avg);
    }
}
