import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class Calculadora {
    private JTextField valor1;
    private JTextField valor2;
    private JTextField resultadoArea;
    private JTextField resultadoPerimetro;
    private JButton cuadradoButton;
    private JButton rectanguloButton;
    private JButton circuloButton;
    private JButton trianguloButton;
    public JPanel mainPanel;

    public Calculadora() {
        cuadradoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(valor1.getText());

                double area = lado * lado;
                double perimetro = 4 * lado;

                resultadoArea.setText(String.format("%.2f", area));
                resultadoPerimetro.setText(String.format("%.2f", perimetro));
            }
        });
        rectanguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double largo = Double.parseDouble(valor1.getText());
                double ancho = Double.parseDouble(valor2.getText());
                double area = largo * ancho;
                double perimetro = 2 * (largo + ancho);
                resultadoArea.setText(String.format("%.2f", area));
                resultadoPerimetro.setText(String.format("%.2f", perimetro));
            }
        });
        circuloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radio = Double.parseDouble(valor1.getText());
                double area = Math.PI * Math.pow(radio, 2);
                double perimetro = 2 * Math.PI * radio;
                resultadoArea.setText(String.format("%.2f", area));
                resultadoPerimetro.setText(String.format("%.2f", perimetro));
            }
        });
        trianguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = Double.parseDouble(valor1.getText());
                double altura = Double.parseDouble(valor2.getText());
                double area = (base * altura) / 2;
                double perimetro = 3 * base;
                resultadoArea.setText(String.format("%.2f", area));
                resultadoPerimetro.setText(String.format("%.2f", perimetro));
            }
        });
    }
}
