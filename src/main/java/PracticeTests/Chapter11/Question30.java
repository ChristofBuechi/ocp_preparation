package PracticeTests.Chapter11;

public class Question30 {
    class Building{}
    class House extends Building{}

    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }
}
