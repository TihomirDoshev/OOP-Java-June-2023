package OOP.Lesson_04_Interfaces_And_Abstraction.Exercise_04.Тelephony_05;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Browsable,Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[\\d]+");

        for (String url : numbers) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()){
                sb.append("Invalid URL!");
                sb.append(System.lineSeparator());
            }else {
                sb.append(String.format("Browsing: %s!%n",urls));
            }
        }

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[\\D]+");

        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()){
                sb.append("Invalid number!");
                sb.append(System.lineSeparator());
            }else {
                sb.append(String.format("Calling... %s%n",number));
            }
        }

        return sb.toString();
    }


}
