package PracticeTests.Chapter11;

public class Question18 {

    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        Building p = (House) b;
//        House q = (Building) h; fails to compile
    }
}

class Building {}
class House extends Building{}

