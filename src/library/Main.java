package library;

import library.model.*;

public class Main {

    public static void main(
            String[] args
    ) {

        Person user =
                new User("Ivan");

        Person librarian =
                new Librarian("Anna");

        user.activate();
        librarian.activate();

        user.showInfo();
        librarian.showInfo();

        System.out.println(
                user.getRole()
        );

        System.out.println(
                librarian.getRole()
        );

        LibraryItem book =
                new Book(
                        "1984",
                        new Author("George Orwell")
                );

        LibraryItem resource =
                new ElectronicResource(
                        "Java Guide",
                        "https://example.com"
                );

        book.getItemInfo();
        resource.getItemInfo();

        book.open();
        resource.open();

        System.out.println(
                book.getItemType()
        );

        System.out.println(
                resource.getItemType()
        );
    }
}
