package br.edu.brunno.colecoes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
public class Student {

    private String name;
    private int numberRegistration;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numberRegistration=" + numberRegistration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberRegistration == student.numberRegistration && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberRegistration);
    }
}
