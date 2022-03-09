package com.dio.desafio.dominio;

public class Course extends Content{

    private int courseLoad;

    @Override
    public double calculateXP() {
        return XP_DEFAULT * courseLoad;
    }

    public Course() {
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
