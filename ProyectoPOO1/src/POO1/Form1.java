package POO1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Form1 extends JFrame {

        private JTextField textField1;
        private JPanel panel1;
        private JTextField textField2;
        private JTextField textField3;
        private JTextField textField4;
        private JTextField textField5;
        private JTextField textField6;
        private JButton button1;
        private JLabel lbl1;
        private JLabel lbl2;
        private JLabel lbl3;
        private JLabel lbl4;
        private JLabel lbl5;
        private JLabel lbl6;

        public Form1()  {

                //Config Form1
                JFrame frame=new JFrame("Lab1");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setContentPane(panel1);
                this.setVisible(true);
                this.setSize(500,500);
                this.setLocationRelativeTo(null);

                //Nombres Labels
                lbl1.setText("ID Persona");
                lbl2.setText("Nombre");
                lbl3.setText("Apellido");
                lbl4.setText("Departamento de Residencia");
                lbl5.setText("Cantidad Hijos");
                lbl6.setText("Fecha de Nacimiento");
                button1.setText("Crear Personas");


                //Funcion btn1
                button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                int idPersona = Integer.parseInt(textField1.getText());
                                byte qHijo = Byte.parseByte(textField5.getText());;
                                String nombre = textField2.getText();
                                String apellido = textField3.getText();
                                String dptoResidencia = textField4.getText();
                                LocalDate bornDate = LocalDate.of(2023, 12, 21);
                                Personas[] persona = new Personas[6];
                                persona[1]=new Personas(idPersona,nombre,apellido,dptoResidencia,qHijo,bornDate);

                        }
                });
        }

        public static void main(String[]args){
                Form1 Form1=new Form1();
        }
}

