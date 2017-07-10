package ReviewQuestions.Chapter1.Q2;

/**
 * Created by christof on 27.05.17.
 */
public class Animal {
    private int size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return size == animal.size;
    }

    @Override
    public int hashCode() {
        return size;
    }
}
