package PracticeTests.Chapter13.Question12;

class Magazine {
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
    public String toString() {
        return name;
    }
}
