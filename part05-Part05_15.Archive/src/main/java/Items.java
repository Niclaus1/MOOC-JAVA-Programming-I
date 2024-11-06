public class Items {
    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Items)) {
            return false;
        }

        Items comparedItems = (Items) compared;

        return this.identifier.equals(comparedItems.identifier);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return identifier + ": " + name;
    }

}
