package edu.guilford;

public class EnglishClass extends Classroom {
    private String gradeLevel;

    public EnglishClass(String teacherName, int roomNumber, String gradeLevel) {
        super(teacherName, roomNumber, "English");
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String getSubject() {
        return "English";
    }

    @Override
    public int NumberOfStudents() {
        return 19;
    }

}
