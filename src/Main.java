
public class Main {
    public static void main(String[] args) {
        int operand1 = 4;
        int operand2 = 2;
        System.out.println("4 в степени 2: " + (int) Math.pow(operand1, operand2));
        System.out.println("Корень из 4: " + (int) Math.sqrt(operand1));
        float D;
        int a = 1, b = -8, c = 15;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else System.out.println("Уравнение не имеет действительных корней");
    }
}

