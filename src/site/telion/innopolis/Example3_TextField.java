package site.telion.innopolis;

public class Example3_TextField {
    private String text = "";

    public void enter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void replaceStringByMapper(Example3_Mapper mapper) {
        this.text = mapper.map(this.text);
    }
}
