package dip;
/*
//В этом примере класс Printer зависит от конкретного класса Text.
public class Printer {
    public void print(Text text) {
        System.out.println(text.getText());
    }
}
 */
//в этом примере класс Printer зависит от абстракции,
// может распечатать что угодно реализующее этот интерфейс.

public class Printer {
    public void print (Printable toPrint) {
        System.out.println(toPrint.getText());
    }
}
