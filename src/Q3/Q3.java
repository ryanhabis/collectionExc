package Q3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Q3
{
    //3.	An automatic student ID reader is used to record student attendances at Lectures.
    //      Create  a Lecture class that will store the topic, the lecturer name and an appropriate collection
    //      of student id numbers (String) called students identifying those who attended the lecture.
    //      (Choose the collection based on the operations required below).
    //      Populate an ArrayList of Lectures (called lectures !) with two Lecture objects that contain sensible data.
    //      Populate each lecture with 3 or 4 student attendees.

    public static void main(String[] args) throws FileNotFoundException
    {
        List<Lecture> lectures = new ArrayList<>();
        Lecture lecture = new Lecture("Introduction to Computer Science", "Dr. Smith");
        lecture.recordAttendance("123456789");
        lecture.recordAttendance("987654321");
        Set<String> students = lecture.getAttendees();
        System.out.println(students);
    }

    //  Write methods to achieve the following:
    //  a.	Display details of each lecture, including the students (ids) who attended them.
    //  b.	Find and display the IDs of students who attended all lectures.
    //  c.	Find and display all students to attended the first lecture only.
    //  d.	Display IDs of students who attended one or more lectures.
}
