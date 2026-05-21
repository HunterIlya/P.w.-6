package library.model;

public class Book extends LibraryItem {

    private Author author;

    public Book(
            String title,
            Author author
    ) {

        super(title);
        this.author = author;
    }

    @Override
    public void getItemInfo() {

        System.out.println(
                "Book: "
                        + title
                        + ", author="
                        + author
        );
    }

    @Override
    public String getItemType() {

        return "Book";
    }

    @Override
    public void open() {

        System.out.println(
                "Opening printed book"
        );
    }
}
