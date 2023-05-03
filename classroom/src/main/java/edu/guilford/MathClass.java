package edu.guilford;

public class MathClass extends Classroom {
    private String gradeLevel;

    public MathClass(String teacherName, int roomNumber, String gradeLevel) {
        super(teacherName, roomNumber, "Math");
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
    // public String getSubject() {
    // return "Math";
    // }

    @Override
    public int NumberOfStudents() {
        return 15;
    }

}
