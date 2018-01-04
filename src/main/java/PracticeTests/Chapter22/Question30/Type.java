package PracticeTests.Chapter22.Question30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Type extends ListResourceBundle{

    protected Object[][] getContents() {
        return new Object[][] {{ "keys", new ArrayList<String>()}};
    }

    public static void main(String... args) {
        ResourceBundle rb = ResourceBundle.getBundle("Type"); //throws exception because the package structure is missing
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
