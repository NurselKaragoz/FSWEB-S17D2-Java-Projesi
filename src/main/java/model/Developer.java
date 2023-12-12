package model;

public class Developer {
    private int id;
    private String name;
    private double salary;
    private Experience Experience;

    public Developer(int id, String name, double salary, model.Experience experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Experience = experience;
    }
}
