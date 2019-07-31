package az.matrix.abstraction.example;

public abstract class AbstractDatabase {
    /*
        2 Main differences:
        - Can't create object of abstract class
        - Abstract class can hold methods with body and without body
     */
    public void add(){
        System.out.println("Added.");
    }

    public void delete(){
        System.out.println("Deleted.");
    }

    abstract void update();
    abstract void get();
}
