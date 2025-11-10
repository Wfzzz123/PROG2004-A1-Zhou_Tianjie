public class Pediatrician extends HealthProfessional {
    private int suitableAgeRange;

    public Pediatrician() {
        super();
    }

    public Pediatrician(int id, String name, String department, int suitableAgeRange) {
        super(id, name, department);
        this.suitableAgeRange = suitableAgeRange;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Pediatrician, Suitable Age Range: 0-" + suitableAgeRange + " years");
    }
}