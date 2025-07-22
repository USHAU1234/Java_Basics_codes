
    class A {
        void msg() {
            System.out.println("Hello World!!");
        }
    }
    class B extends A{

        void name(String Name){
            System.out.println(Name);
        }

    }
    public class Inheritence {
public static void main(String[] args){
        B obj = new B();
        obj.msg();
        obj.name("Mamatha");


}

}
