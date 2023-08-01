public class Triangle {
    double a;
     double b;
     double c;

     Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
         double getA() {
            return a;
        }

         double getB() {
            return b;
        }

         double getC() {
            return c;
        }

         double area() {
            // Вычисление площади треугольника по формуле Герона
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }
