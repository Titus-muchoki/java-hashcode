package Kitten;

import java.util.ArrayList;
import java.util.Objects;

public class Kitten {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitten kitten = (Kitten) o;
        return age == kitten.age && intact == kitten.intact && name.equals(kitten.name) && sex.equals(kitten.sex) && breeds.equals(kitten.breeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, intact, breeds);
    }

    String name;
    int age;
    String sex;
    boolean intact;
    ArrayList<String> breeds;

    public Kitten(String name, int age, String sex, boolean intact, ArrayList<String> breeds) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.intact = intact;
        this.breeds = breeds;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public boolean isIntact() {
        return intact;
    }

    public ArrayList<String> getBreeds() {
        return breeds;
    }
}