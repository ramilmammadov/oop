package az.matrix.inheritence.example;

public class Employee {
    private String name;
    private String department;
    private int id;

    public Employee(String name,String department,int id){
        this.name=name;
        this.department=department;
        this.id=id;
    }

    public void showInfos(){
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("ID: "+this.id);
    }
}
