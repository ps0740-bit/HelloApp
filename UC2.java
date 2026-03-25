public class UC2 {
public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("Hello, Pragati sah!");
        return;
    }
    String name = args[0];
    System.out.println("Hello, " + name + "!");
}
}