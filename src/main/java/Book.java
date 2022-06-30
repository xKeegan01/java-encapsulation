public class Book {
    private String name;
    private String author;
    private int year;

    public void setName (String name) {
        this.name = name;
    }
    public String getName() { return name; }

    public void setAuthor (String author) {
        this.author = author;
    }
    public String getAuthor() { return author; }

    public void setYear (int year) {
        this.year = year;
    }

    public int getYear() { return year; }

    public void bookInfo () {
        System.out.println(name);
        System.out.println(author);
        System.out.println(year);
    }
}