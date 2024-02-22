import java.util.ArrayList;
public class Gradebook {

    private ArrayList<String> assignments;
    private ArrayList<Student> students;
    private ArrayList<String> names;

    public Gradebook(){
    }

    public void createStudent(String name){
        Student student = new Student(name);
        students.add(student);
        names.add(name);
    }

    public void addAssignment(String assignment){
        assignments.add(assignment);
    }

    public void gradeAssignment(String assignment, String studentName, double grade){
        
    }

    public double getAverageGrade(String assignment){
        double total = 0;
        int count = 0;
        for (int i = 0; i<students.size(); i++){
            Student s = students.get(i);
            double grade = s.getAssignmentGrade(assignment);
            total+=grade;
            count++;
        }
        return total/count;
    }

    public double getMinimumGrade(String assignment){
        double minGrade = 0.0;
        for (int i = 0; i<students.size(); i++){
            Student s = students.get(i);
            double grade = s.getAssignmentGrade(assignment);
            if (i==0){
                minGrade = grade;
            }
            else{
                if (grade < minGrade){
                    minGrade = grade;
                }
            }
        }
        return minGrade;
    }

    public double getMaximumGrade(String assignment){
        double maxGrade = 0.0;
        for(int i=0; i<students.size(); i++){
            Student s = students.get(i);
            double grade = s.getAssignmentGrade(assignment);
            if(i==0){
                maxGrade = grade;
            }
            else{
                if (grade>maxGrade)
                    maxGrade = grade;
            }
        }
        return maxGrade;
    }

    public double getAverageOverall(){

    }

    public double getMaxOverall(){

    }

    public double getMinOverall(){

    }

    public double getStudentsGrade(String studentName){

    }

    public String toString(){

    }

    public Student getStudent(String studentName){

    }

}
