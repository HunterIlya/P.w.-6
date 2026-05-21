package library.model;

public class ElectronicResource
        extends LibraryItem {

    private String url;

    public ElectronicResource(
            String title,
            String url
    ) {

        super(title);
        this.url = url;
    }

    @Override
    public void getItemInfo() {

        System.out.println(
                "Electronic resource: "
                        + title
                        + ", url="
                        + url
        );
    }

    @Override
    public String getItemType() {

        return "ElectronicResource";
    }

    @Override
    public void open() {

        System.out.println(
                "Opening website: "
                        + url
        );
    }
}
