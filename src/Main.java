import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Course;
import com.dio.desafio.dominio.Dev;
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


        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship1);

        Dev devAlexandre = new Dev();
        devAlexandre.setName("Alexandre");
        devAlexandre.registerBootcamp(bootcamp);
        System.out.println("Name: " + devAlexandre.getName() + " - Registered Contents" + devAlexandre.getRegisteredContents());
        devAlexandre.progress();
        System.out.println("-");
        System.out.println("Name: " + devAlexandre.getName() + " - Registered Contents" + devAlexandre.getRegisteredContents());
        System.out.println("Name: " + devAlexandre.getName() + " - Concluded Contents" + devAlexandre.getConcludedContents());
        System.out.println("XP: " + devAlexandre.calculateTotalXp());


        System.out.println("==============================");
        Dev devAnderson = new Dev();
        devAnderson.setName("Anderson");
        devAnderson.registerBootcamp(bootcamp);
        System.out.println("Name: " + devAnderson.getName() + " - Registered Contents" + devAnderson.getRegisteredContents());
        System.out.println("-");
        devAnderson.progress();
        devAnderson.progress();
        System.out.println("Name: " + devAnderson.getName() + " - Registered Contents" + devAnderson.getRegisteredContents());
        System.out.println("Name: " + devAnderson.getName() + " - Concluded Contents" + devAnderson.getConcludedContents());
        System.out.println("XP: " + devAnderson.calculateTotalXp());
    }
}
