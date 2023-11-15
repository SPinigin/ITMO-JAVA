package ru.itmo.java.basics.lab5.task1;

public class LongestWord {
    public String str;

    {
        str = "Lorem ipsum dolor sit amet consectetur adipisicing elit." +
                "Eum temporibus sint non explicabo veniam, commodi facere molestiae soluta. " +
                "Possimus, fugit eos. Ratione voluptate minima exercitationem " +
                "iste aspernatur architecto nulla rerum.";
    }

    // метод разбивки строки и поиска саммого длинного слова
    public void longestWordSearch() {
        String[] words = str.split("[., ]+");
        //вывод массива после разбивки строки по разделителям
        //for (String word : words) {
            //System.out.println(word);
        String res = " ";
        for (String s : words) {
            if (s.length() > res.length())
                res = s;
        }
        System.out.print("Самое длинное слово текста: \n" + str + "\nэто - " + res);
    }

    public static void main (String[] args) {
        LongestWord result = new LongestWord();
        result.longestWordSearch();
    }
}