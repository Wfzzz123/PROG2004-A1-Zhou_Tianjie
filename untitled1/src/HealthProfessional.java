public class HealthProfessional {
    private int id;
    private String name;
    private String department;

    public HealthProfessional() {
    }

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}