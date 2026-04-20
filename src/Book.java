public class Book {
    private String title;
    private Author writer;
    private int publishingDate;

    public Book(String title, Author writer, int publishingDate) {
        this.title = title;
        this.writer = writer;
        this.publishingDate = publishingDate;
    }

    public String getTitle() {
        return title;
    }

    public Author getWriter() {
        return writer;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        if (publishingDate < 1949 || publishingDate > 2059) {
            System.out.println("Too old or too future. Need archive or time travel.");
        } else {
            this.publishingDate = publishingDate;
        }
    }
}
