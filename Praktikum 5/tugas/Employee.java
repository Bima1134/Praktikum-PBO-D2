package tugas;

public abstract class Employee {
    protected int id;
    protected String name;
  public Employee(){
    
  }

    public Employee(int id, String name) {
      this.id = id;
      this.name = name;
    }
  
    public abstract double calculateSalary();
}
  