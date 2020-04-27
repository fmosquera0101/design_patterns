package flyweight;

//Flaywieght
public class Article {

    private final String name;
    private final double price;

    public Article(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
