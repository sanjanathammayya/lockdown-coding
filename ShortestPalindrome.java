import java.util.Scanner;
public static String ShortestPalindrome {
 public static String shortestPalindrome(String str) {
   int x=0;
   int y=str.length()-1;
   while n(y>=0){
     if(str.charAt(x)==str.charAt(y)){
       x++;
     }
     y--;
   }
   if(x==str.length())
     return str;
   String suffix = str.substring(x);
   String prefix = new StringBuilder(suffix).reverse()..toString();
   String mid = shortestPalindrome(str.substring(0,x));
   return prefix+mid+suffix;
 }
  public static void main(string[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter a string to find out shortest palindrome of "+str+" is "+shortestPalindrome(str));
  }
}
    
