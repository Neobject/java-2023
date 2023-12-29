package jc.lab10;

public class Sportsman {
    private final String firstName;
    private final String lastName;
    private final int height;
    private final int weight;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Sportsman(String firstName, String lastName, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }
}