public class Main {
    public static void main(String[] args) {
        // Create Gradebook object called grades
        Gradebook grades = new Gradebook();

        // Create Students inside of grades
        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

        // Create Assignments
        grades.addAssignment("Stacks And Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        // Grade Assignments
        grades.gradeAssignment("Stacks And Queues Station Activity", "Tyler", 94);
        grades.gradeAssignment("Stacks And Queues Station Activity", "James", 14);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Ethan", 5);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Scotty", 100);
        grades.gradeAssignment("Stacks And Queues Station Activity", "David", 0);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Patrick", 79);

        grades.gradeAssignment("Stacks and queues programs", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues programs", "James", 64);
        grades.gradeAssignment("Stacks and queues programs", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues programs", "Scotty", 101);
        grades.gradeAssignment("Stacks and queues programs", "David", 26);
        grades.gradeAssignment("Stacks and queues programs", "Patrick", 99);

        grades.gradeAssignment("Stacks and queues quiz", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues quiz", "James", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Scotty", 87);
        grades.gradeAssignment("Stacks and queues quiz", "David", 92);
        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83);

        grades.gradeAssignment("Github Exploration", "Tyler", 96);
        grades.gradeAssignment("Github Exploration", "James", 43);
        grades.gradeAssignment("Github Exploration", "Ethan", 100);
        grades.gradeAssignment("Github Exploration", "Scotty", 97);
        grades.gradeAssignment("Github Exploration", "David", 28);
        grades.gradeAssignment("Github Exploration", "Patrick", 100);

        // Print out the stats for all assignments and overall grades
        System.out.println("Stats for all assignments:");
        System.out.println("Stacks And Queues Station Activity - Average Grade: " + grades.getAverageGrade("Stacks And Queues Station Activity") +
                ", Minimum Grade: " + grades.getMinimumGrade("Stacks And Queues Station Activity") +
                ", Maximum Grade: " + grades.getMaximumGrade("Stacks And Queues Station Activity"));
        System.out.println("Stacks and queues programs - Average Grade: " + grades.getAverageGrade("Stacks and queues programs") +
                ", Minimum Grade: " + grades.getMinimumGrade("Stacks and queues programs") +
                ", Maximum Grade: " + grades.getMaximumGrade("Stacks and queues programs"));
        System.out.println("Stacks and queues quiz - Average Grade: " + grades.getAverageGrade("Stacks and queues quiz") +
                ", Minimum Grade: " + grades.getMinimumGrade("Stacks and queues quiz") +
                ", Maximum Grade: " + grades.getMaximumGrade("Stacks and queues quiz"));
        System.out.println("Github Exploration - Average Grade: " + grades.getAverageGrade("Github Exploration") +
                ", Minimum Grade: " + grades.getMinimumGrade("Github Exploration") +
                ", Maximum Grade: " + grades.getMaximumGrade("Github Exploration"));

        // Print the grades object
        System.out.println("\nGradebook:");
        System.out.println(grades);

        // Print the object of each student
        System.out.println("\nStudents:");
        for (Student student : grades.getStudents()) {
            System.out.println(student);
        }
    }
}
