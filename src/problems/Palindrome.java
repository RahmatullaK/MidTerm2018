package problems;

public class Palindrome {
    public static void main(String[] args) {
        String s="ABA";

        int i;
        int n=s.length();
        String str="";
        for(i=n-1;i>=0;i--)
            str=str+s.charAt(i);
        if(str.equals(s))
            System.out.println(s+ "is palindrome");
        else
            System.out.println(s+ "is not a palindrome");
    }
}


        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */



