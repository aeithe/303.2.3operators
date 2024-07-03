import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
//Write a program that declares an integer a variable x, assigns the value 2 to it,
// and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
// Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
// Before printing the results, write a comment with the predicted decimal value and binary string.
// Now, print out x in decimal form and in binary notation.
//Perform the preceding exercise with the following values:
//9
//17
//88

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
       //x = Integer.parseInt(Integer.toBinaryString(x<<1));
        //System.out.println(x);
        x = x << 1 ;
        //anticipated value is 4 because binary values are exponents of 2 starting from the 0 power going from right to left,
        // and shifting the placement of the one gives you 100 which is 2^2 = 4
        System.out.println(Integer.toBinaryString(x));
        System.out.println(BigDecimal.valueOf(x));

        int y = 9;
        System.out.println(Integer.toBinaryString(y));
        y = y << 1;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(BigDecimal.valueOf(y));

        int z = 17;
        System.out.println(Integer.toBinaryString(z));
        z = z << 1;
        System.out.println(Integer.toBinaryString(z));
        System.out.println(BigDecimal.valueOf(z));

        int a = 88;
        System.out.println(Integer.toBinaryString(a));
        a = a << 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(BigDecimal.valueOf(a));

        //Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of
        // the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment
        // indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary
        // string.
        //Perform the preceding exercise with the following values:
        //225
        //1555
        //32456

        int anotherX = 150;
        System.out.println(Integer.toBinaryString(anotherX));
        anotherX = anotherX >> 2;
        System.out.println(Integer.toBinaryString(anotherX));
        System.out.println(BigDecimal.valueOf(anotherX));

        int anotherY = 225;
        System.out.println(Integer.toBinaryString(anotherY));
        anotherY = anotherY >> 2;
        System.out.println(Integer.toBinaryString(anotherY));
        System.out.println(BigDecimal.valueOf(anotherY));

        int anotherZ = 1555;
        System.out.println(Integer.toBinaryString(anotherZ));
        anotherZ = anotherZ >> 2;
        System.out.println(Integer.toBinaryString(anotherZ));
        System.out.println(BigDecimal.valueOf(anotherZ));

        int anotherA = 32456;
        System.out.println(Integer.toBinaryString(anotherA));
        anotherA = anotherA >> 2;
        System.out.println(Integer.toBinaryString(anotherA));
        System.out.println(BigDecimal.valueOf(anotherA));

 //Write a program that declares three int variables: x, y, and z.
        // Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise
        // and operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and
        // assign the result to z.

        int theSecondX = 7;
        int theSecondY = 17;

        int newZ = theSecondY & theSecondX;
        System.out.println(Integer.toBinaryString(newZ));


        int theOtherNewZ = theSecondX | theSecondY;
        System.out.println(Integer.toBinaryString(theOtherNewZ));









    }
}