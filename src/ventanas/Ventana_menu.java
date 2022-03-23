package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import clases.clase_proceso;

public class Ventana_menu extends JFrame implements ActionListener {

    private JLabel lbl_tri, lbl_for, lbl_exp, lbl_int1, lbl_int2, lbl_int3, lbl_int4, lbl_int5, lbl_int6, lbl_int7, lbl_integrantes, lbl_sistemas, lbl_tec;
    private JTextField txt_a, txtb, txtc;
    private JComboBox cmbsigno1, cmbsigno2;
    private JLabel ax, x, lbligual;
    private JMenuBar bar1;
    private JMenu menu_opc;
    private JMenuItem item_cal;
    private JLabel lblvacio, lbl_teacher, lbl_materia;
    private JPanel panel_calcu, panel_prin, panel_datos, panel_nor, panel_sur;
    //Estas variables se van a la siguiente ventana
    public static String x1, x2, formula, op1, op2;
    public static int a, b, c;

    public Ventana_menu() {

        setTitle("Trinomio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        Container contenedor = getContentPane();
        bar1 = new JMenuBar();
        setJMenuBar(bar1);

        menu_opc = new JMenu("Opciones");
        bar1.add(menu_opc);

        item_cal = new JMenuItem("Calcular");
        item_cal.addActionListener(this);
        menu_opc.add(item_cal);

        panel_nor = new JPanel();
        panel_nor.setLayout(new GridLayout(1, 3));

        lblvacio = new JLabel();
        panel_nor.add(lblvacio);

        lbl_tec = new JLabel(image("/images/TESVB.png", 300, 130));
        panel_nor.add(lbl_tec);

        lbl_sistemas = new JLabel(image("/images/isc.png", 130, 130));
        panel_nor.add(lbl_sistemas);

        panel_nor.setBackground(new Color(0, 147, 96));
        contenedor.add(panel_nor, BorderLayout.NORTH);

        panel_prin = new JPanel();
        panel_prin.setLayout(null);
        panel_prin.setBackground(new Color(0, 147, 96));

        lbl_tri = new JLabel("Trinomios");
        lbl_tri.setBounds(180, 20, 200, 50);
        lbl_tri.setFont(new Font("Arial", 1, 25));
        lbl_tri.setForeground(new Color(255, 255, 255));
        panel_prin.add(lbl_tri);

        lbl_for = new JLabel(image("/images/formula.png", 250, 230));
        lbl_for.setBounds(130, 0, 250, 200);
        panel_prin.add(lbl_for);

        lbl_exp = new JLabel("Ingrese la expresión a calcular:");
        lbl_exp.setBounds(130, 130, 300, 40);
        lbl_exp.setFont(new Font("Arial", 2, 18));
        lbl_exp.setForeground(new Color(255, 255, 255));
        panel_prin.add(lbl_exp);

        txt_a = new JTextField();
        txt_a.setBounds(120, 190, 30, 30);
        txt_a.setBackground(new Color(3, 169, 111));
        txt_a.setFont(new Font("Arial", 1, 16));
        txt_a.setForeground(new Color(255, 255, 255));
        panel_prin.add(txt_a);

        ax = new JLabel("x²");
        ax.setBounds(150, 190, 30, 30);
        ax.setFont(new Font("Arial", 1, 16));
        ax.setForeground(new Color(255, 255, 255));
        panel_prin.add(ax);

        cmbsigno1 = new JComboBox();
        cmbsigno1.setBounds(170, 190, 50, 30);
        cmbsigno1.setBackground(new Color(3, 169, 111));
        cmbsigno1.setFont(new Font("Arial", 1, 16));
        cmbsigno1.setForeground(new Color(255, 255, 255));
        panel_prin.add(cmbsigno1);
        cmbsigno1.addItem("");
        cmbsigno1.addItem("+");
        cmbsigno1.addItem("-");

        txtb = new JTextField();
        txtb.setBounds(220, 190, 30, 30);
        txtb.setBackground(new Color(3, 169, 111));
        txtb.setFont(new Font("Arial", 1, 16));
        txtb.setForeground(new Color(255, 255, 255));
        panel_prin.add(txtb);

        x = new JLabel("x");
        x.setBounds(250, 190, 30, 30);
        x.setFont(new Font("Arial", 1, 16));
        x.setForeground(new Color(255, 255, 255));
        panel_prin.add(x);

        cmbsigno2 = new JComboBox();
        cmbsigno2.setBounds(260, 190, 50, 30);
        cmbsigno2.setBackground(new Color(3, 169, 111));
        cmbsigno2.setFont(new Font("Arial", 1, 16));
        cmbsigno2.setForeground(new Color(255, 255, 255));
        panel_prin.add(cmbsigno2);
        cmbsigno2.addItem("");
        cmbsigno2.addItem("+");
        cmbsigno2.addItem("-");

        txtc = new JTextField();
        txtc.setBounds(310, 190, 30, 30);
        txtc.setBackground(new Color(3, 169, 111));
        txtc.setFont(new Font("Arial", 1, 16));
        txtc.setForeground(new Color(255, 255, 255));
        panel_prin.add(txtc);

        lbligual = new JLabel("= 0");
        lbligual.setBounds(340, 190, 30, 30);
        lbligual.setFont(new Font("Arial", 1, 16));
        lbligual.setForeground(new Color(255, 255, 255));
        panel_prin.add(lbligual);

        contenedor.add(panel_prin, BorderLayout.CENTER);

        panel_datos = new JPanel();
        panel_datos.setLayout(new GridLayout(10, 1));
        panel_datos.setBackground(new Color(0, 147, 96));

        lbl_integrantes = new JLabel("           INTEGRANTES        ");
        lbl_integrantes.setBounds(10, 10, 150, 30);
        lbl_integrantes.setFont(new Font("Arial", 1, 14));
        lbl_integrantes.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_integrantes);

        lbl_int1 = new JLabel("BARCENAS GARCIA EFREN");
        lbl_int1.setBounds(10, 10, 150, 30);
        lbl_int1.setFont(new Font("Arial", 1, 12));
        lbl_int1.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int1);

