public class App {

    public static void main(String[] args) {

        String first = "first";
        String second = "second";

        System.out.println("first = " + first);
        System.out.println("second = " + second + '\n');

        String temp = null;

        temp = first;
        first = second;
        second = temp;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

    }
}
