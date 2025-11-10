import java.util.ArrayList;

// GenAI Use Declaration: I acknowledge that I have not knowingly used GenAI to complete this assessment.
public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", "Common Illness, Chronic Diseases");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Lee", "Family Medicine", "Pediatrics, Geriatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Wang", "Family Medicine", "Acute Care, Health Check");

        Pediatrician p1 = new Pediatrician(201, "Dr. Chen", "Pediatrics", 6);
        Pediatrician p2 = new Pediatrician(202, "Dr. Zhang", "Pediatrics", 12);

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        p1.printDetails();
        p2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        createAppointment(appointmentList, "Bob", "987654321", "10:00", gp1);
        createAppointment(appointmentList, "Charlie", "876543210", "14:00", gp2);
        createAppointment(appointmentList, "Diana", "765432109", "11:00", p1);
        createAppointment(appointmentList, "Eve", "654321098", "15:00", p2);

        printExistingAppointments(appointmentList);

        cancelBooking(appointmentList, "876543210");

        printExistingAppointments(appointmentList);

        System.out.println("------------------------------");
    }

    public static void createAppointment(ArrayList<Appointment> list, String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.isEmpty() || patientPhone == null || patientPhone.isEmpty() || timeSlot == null || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Error: Missing required information. Appointment cannot be created.");
            return;
        }
        Appointment newAppt = new Appointment(patientName, patientPhone, timeSlot, doctor);
        list.add(newAppt);
        System.out.println("Appointment created successfully.");
    }

    public static void printExistingAppointments(ArrayList<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        System.out.println("Existing Appointments (" + list.size() + "):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Appointment " + (i + 1) + ":");
            list.get(i).printDetails();
            System.out.println("------------------------------");
        }
    }

    public static void cancelBooking(ArrayList<Appointment> list, String patientPhone) {
        for (int i = 0; i < list.size(); i++) {
            Appointment appt = list.get(i);
            if (appt.getPatientPhone().equals(patientPhone)) {
                list.remove(i);
                System.out.println("Appointment for phone " + patientPhone + " cancelled successfully.");
                return;
            }
        }
        System.out.println("Error: No appointment found for phone " + patientPhone + ".");
    }
}