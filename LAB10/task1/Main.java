package LAB10.task1;

//Абстрактний клас Animal
abstract class Animal {

    public abstract void makeSound()

//Звичайний метод з реалізацією
   public void sleep(){
        System.out.println("Sleeping...");
   }
}
//Підклас Dog
class Dog extends Animal{
    //Реалізація абстрактного методу
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
//Підклас Cat
class Cat extends Animal{
    //Ревлізація абстрактого методу
    @Override
    public void makeSound(){
       System.out.ptintln("Meow");
    }
}
 public class Main {
     public static void main(String[] args) {
       //Створення об'єктів
         Animal Dog = new Dog();
         Animal Cat = new Cat();

       //Виклик методів собаки
         System.out.println("Dog");
         dog.makeSound();
         dog.sleep();

         //Пустий рядок для відокремлення
         System.out.println();

         //Виклик методів для кота
         System.out.println("Cat");
         cat.makeSound();
         cat.sleep
     }
 }
