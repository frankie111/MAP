public class MenuItem {
    private Integer itemId;
    private String name;
    private String category;
    private Float price;
    private String availability;

    public static MenuItem fromString(String str){
        String[] elems = str.split("-");
        return new MenuItem(Integer.parseInt(elems[0]), elems[1], elems[2], Float.parseFloat(elems[3]), elems[4]);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }

    public MenuItem(Integer itemId, String name, String category, Float price, String availability) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
