package edu.guilford;

public class ScienceClass extends Classroom{
    private String gradeLevel; 
    
    public ScienceClass(String teacherName, int roomNumber, String gradeLevel) {
        super(teacherName, roomNumber, "Science");
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
    public String getSubject() {
        return "Science";
    }

    @Override
    public int NumberOfStudents() {
        return 50; 
    }

    
}
