public class Main {
    public static void main(String[] args) {
            double a = 15.7;
            double b = 12.5;
            double c = 20.3;

            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Сторона a: " + triangle.getA());
            System.out.println("Сторона b: " + triangle.getB());
            System.out.println("Сторона c: " + triangle.getC());
            System.out.println("Площадь треугольника: " + triangle.area());
        }
    }
