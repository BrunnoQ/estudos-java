package br.edu.brunno.colecoes.hard;

import br.edu.brunno.colecoes.dto.CourseDTO;
import br.edu.brunno.colecoes.dto.LessonDTO;
import br.edu.brunno.colecoes.dto.Student;

import java.util.*;

public class TestListOfLessons {

    public static void main(String[] args) {

        LessonDTO lessonDTO1 = new LessonDTO("reviewing classes", 10);
        LessonDTO lessonDTO2 = new LessonDTO("noob forever class", 700);
        LessonDTO lessonDTO3 = new LessonDTO("how to get rich", 501);
        Student student = new Student("Carla", 321);
        Student student1 = new Student("Ramon",125);
        Student student2 = new Student("Maristela", 451);


        List<LessonDTO> lessons = new ArrayList<>();
        lessons.add(lessonDTO1);
        lessons.add(lessonDTO2);
        lessons.add(lessonDTO3);

        Collections.sort(lessons);
        lessons.forEach(a -> System.out.print("\n sorted by course:"+a));
        lessons.sort(Comparator.comparing(LessonDTO::getTime));
        lessons.forEach(a -> System.out.print("\n sorted by time:"+a));

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        CourseDTO courseDTO = new CourseDTO("Noob first", "Brunno", lessons,students);
        System.out.println("\n"+courseDTO.getTempoTotal());

    }

}
