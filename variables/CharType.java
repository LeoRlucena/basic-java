public class CharType {

    public static void main(String[] args) {

        char c1 = 'A';
        System.out.println(c1);

        int i1 = (int) c1; // int i1 = c1 also works (implicit casting)
        System.out.println(i1);  //65

        char c2 = 'A' + 2;
        System.out.println(c2);  // 67 = C

        char c3 = 49;
        System.out.println(c3);  // 1

        // char c4 = -10  not possible
    }
}
