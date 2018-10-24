package pl.put.poznan.transformer.logic;



public class SimpleObject {
    private final long id;
    private final String content;
    private long powierzchnia;

    public SimpleObject(long id, String content, long powierzchnia) {
        this.id = id;
        this.content = content;
        this.powierzchnia = powierzchnia;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getPowierzchnia() {
        return powierzchnia;
    }
}
