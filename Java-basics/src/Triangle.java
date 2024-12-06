// 2.
public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void perimeterOfTriangle() {
        int perimeter = a + b + c;
        System.out.println("Периметр треугольника = " + perimeter);
    }

    public void areaOfTriangle() {
        double p = (double) (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника = " + area);
    }
}
