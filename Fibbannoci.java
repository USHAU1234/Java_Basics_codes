public class Fibbannoci {
    public static void main(String[] args){
        int num = 12;
        int a = 0, b = 1;

        for(int i=1; i<=num; i++){
            System.out.println(a);

            int c = a+b;
            a = b;
            b = c;
        }
    }
}
