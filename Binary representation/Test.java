import java.util.Scanner;
class Test{
//  Micrsoft
//     Write a program to print Binary representation of 
//    a given number N.
// Example 1:

// Input:
// N = 2
// Output:
// 000000000000000000000000000010
// Explanation:
// The binary representation of 2 is '10'
// but we need to print in 30 bits so append
// remaining 0's in the left.

    public static String getBinaryRep(int num){
            StringBuilder str = new StringBuilder();
            for(int itr=0;itr<30;itr++){
                int bit=num&1;
                str.insert(0, bit);
                num>>=1;
            }
            while (str.length()<30) {
                str.insert(0,'0');
            }
            return str.toString();
    }
    public static void main(String[] args) {
       String ans = new String();
       int num=5;
       ans = getBinaryRep(num);
       System.out.println("Binary Representation: "+ans);
    }
}