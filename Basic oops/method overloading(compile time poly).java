public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }
    
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        int sum1 = example.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);
    
        int sum2 = example.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);
        
        String concat1 = example.concatenate("Hello, ", "world!");
        System.out.println("Concatenated string: " + concat1);
        
        String concat2 = example.concatenate("Hello, ", "beautiful ", "world!");
        System.out.println("Concatenated string: " + concat2);
    }
}
