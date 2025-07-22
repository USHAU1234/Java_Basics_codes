interface ABC{
    void abstractMethod();
    default void defaultMethod(){
        System.out.println("This is default method");
        privateMethod();
    }

    static void staticMethod(){
        System.out.println("This is static method");

    }

    private void privateMethod(){
        System.out.println("This is private method");
    }
    class myClass implements ABC{
        public void abstractMethod(){
            System.out.println("This is abstract method");
        }
    }
}

public class Interface_Method {
    public static void main(String[] args){
        ABC.myClass o = new ABC.myClass();
        o.abstractMethod();
        o.defaultMethod();
        ABC.staticMethod();
    }

}
