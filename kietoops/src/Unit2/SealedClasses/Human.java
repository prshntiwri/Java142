package Unit2.SealedClasses;

public sealed class Human permits Manish, Anjali {
    public void printName(){
        System.out.println("Hello, I am from Human Class!");
    }
}
