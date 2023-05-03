package edu.guilford;


public abstract class Classroom implements Comparable<Classroom> {
    private String teacherName;
    private int roomNumber;
    private String subject;

    public Classroom(String teacherName, int roomNumber, String subject) {
        this.teacherName = teacherName;
        this.roomNumber = roomNumber;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getSubject() {
        return subject;
    }

    public abstract int NumberOfStudents();

    public abstract String getGradeLevel();

    @Override
    public int compareTo(Classroom other) {
        if (this.getGradeLevel().equals(other.getGradeLevel())) {
            if (this.getSubject().equals(other.getSubject())) {
                return this.getRoomNumber() - other.getRoomNumber();
            } else {
                return this.getSubject().compareTo(other.getSubject());
            }
        } else {
            return this.getGradeLevel().compareTo(other.getGradeLevel());
        }
    }
}
