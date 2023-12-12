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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public model.Experience getExperience() {
        return Experience;
    }

    public void setExperience(model.Experience experience) {
        Experience = experience;
    }
}
