package in.scalive.beans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int roll;

    private String name;

    private Map<String, Integer> scores;

    public Student(
            @Value("${student.roll}") int roll,
            @Value("${student.name}") String name,
            @Value("#{${student.scores}}") Map<String, Integer> scores) {

        this.roll = roll;
        this.name = name;
        this.scores = scores;

        System.out.println("student constructor called");
    }

    public void display() {
        System.out.println("name is: " + name);
        System.out.println("roll is: " + roll);
        System.out.println("scores: " + scores);
    }
}