public class Factorsofnum {
    void factors(int num){
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }

public static void main(String[] args){
        Factorsofnum obj = new Factorsofnum();
        obj.factors(36);
}
}
