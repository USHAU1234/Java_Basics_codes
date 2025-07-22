class Animal_sound {
    void type_of_sound() {
        System.out.println("The Different sounds of animals");
    }
}

    class Cat extends Animal_sound {
        void cat() {
            System.out.println("Miaw");
        }
    }

class Lion extends Animal_sound{
    void lion() {
        System.out.println("Ror");
    }
}

class Dog extends Animal_sound {
    void dog() {
        System.out.println("Bark");
    }
}



public class Hyrarchical_Inheritence {
    public static void main(String[] args){
        Animal_sound obj = new Animal_sound();
        obj.type_of_sound();

        Cat c = new Cat();
        c.cat();




    }
}
