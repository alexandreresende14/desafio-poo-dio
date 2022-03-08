import com.dio.desafio.dominio.Course;
import com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("java course");
        course1.setDescription("abstracting a bootcamp");
        course1.setCourseLoad(2);

        Course course2 = new Course();
        course2.setTitle("course dotnet");
        course2.setDescription("introduction to dotnet");
        course2.setCourseLoad(4);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java mentorship");
        mentorship1.setDescription("How to solve code challenges");
        mentorship1.setDate(LocalDate.now());


        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
    }
}
