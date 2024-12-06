public class Main {
    public static void main(String[] args) {
        // 1.
        Student student1 = new Student("Алиса", "Смит", "Коктем-2",  24);
        Student student2 = new Student("Азамат", "Роджерс", "Орбита-1", 1);
        Student student3 = new Student("Кристина", "Беннет", "Самал-2", 16);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // 2.
        Triangle myTriangle = new Triangle(3,4,5);
        myTriangle.perimeterOfTriangle();
        myTriangle.areaOfTriangle();

        // 3.
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println("Площадь прямоугольника = " + rectangle1.returnArea());
        System.out.println("Площадь прямоугольника = " + rectangle2.returnArea());

        // 4.
        Average myAverage = new Average();
        myAverage.averageNumber(40, 30, 60);

        // 5.
        Movie myMovie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie myMovie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println(myMovie1);
        System.out.println(myMovie2);


    }
}