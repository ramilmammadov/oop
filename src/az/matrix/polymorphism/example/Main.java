package az.matrix.polymorphism.example;

public class Main {
    public static void main(String[] args) {
        Person employee = new Doctor();
        employee.showName();
    }
}
