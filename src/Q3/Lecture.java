package Q3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
//      Create  a Lecture class that will store the topic, the lecturer name and an appropriate collection

public class Lecture
{
    // store the topic
    private String topic;

    // lecturer name
    private String name;

    // appropriate collection
    private Set<String> students;

    public Lecture(String topic, String lecturer) {
        this.topic = topic;
        this.name = lecturer;
        this.students = new HashSet<>();
    }

    public void recordAttendance(String studentId) {
        students.add(studentId);
    }

    public Set<String> getAttendees() {
        return students;
    }
    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<String> getStudents()
    {
        return students;
    }

    public void setStudents(Set<String> students)
    {
        this.students = students;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Lecture)) return false;
        Lecture lecture = (Lecture) o;
        return Objects.equals(getTopic(), lecture.getTopic()) && Objects.equals(getName(), lecture.getName()) && Objects.equals(getStudents(), lecture.getStudents());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getTopic(), getName(), getStudents());
    }
}
