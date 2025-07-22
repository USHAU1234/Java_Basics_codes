class Animal{
    void type(){
        System.out.println("There are many types of animal? like Domestic and Wild: ");
    }
}

class Domestic extends Animal{
    void Cat(){
        System.out.println("The cat is a Domestic Animal");
    }
}

class Wild extends Domestic{
    void Lion(){
        System.out.println("The Loin is a Wild Animal");
    }
}


public class Multilevel_Inheritence {
    public static void main(String[] args){
        Wild l = new Wild();
        l.type();
        l.Cat();
        l.Lion();
    }
}
