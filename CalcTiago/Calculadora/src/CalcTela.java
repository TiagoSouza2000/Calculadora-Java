import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcTela extends JFrame {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSoma;
    private JButton btnSubtracao;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDivisao;
    private JButton btnPorcentagem;
    private JButton bntLimpar;
    private JButton btn0;
    private JButton btnVirgula;
    private JButton btnMultiplicacao;
    private JButton btnRaiz;
    private JButton btnResultado;
    private JTextField txtSaida;
    private JPanel calculadora;
    private Double valor1;
    private Double valor2;
    private String operador;

    public CalcTela() {
        iniciarComponentes();
        addListener();
    }

    private void iniciarComponentes() {
        JPanel CalcTela = new JPanel();
        setSize(500, 350);
        setContentPane(calculadora);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("calculadora");
        setVisible(true);
    }

    private void addListener() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "1");

            }

        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "2");

            }

        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "3");


            }

        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "4");

            }

        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "5");

            }

        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "6");

            }

        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "7");

            }

        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "8");

            }

        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "9");

            }

        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + "0");

            }

        });

        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText(txtSaida.getText() + ",");

            }

        });

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "+";
            }
        });
        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "-";
            }
        });

        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "/";
            }
        });

        btnMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "*";
            }
        });
        btnPorcentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtSaida.getText());
                txtSaida.setText("");
                operador = "%";
            }
        });
        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble((txtSaida.getText()));
                txtSaida.setText("");
                operador = "sqrt";
                double sqrt = Math.sqrt(valor1);
                txtSaida.setText(String.valueOf(sqrt));
            }
        });
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble((txtSaida.getText()));
                switch (operador) {
                    case "+":
                        txtSaida.setText(String.valueOf(valor1 + valor2));
                        break;
                    case "-":
                        txtSaida.setText(String.valueOf(valor1 - valor2));
                        break;
                    case "*":
                        txtSaida.setText(String.valueOf(valor1 * valor2));
                    case "/":
                        txtSaida.setText(String.valueOf(valor1 / valor2));
                        break;
                    case "√":
                        break;
                    case "%":
                        txtSaida.setText(String.valueOf(valor1 + (valor2 / 100)));
                                 }
                    }
                });
        bntLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSaida.setText("");
                operador = "";

            }

        });
        }
        public static void main (String[]args){
            CalcTela calcTela = new CalcTela();
        }

}