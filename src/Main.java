//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        x = Integer.parseInt(Integer.toBinaryString(x<<1));
        System.out.println(x);




    }
}