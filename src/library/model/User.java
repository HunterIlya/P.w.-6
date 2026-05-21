package library.model;

public class User extends Person {

    private boolean active;

    public User(String name) {

        super(name);
        this.active = false;
    }

    @Override
    public void showInfo() {

        System.out.println(
                "User.showInfo(): "
                        + name
                        + ", active="
                        + active
        );
    }

    @Override
    public void activate() {

        active = true;

        System.out.println(
                "User activated"
        );
    }

    @Override
    public String getRole() {

        return "User";
    }
}
