
public class Author {
    private final String name;
    private String secondName;
    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }
}
