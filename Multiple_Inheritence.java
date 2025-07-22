interface P1 {

    static void parent1() {
        System.out.println("This is parent one class");


    }
    /**void name(){
        System.out.println("Name: ");
    }**/
    interface P2 {
        void parent2();

        default void defaultMethod(){
            System.out.println("This is default method inside parent2: ");
        }

        class Child implements P1, P2 {
            public void parent2(){
                System.out.println("This is parent two class");
            }


        }

    }

}

public class Multiple_Inheritence {
    public static void main(String[] args){

        P1.P2.Child obj = new P1.P2.Child();
        P1.parent1();
        obj.defaultMethod();
        obj.parent2();


    }

}
