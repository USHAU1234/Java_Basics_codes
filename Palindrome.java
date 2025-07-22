public class Palindrome {
    public static void main(String[] args){
       /** String s1 = "MOM";
        String s2="";
        for(int i=s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }

            if (s2.equals(s1)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not palindrome");
            }**/

        // To check SubString is palindrome or not

        String s1 = "123321";
        String sub1 = s1.substring(1,5);
        String sub2 = "";
        for(int i=sub1.length()-1; i>=0; i--){
            sub2 += sub1.charAt(i);
        }
        if (sub2.equals(sub1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        }

    }