        lbl_int2 = new JLabel("CEBALLOS ÁVILA EDGAR RAÚL");
        lbl_int2.setBounds(10, 50, 150, 30);
        lbl_int2.setFont(new Font("Arial", 1, 12));
        lbl_int2.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int2);

        lbl_int3 = new JLabel("GARDUÑO DE PAZ RODRIGO DARIO");
        lbl_int3.setBounds(10, 90, 150, 30);
        lbl_int3.setFont(new Font("Arial", 1, 12));
        lbl_int3.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int3);

        lbl_int4 = new JLabel("LÓPEZ ESPINOZA JULIO ALEJANDRO");
        lbl_int4.setBounds(10, 130, 150, 30);
        lbl_int4.setFont(new Font("Arial", 1, 12));
        lbl_int4.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int4);

        lbl_int5 = new JLabel("LOPEZ ESTRADA LLISEL");
        lbl_int5.setBounds(10, 170, 150, 30);
        lbl_int5.setFont(new Font("Arial", 1, 12));
        lbl_int5.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int5);

        lbl_int6 = new JLabel("MONTES DE OCA GUARNEROS RODRIGO");
        lbl_int6.setBounds(10, 210, 150, 30);
        lbl_int6.setFont(new Font("Arial", 1, 12));
        lbl_int6.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int6);
        contenedor.add(panel_datos, BorderLayout.EAST);

        lbl_int7 = new JLabel("RUIZ TORRES VÍCTOR ALFREDO");
        lbl_int7.setBounds(10, 10, 150, 30);
        lbl_int7.setFont(new Font("Arial", 1, 12));
        lbl_int7.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int7);

        panel_sur = new JPanel();
        panel_sur.setLayout(new GridLayout(2, 1));
        panel_sur.setBackground(new Color(0, 147, 96));

        lbl_teacher = new JLabel("Docente: M. en I.S.C Ámbar Gonźalez Guadarrama");
        lbl_teacher.setFont(new Font("Arial", 1, 18));
        lbl_teacher.setForeground(new Color(255, 255, 255));
        panel_sur.add(lbl_teacher);

        lbl_materia = new JLabel("Asignatura: Ecuaciones Diferenciales");
        lbl_materia.setFont(new Font("Arial", 1, 18));
        lbl_materia.setForeground(new Color(255, 255, 255));
        panel_sur.add(lbl_materia);
        contenedor.add(panel_sur, BorderLayout.SOUTH);

    }

    public Icon image(String url, int anch, int alt) {
        Icon image = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(anch, alt, java.awt.Image.SCALE_SMOOTH));
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clase_proceso valores = new clase_proceso();
        try {
            a = Integer.parseInt(txt_a.getText());
            b = Integer.parseInt(txtb.getText());
            c = Integer.parseInt(txtc.getText());

            if (e.getSource() == item_cal) {//aqui es donde se invocan los metodos
                if (txt_a.equals("") || txtb.equals("") || txtc.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar un la expresion");
                } else {
                    //Exactamente aqui
                    op1 = cmbsigno1.getSelectedItem().toString();
                    op2 = cmbsigno2.getSelectedItem().toString();

                    if (a == 1) {
                        if (b > 0 && c > 0) {
                            formula = "x² " + op1 + " " + b + "x " + op2 + " " + c + " = 0";
                        } else if (b < 0 && c < 0) {
                            formula = "x² " + " " + b + "x " + " " + c + " = 0";
                        } else if (b < 0 && c > 0) {
                            formula = "x² " + " " + b + "x " + op2 + " " + c + " = 0";
                        } else if (b > 0 && c < 0) {
                            formula = "x² " + op1 + " " + b + "x " + " " + c + " = 0";
                        }
                    } else if (a != 1) {
                        if (b > 0 && c > 0) {
                            formula = a + "x² " + op1 + " " + b + "x " + op2 + " " + c + " = 0";
                        } else if (b < 0 && c < 0) {
                            formula = a + "x² " + " " + b + "x " + " " + c + " = 0";
                        } else if (b < 0 && c > 0) {
                            formula = a + "x² " + " " + b + "x " + op2 + " " + c + " = 0";
                        } else if (b > 0 && c < 0) {
                            formula = a + "x² " + op1 + " " + b + "x " + " " + c + " = 0";
                        }
                    }
                    x1 = valores.x1(a, b, c);
                    x2 = valores.x2(a, b, c);

                    txt_a.setText("");
                    txtb.setText("");
                    txtc.setText("");
                    cmbsigno1.setSelectedIndex(0);
                    cmbsigno2.setSelectedIndex(0);

                    Ventana_Proceso ven = new Ventana_Proceso();
                    ven.setBounds(0, 0, 600, 450);
                    ven.setVisible(true);
                    ven.setResizable(false);
                    ven.setLocationRelativeTo(null);
                    this.setVisible(false);

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debes ingresar datos numericos");
        }

    }

    public static void main(String[] args) {
        Ventana_menu menu = new Ventana_menu();
        menu.setBounds(0, 0, 1000, 600);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
