import java.util.Arrays;

public class lenlongword {
    int len_word(String sentence){
        String[] word = sentence.split(" ");
        String long_word = "";
        int  max_word = 0;

        for(String i:word){
            if(i.length() > max_word){
                max_word = i.length();
                long_word = i;

            }


        }
        System.out.println("The longest word is: "+long_word);
        return max_word;
    }
public static void main(String[] args){
        lenlongword sen = new lenlongword();
        String sentence = "We learning Java";
        int result = sen.len_word(sentence);
    System.out.println("The longest word in sentence is: "+result);
}
}