package OOP.Lesson_3_Inheritance.Lab_03.RandomArrayList_03;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<Integer> extends ArrayList<Object> {

    public Object getRandomElement() {
        int index = ThreadLocalRandom.current().nextInt(0, size());
        return get(index);
    }
}
