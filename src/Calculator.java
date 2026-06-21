import javax.swing.JOptionPane;

public class Calculator {
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2"));
        int resultado = calculator.sumar(num1, num2);

        // Mostrar en consola
        System.out.println("El resultado de la suma es: " + resultado);

        // Mostrar en cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
    }
}

