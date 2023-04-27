package com.basicexercises.parttwo;

import java.util.Comparator;

public class Student {
    private final String id;
    private final String name;
    private final int mark;

    public Student(String id, String name, int mark){
        this.id = id;
        this.name=name;
        this.mark=mark;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public static final Comparator<Student> sortMarkComparator = (m1, m2) -> {
        int mark1 = m1.getMark();
        int mark2 = m2.getMark();
        return mark1-mark2;
    };
}
