package edu.guilford;

import java.util.Arrays;

public class ClassroomDrive {

    public static void main(String[] args) {
        Classroom[] classrooms = {
            //new MathClass("\nMs. Smith", 101, "12th"),
            new EnglishClass("\nMr. Johnson", 233, "11th"),
            new ScienceClass("Mrs. Williams", 305, "12th"),
            new MathClass("Mrs. Brown", 102, "12th"),
            //new ScienceClass("\nMr. Rob", 401, "12th")
            new EnglishClass("Ms. Smith", 101, "12th"),
            new ScienceClass("Mr. Rob", 401, "12th"),
            new MathClass("Ms. tom", 130, "12th")


        };

        Arrays.sort(classrooms);

        //to method 
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getTeacherName() + " teaches " 
            + classroom.getSubject() + " in room " + classroom.getRoomNumber() 
            + " to " + classroom.getGradeLevel() + " grade students.");
        }
        MathClass mathClassroom1 = new MathClass("Ms. Smith", 102, "12th");
        MathClass mathClassroom2 = new MathClass("Mrs. Brown", 102, "12th");
    

        int comparisonResult = mathClassroom1.compareTo(mathClassroom2);

        if (comparisonResult < 0) {
            System.out.println("\nmathClassroom1 comes before mathClassroom2");
        } else if (comparisonResult > 0) {
            System.out.println("\nmathClassroom2 comes before mathClassroom1");
        } else {
            System.out.println("\nmathClassroom1 and mathClassroom2 are the same");
        }

        //print out the number of students in each classroom 
        System.out.println("\nNumber of students in each classroom: ");
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getSubject() + " has " + classroom.NumberOfStudents() + " students.");
        }
        //compare based on number of students
        System.out.println("\nCompare based on number of students: ");
        for (int i = 0; i < classrooms.length; i++) {
            for (int j = i + 1; j < classrooms.length; j++) {
                if (classrooms[i].NumberOfStudents() < classrooms[j].NumberOfStudents()) {
                    Classroom temp = classrooms[i];
                    classrooms[i] = classrooms[j];
                    classrooms[j] = temp;
                }
            }
        }
        //print out results
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.getTeacherName() + " teaches "+classroom.getSubject()  +" and has "
             + classroom.NumberOfStudents() + " students.");
        }
        
    }
}