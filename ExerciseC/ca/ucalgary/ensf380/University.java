package ca.ucalgary.ensf380;

public class University {

    public static void main(String[] args) {
        // Create addresses
        Address professorAddress = new Address("456 University St", "Calgary", "AB", "T3R 1R4", "Canada");
        Address student1Address = new Address("123 Research Rd", "Calgary", "AB", "T3R 2D5", "Canada");
        Address student2Address = new Address("789 Learning Ave", "Calgary", "AB", "T3R 3N6", "Canada");

        // Create professor object
        Professor professor = new Professor("Dr. Smith", "403-123-4567", "johnson@universityx.ca", professorAddress, "T2022", 80000.0);

        // Create students
        Student student1 = new Student("Ken Brown", "403-234-5678", "ken@universityx.ca", student1Address, "S2020", professor, 89.0);
        Student student2 = new Student("Sandra Greene", "403-345-6789", "sandra@universityx.ca", student2Address, "S2030", professor, 67.8);

        // Validate addresses
        boolean addressValid1 = student1.hasValidAddress();
        boolean addressValid2 = student2.hasValidAddress();

        // Check eligibility to enroll
        boolean eligible1 = student1.isEligibleToEnroll();
        boolean eligible2 = student2.isEligibleToEnroll();

        // Print student and professor Address
        String professorPrintedAddress = professorAddress.outputAsLabel();
        String student1PrintedAddress = student1Address.outputAsLabel();
        String student2PrintedAddress = student2Address.outputAsLabel();
    

        // Print recruitment process details
        System.out.println("\nRecruitment Process:");
        System.out.println("Professor " + professor.getName() + " at University X is recruiting students for a research project.");
        System.out.println("\nStudent 1: " + student1.name + " - " + (addressValid1 ? "Valid Address: " + student1PrintedAddress + "," : "Invalid Address, ") + (eligible1 ? "Eligible for Enrollment - This student is hired!" : "Not Eligible for Enrollment"));
        System.out.println("\nStudent 2: " + student2.name + " - " + (addressValid2 ? "Valid Address: " + student2PrintedAddress + "," : "Invalid Address, ") + (eligible2 ? "Eligible for Enrollment - This student is hired!" : "Not Eligible for Enrollment"));
    }
}
