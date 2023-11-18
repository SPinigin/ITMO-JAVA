package ru.itmo.java.basics.lab5.task3;

public class CensorshipReplace {
    public String str;

    {
        str = "Lorem ipsum dolor sit amet consectetur adipisicing elit бяка." +
                "Eum temporibus sint non explicabo veniam, commodi facere molestiae soluta бяка. " +
                "Possimus, fugit eos бяка. Ratione voluptate minima exercitationem " +
                "iste aspernatur architecto nulla rerum.";
    }

    public void Censorship() {
        System.out.println(str.replace("бяка", "[вырезано цензурой]"));
    }

    public static void main(String[] args) {
        CensorshipReplace res = new CensorshipReplace();
        res.Censorship();
    }
}