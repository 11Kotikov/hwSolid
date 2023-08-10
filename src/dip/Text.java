package dip;

public class Text implements Printable{
    String text;
    public Text(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
