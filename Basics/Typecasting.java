package Basics;

public class Typecasting {
    public static void main(String[] args) {
        float a =25.12f; // only if you write f it will take as float or else it will defualt takes as double
        int b=(int)a; //lossy conversion called type casting or explicit conversion (there will be 2 type explicit and implicit)
        char c='a';
        int d=c; //d=97
        int intValue = 65; // ASCII/Unicode value for 'A'
        char charValue = (char) intValue;
        //char e='b'-'a'; but this gives an error
        //using type casting we can perform an conversion but lossy
        //if in a operation let's say a+b+c if a is long and b,c are int then b,c will also be converted into long this is called type promotions
        //byte a=5;
        //a=a*2 gives error since multiplying with integer makes it integer and you are assigning it to byte variable 
        //a=(byte)(a*5); is correct
        
    }
}
