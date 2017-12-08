import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Blue");
        color.add("red");
        System.out.println(color);
        color.remove("red");
        System.out.println(color);
    }
}