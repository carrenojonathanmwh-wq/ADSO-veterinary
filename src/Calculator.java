import javax.swing.JOptionPane;

public class Calculator {
    // método sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    // método restar
    public int restar(int a, int b) {
        return a - b;
    }

    // método multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // método dividir
    public double dividir(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Error: no se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }

    // método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // método mayor
    public void esMayor(int num1, int num2) {
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, num2 + " es mayor que " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos números son iguales");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Menú de opciones
        String opcion = JOptionPane.showInputDialog(
                "Seleccione la operación:\n" +
                        "1. Sumar\n" +
                        "2. Restar\n" +
                        "3. Multiplicar\n" +
                        "4. Dividir\n" +
                        "5. Sumar dos números y verificar si el resultado es primo\n" +
                        "6. Comparar cuál número es mayor"
        );

        int choice = Integer.parseInt(opcion);

        if (choice == 5) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2"));
            int suma = calculator.sumar(num1, num2);

            if (calculator.esPrimo(suma)) {
                JOptionPane.showMessageDialog(null, "La suma (" + suma + ") es un número primo");
            } else {
                JOptionPane.showMessageDialog(null, "La suma (" + suma + ") NO es un número primo");
            }
        } else if (choice == 6) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2"));
            calculator.esMayor(num1, num2);
        } else {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2"));

            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + calculator.sumar(num1, num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + calculator.restar(num1, num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + calculator.multiplicar(num1, num2));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El resultado de la división es: " + calculator.dividir(num1, num2));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}
