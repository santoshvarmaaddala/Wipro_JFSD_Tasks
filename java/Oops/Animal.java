package Oops;

class Animal {
    void eat(){
        System.out.println("Eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Bird extends Animal{
    void flying(){
        System.out.println("Flying....");
    }
}

class Out{
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.flying();
        b.sleep();
        
    }
}