import java.util.*;

class Student {
    private String name;
    private Map<String, Double> assignments;

    public Student(String name) {
        this.name = name;
        this.assignments = new HashMap<>();
    }

    public void addAssignment(String assignName) {
        assignments.put(assignName, null); // start as ungraded
    }

    public void gradeAssignment(String assignment, double grade) {
        assignments.put(assignment, grade);
    }

    public double getAssignmentGrade(String assignment) {
        return assignments.getOrDefault(assignment, 0.0); // default to 0 if assignment not found
    }

    public double getOverallGrade() {
        double sum = 0.0;
        int count = 0;
        for (Double grade : assignments.values()) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count; // avoid division by zero
    }

    @Override
    public String toString() {
        return name + " - Average Grade: " + getOverallGrade();
    }
}