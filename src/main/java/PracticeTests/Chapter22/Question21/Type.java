package PracticeTests.Chapter22.Question21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Type {

    protected Object[][] getContents() {
        return new Object[][] {{ "keys", new ArrayList<String>()}};
    }

    public static void main(String... args) {
        ResourceBundle rb = ResourceBundle.getBundle("PracticeTests.Chapter22.Question21.Type");
        List<String> keys = (List) rb.getObject("keys");
        keys.add("q");
        keys.add("w");
        keys.add("e");
        keys.add("r");
        keys.add("t");
        keys.add("y");
        System.out.println(((List) rb.getObject("keys")).size());
    }
}
