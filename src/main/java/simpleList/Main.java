package simpleList;

import simpleList.model.entity.Simple;
import simpleList.model.entity.SimpleArray;

public class Main {


    public static void main(String[] args) {

        Simple<String> strings = new SimpleArray<>();

        strings.add("first");
        strings.add("second");
        strings.add("third");

        print(strings);
        strings.update(1, "updated");
        print(strings);

        strings.delete(0);

        print(strings);
    }

    private static void print(Simple<String> strings) {

        for (Object s : strings) {
            System.out.println(s);
        }
    }
}