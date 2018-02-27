package task3;

import java.util.Objects;

public class Player {
    private String name;
    private String lastname;
    private int points;



    public Player(String name, String lastname, int points) {
        this.name = name;
        this.lastname = lastname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String fullName() {
        return name + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return points == player.points &&
                Objects.equals(name, player.name) &&
                Objects.equals(lastname, player.lastname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastname, points);
    }
}
