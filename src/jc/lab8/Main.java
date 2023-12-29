package jc.lab8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Додавання слова "процес" після кожного слова, що закінчується на "-ння"
        System.out.println(insert("Читання, прибирання, збирання, перепис.", "ння", "(процес)"));

        //Правильні
        System.out.println(check("#FFFFFF"));
        System.out.println(check("#FF3421"));
        System.out.println(check("#00ff00"));
        //Неправильні
        System.out.println(check("232323"));
        System.out.println(check("f#fddee"));
        System.out.println(check("#fd2"));
    }

    public static String insert(String text, String ending, String word) { //Вставляє слова після тих, що мають відповідне закінчення
        String regex = "(" + Pattern.quote(ending) + ")\\b";
        return text.replaceAll(regex, "$1 " + word);
    }
    public static boolean check(String text) { //Перевіряє чи текст є шістнадцятковим числом
        return text.matches("#[0-9a-fA-F]{6}");
    }
}