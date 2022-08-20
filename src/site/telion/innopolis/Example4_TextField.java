package site.telion.innopolis;

public class Example4_TextField {
    private String text = "";

    public void enter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void replaceStringByMapper(Example4_Mapper mapper) {
        this.text = mapper.map(this.text);
    }
}
