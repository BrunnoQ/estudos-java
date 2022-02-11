package br.edu.brunno.colecoes.hard;

import br.edu.brunno.colecoes.dto.LessonDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListOfLessons {

    public static void main(String[] args) {

        LessonDTO lessonDTO1 = new LessonDTO("reviewing classes", 10);
        LessonDTO lessonDTO2 = new LessonDTO("noob forever class", 700);
        LessonDTO lessonDTO3 = new LessonDTO("how to get rich", 501);

        List<LessonDTO> lessons = new ArrayList<>();
        lessons.add(lessonDTO1);
        lessons.add(lessonDTO2);
        lessons.add(lessonDTO3);
        Collections.sort(lessons);
        lessons.forEach(a -> System.out.print("\n sorted by course:"+a));
        lessons.sort(Comparator.comparing(LessonDTO::getTime));
        lessons.forEach(a -> System.out.print("\n sorted by time:"+a));

    }

}
