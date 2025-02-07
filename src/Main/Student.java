package Main;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private static final double PASSING_GRADE = 60.0;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public boolean isApproved() {
        return finalGrade() >= PASSING_GRADE;
    }

    public double missingPoints() {
        return isApproved() ? 0.0 : PASSING_GRADE - finalGrade();
    }

    @Override
    public String toString() {
        return "NOTA FINAL = " + String.format("%.2f", finalGrade()) + "\n" + 
               (isApproved() ? "PASS" : "FAILED\nFALTARAM " + String.format("%.2f", missingPoints()) + " PONTOS");
    }
}
