public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Ilya ", 200, 0),
                new Cat("Sasha ", 200, 0),
                new Cat("Lexa ", 200, 0),
                new Cat("Zeka ", 200, 0),
                new Cat("Niaz ", 200, 0),
                new Dog("Roma", 500, 10),
                new Dog("Tema", 500, 10),
                new Dog("Elena", 500, 10),
                new Dog("Bars", 500, 10),

        };
        for (Animal o : animals) {
            o.run(200);
            o.swim(8);
        }
        System.out.println("Animal count : " + Animal.counter);
        System.out.println("Cats count : " + Cat.counter);
        System.out.println("Dog count : " + Dog.counter);
    }
}
