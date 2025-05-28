public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        
        // Append
        sb.append("!");
        System.out.println("Appended: " + sb); // Output: Hello World!
        
        // Insert
        sb.insert(6, "Beautiful ");
        System.out.println("Inserted: " + sb); // Output: Hello Beautiful World!
        
        // Delete
        sb.delete(6, 16);
        System.out.println("Deleted: " + sb); // Output: Hello World!
        
        // Replace
        sb.replace(6, 11, "Everyone");
        System.out.println("Replaced: " + sb); // Output: Hello Everyone!
        
        // Substring
        String substring = sb.substring(6, 15);
        System.out.println("Substring: " + substring); // Output: Everyone 
        
        // Reverse
        sb.reverse();
        System.out.println("Reversed: " + sb); // Output: !enoyrevE olleH
        
        // CharAt
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch); // Output: !
        
        // IndexOf
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index); // Output: 11
        
        // Length
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length); // Output: 20
        
        // ToString
        String result = sb.toString();
        System.out.println("StringBuilder to String: " + result); // Output: !dlroW enoyrevE olleH
    }
}
