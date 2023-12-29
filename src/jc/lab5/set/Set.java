package jc.lab5.set;

public class Set <T> {
    private T[] set;

    public T[] getSet() {
        return set;
    }

    public void setSet(T[] set) {
        this.set = set;
    }

    public boolean contains(T value)
    {
        for (T element : set) {
            if (element == value) return true;
        }

        return false;
    }

    public Set(T[] set) {
        setSet(set);
    }
}