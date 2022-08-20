package site.telion.innopolis;

public abstract class Example1_TextField {
    protected String text = "";

    public void enter(String text) {
        beforeEnter();
        this.text = text;
        afterEnter();
    }

    public String getText() {
        return text;
    }

    public abstract void beforeEnter();

    public abstract void afterEnter();
}
