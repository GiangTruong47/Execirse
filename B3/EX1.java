package B3;

public class EX1 {
        private double a, b, c;

        public EX1(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public Double getRoot1() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return null;
            }
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }

        public Double getRoot2() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return null;
            }
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }

        public static void main(String[] args) {
            EX1 eq = new EX1(1, 3, 2);
            double delta = eq.getDiscriminant();
            System.out.println("Phuong trinh: 1*x^2 + 3*x + 2 = 0");
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + eq.getRoot1());
            } else {
                System.out.println("Phuong trinh co 2 nghiem: ");
                System.out.println("x1 = " + eq.getRoot1());
                System.out.println("x2 = " + eq.getRoot2());
            }
        }
}
