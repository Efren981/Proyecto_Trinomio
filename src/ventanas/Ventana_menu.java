package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana_menu extends JFrame  implements ActionListener{
    private JLabel lbl_tri,lbl_for,lbl_exp,lbl_int1,lbl_int2,lbl_int3,lbl_int4,lbl_int5,lbl_int6,lbl_int7,lbl_integrantes,lbl_sistemas,lbl_tec;
    private JTextField txt_exp;
    public static String formula;
    private JMenuBar bar1;
    private JMenu menu_opc;
    private JMenuItem item_cal;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14;
    private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lblvacio,lbl_teacher,lbl_materia;
    private JPanel panel_calcu,panel_prin,panel_datos,panel_nor,panel_sur;
    public Ventana_menu(){
        
        setTitle("Trinomio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(176,224,27));
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        
        Container contenedor=getContentPane();
        bar1=new JMenuBar();
        setJMenuBar(bar1);
        
        
        menu_opc=new JMenu("Opciones");
        bar1.add(menu_opc);
        
        item_cal=new JMenuItem("Calcular");
        item_cal.addActionListener(this);
        menu_opc.add(item_cal);
        
        panel_nor=new JPanel();
        panel_nor.setLayout(new GridLayout(1,3));
        
        lblvacio=new JLabel();
        panel_nor.add(lblvacio);
       
        lbl_tec=new JLabel(image("/images/TESVB.png",300,130));
        panel_nor.add(lbl_tec);
        
        lbl_sistemas=new JLabel(image("/images/isc.png",130,130));
        panel_nor.add(lbl_sistemas);
        
        panel_nor.setBackground(new Color(176,224,27));
        contenedor.add(panel_nor,BorderLayout.NORTH);
        
        
        panel_calcu=new JPanel();
        panel_calcu.setLayout(new GridLayout(6,4));
        panel_calcu.setBackground(new Color(176,224,27));
        
        lbl1=new JLabel();
        panel_calcu.add(lbl1);
        
        lbl2=new JLabel();
        panel_calcu.add(lbl2);
        
        lbl3=new JLabel();
        panel_calcu.add(lbl3);
        
        lbl4=new JLabel();
        panel_calcu.add(lbl4);
        
        bt1=new JButton("1");
        panel_calcu.add(bt1);
        
        bt2=new JButton("2");
        panel_calcu.add(bt2);
        
        bt3=new JButton("3");
        panel_calcu.add(bt3);
        
        bt4=new JButton("+");
        panel_calcu.add(bt4);
        
        bt5=new JButton("4");
        panel_calcu.add(bt5);
        
        bt6=new JButton("5");
        panel_calcu.add(bt6);
        
        bt7=new JButton("6");
        panel_calcu.add(bt7);
        
        bt8=new JButton("-");
        panel_calcu.add(bt8);
        
        bt9=new JButton("7");
        panel_calcu.add(bt9);
        
        bt10=new JButton("8");
        panel_calcu.add(bt10);
        
        bt11=new JButton("9");
        panel_calcu.add(bt11);
        
        bt12=new JButton("*");
        panel_calcu.add(bt12);
        
        lbl5=new JLabel();
        panel_calcu.add(lbl5);
        
        bt13=new JButton("0");
        panel_calcu.add(bt13);
        
        lbl6=new JLabel();
        panel_calcu.add(lbl6);
        
        bt14=new JButton();
        bt14.setIcon(image("/images/xcua.png",30,30));
        panel_calcu.add(bt14);
        
        lbl7=new JLabel();
        panel_calcu.add(lbl7);
        
        lbl8=new JLabel();
        panel_calcu.add(lbl8);
        
        lbl9=new JLabel();
        panel_calcu.add(lbl9);
        
        lbl10=new JLabel();
        panel_calcu.add(lbl10);
        
        contenedor.add(panel_calcu,BorderLayout.WEST);
        
        panel_prin=new JPanel();
        panel_prin.setLayout(null);
        panel_prin.setBackground(new Color(176,224,27));
        
        lbl_tri=new JLabel("Trinomios");
        lbl_tri.setBounds(180, 20, 200, 50);
        lbl_tri.setFont( new Font("Arial",1,25));
        lbl_tri.setForeground(new Color(84, 187, 0));
        panel_prin.add(lbl_tri);
        
        lbl_for=new JLabel(image("/images/formula.png",250,230));
        lbl_for.setBounds(130, 0, 250, 200);
        panel_prin.add(lbl_for);
        
        lbl_exp=new JLabel("Ingrese la expresion a calcular:");
        lbl_exp.setBounds(130, 130, 300, 40);
        lbl_exp.setFont(new Font("Arial",2,18));
        lbl_exp.setForeground(new Color(84, 187, 0));
        panel_prin.add(lbl_exp);
        
        txt_exp=new JTextField();
        txt_exp.setBounds(165, 190, 200, 30);
        txt_exp.setBackground(new Color(141, 232, 0));
        txt_exp.setFont(new Font("Arial",0,16));
        txt_exp.setForeground(new Color(255,255,255));
        panel_prin.add(txt_exp);
        
        contenedor.add(panel_prin,BorderLayout.CENTER);
        
        panel_datos=new JPanel();
        panel_datos.setLayout(new GridLayout(10,1));
        panel_datos.setBackground(new Color(176,224,27));
        
        lbl_integrantes=new JLabel("           INTEGRANTES        ");
        lbl_integrantes.setBounds(10, 10, 150, 30);
        lbl_integrantes.setFont( new Font("Arial",1,14));
        lbl_integrantes.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_integrantes);
        
        lbl_int1=new JLabel("BARCENAS GARCIA EFREN");
        lbl_int1.setBounds(10, 10, 150, 30);
        lbl_int1.setFont( new Font("Arial",1,12));
        lbl_int1.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int1);
        
        lbl_int2=new JLabel("CEBALLOS ÁVILA EDGAR RAÚL");
        lbl_int2.setBounds(10, 50, 150, 30);
        lbl_int2.setFont( new Font("Arial",1,12));
        lbl_int2.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int2);
        
        lbl_int3=new JLabel("GARDUÑO DE PAZ RODRIGO DARIO");
        lbl_int3.setBounds(10, 90, 150, 30);
        lbl_int3.setFont( new Font("Arial",1,12));
        lbl_int3.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int3);
        
        lbl_int4=new JLabel("LÓPEZ ESPINOZA JULIO ALEJANDRO");
        lbl_int4.setBounds(10, 130, 150, 30);
        lbl_int4.setFont( new Font("Arial",1,12));
        lbl_int4.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int4);
        
        lbl_int5=new JLabel("LOPEZ ESTRADA LLISEL");
        lbl_int5.setBounds(10, 170, 150, 30);
        lbl_int5.setFont( new Font("Arial",1,12));
        lbl_int5.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int5);
        
        lbl_int6=new JLabel("MONTES DE OCA GUARNEROS RODRIGO");
        lbl_int6.setBounds(10, 210, 150, 30);
        lbl_int6.setFont( new Font("Arial",1,12));
        lbl_int6.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int6);
        contenedor.add(panel_datos,BorderLayout.EAST);
        
        lbl_int7=new JLabel("RUIZ TORRES VÍCTOR ALFREDO");
        lbl_int7.setBounds(10, 10, 150, 30);
        lbl_int7.setFont( new Font("Arial",1,12));
        lbl_int7.setForeground(new Color(255, 255, 255));
        panel_datos.add(lbl_int7);
        
        panel_sur=new JPanel();
        panel_sur.setLayout(new GridLayout(2,1));
        panel_sur.setBackground(new Color(176,224,27));
        
        lbl_teacher=new JLabel("Docente: M. en I.S.C Ámbar Gonźalez Guadarrama");
        lbl_teacher.setFont( new Font("Arial",1,20));
        lbl_teacher.setForeground(new Color(84, 187, 0));
        panel_sur.add(lbl_teacher);
        
        lbl_materia=new JLabel("Asignatura: Ecuaciones Diferenciales");
        lbl_materia.setFont( new Font("Arial",1,20));
        lbl_materia.setForeground(new Color(84, 187, 0));
        panel_sur.add(lbl_materia);
        contenedor.add(panel_sur,BorderLayout.SOUTH);
        
    }
    
    public Icon image(String url,int anch,int alt){
        Icon image = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance
        (anch, alt,java.awt.Image.SCALE_SMOOTH));
        return image;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==item_cal){
            formula=txt_exp.getText().trim();
            if(formula.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Debes de ingresar un la expresion");
            }
            else{
                Ventana_Proceso ven=new Ventana_Proceso();
                ven.setBounds(0, 0, 500, 450);
                ven.setVisible(true);
                ven.setResizable(false);
                ven.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    public static void main(String[] args) {
        Ventana_menu menu =new Ventana_menu();
        menu.setBounds(0,0,1000,600);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
