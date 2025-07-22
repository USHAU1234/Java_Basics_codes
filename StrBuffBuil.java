public class StrBuffBuil {
    public static void main(String[] args) {
        String s = "We are learning Java";
        String[] str = s.split(" ");


       for(int i=0; i<= str.length-1; i++) {
           StringBuilder word = new StringBuilder(str[i]);
           String reverseword = word.reverse().toString();
           System.out.print(reverseword+" ");
       }
        System.out.println();
       for(int i= str.length-1; i>=0; i--){
           StringBuilder Sentence = new StringBuilder(str[i]);
           String revSentence = Sentence.reverse().toString();
           System.out.print(revSentence+" ");
       }
    }
}
