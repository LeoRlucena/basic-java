public class ExplicitCasting {

    public static void main(String[] args) {

        double d = 240.56;
        int i = (int) d;  // 240

        System.out.println(i);

        long l = 3000000000000000L;
        int i2 = (int) l;

        System.out.println(i2);  // -296517632

        long l2 = 10L;
        int i3 = (int) l2;

        System.out.println(i3);  // 10
    }
}
