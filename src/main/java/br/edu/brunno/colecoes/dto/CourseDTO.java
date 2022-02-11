package br.edu.brunno.colecoes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class CourseDTO {

    private String name;
    private String instructor;
    private List<LessonDTO> lessons;
    private Set<Student> students;

    public int getTempoTotal(){
        return this.lessons.stream().mapToInt(LessonDTO::getTime).sum();
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", lessons=" + lessons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDTO course = (CourseDTO) o;
        return name.equals(course.name) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, instructor);
    }
}
