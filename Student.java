import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<String> assignmentNames;
    private List<Double> assignmentGrades;

    public Student(String name) {
        this.name = name;
        this.assignmentNames = new ArrayList<>();
        this.assignmentGrades = new ArrayList<>();
    }

    public void addAssignment(String assignName) {
        assignmentNames.add(assignName);
        assignmentGrades.add(null); // start as ungraded
    }

    public void gradeAssignment(String assignment, double grade) {
        int index = assignmentNames.indexOf(assignment);
        if (index != -1) {
            assignmentGrades.set(index, grade);
        } else {
            System.out.println("Assignment not found for student: " + name);
        }
    }

    public double getAssignmentGrade(String assignment) {
        int index = assignmentNames.indexOf(assignment);
        if (index != -1) {
            return assignmentGrades.get(index);
        }
        return 0.0; // default to 0 if assignment not found
    }

    public double getOverallGrade() {
        double sum = 0.0;
        int count = 0;
        for (Double grade : assignmentGrades) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }
        if (count == 0) {
            return 0.0; // If no assignments are graded, return 0
        } else {
            return sum / count; // Calculate average grade
        }
    }

    @Override
    public String toString() {
        return name + " - Average Grade: " + getOverallGrade();
    }
}