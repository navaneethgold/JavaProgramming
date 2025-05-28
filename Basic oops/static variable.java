public class Hello {
    static int age = 5;

    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();

        System.out.println("Initial values: h1.age = " + h1.age + ", h2.age = " + h2.age);

        // Changing the value through h1 will affect h2 as well
        h1.age = 7;

        System.out.println("After changing h1.age to 7: h1.age = " + h1.age + ", h2.age = " + h2.age);
    }
}
