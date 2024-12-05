// Конструктор | Переиспользование
public class Animal {
    String name;
    String color;
    double weight;

    public Animal() {
        name = "Кот";
        color = "Серый";
        weight = 2.5;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color) {
        this(name);
        this.color = color;
    }

    public Animal(String name, String color, double weight) {
        this(name, color);
        this.weight = weight;
    }
}
