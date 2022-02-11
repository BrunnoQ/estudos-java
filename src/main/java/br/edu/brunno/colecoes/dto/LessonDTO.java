package br.edu.brunno.colecoes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LessonDTO implements Comparable<LessonDTO> {
    private String title;
    private int time;

    @Override
    public String toString() {
        return "LessonDTO{" +
                "title='" + title + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public int compareTo(LessonDTO o) {
        return title.compareTo(o.getTitle());
    }
}