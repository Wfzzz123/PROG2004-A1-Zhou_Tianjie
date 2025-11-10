public class GeneralPractitioner extends HealthProfessional {
    private String consultationScope;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int id, String name, String department, String consultationScope) {
        super(id, name, department);
        this.consultationScope = consultationScope;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner, Consultation Scope: " + consultationScope);
    }
}