package Java_String_Reverse;

/*

   ---->  Java String Reverse

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isReverse = true;
        for(int i=0; i<A.length(); i++){
            if(!(A.substring(i, i + 1).equals(A.substring(A.length() - i - 1, A.length() - i)))){
                isReverse=false;
            }
        }
        if(isReverse){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
