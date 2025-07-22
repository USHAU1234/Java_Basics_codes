public class Methods {
    int add(int a, int b){
        return a+b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b){
        return a/b;
    }
     void mod(int a, int b){
         System.out.println("the remainder is: "+ a%b);
     }

public static void main(String[] args) {
        Methods obj = new Methods();
    System.out.println(obj.add(2,3));
    System.out.println(obj.sub(6,3));
    System.out.println(obj.mul(2,3));
    System.out.println(obj.div(6,3));
    
    obj.mod(8,3);


}
}