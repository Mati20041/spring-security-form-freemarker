package pl.mati.controller;

public class PostCommand {
    private String content;

    public PostCommand() {
    }

    public PostCommand(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostCommand{" +
                "content='" + content + '\'' +
                '}';
    }
}
