package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana_menu extends JFrame implements ActionListener {
    private JLabel lbl_tri,lbl_for,lbl_exp;
    private JTextField txt_exp;
    private JButton bt_calcular;
    public static String formula;
    public Ventana_menu(){
        setLayout(null);
        setTitle("Trinomio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(176,224,27));
        
        lbl_tri=new JLabel("Trinomios");
        lbl_tri.setBounds(210, 20, 280, 50);
        lbl_tri.setFont( new Font("Arial",1,35));
        lbl_tri.setForeground(new Color(84, 187, 0));
        add(lbl_tri);
        
        lbl_for=new JLabel(image("/images/formula.png",204,53));
        lbl_for.setBounds(210, 70, 205, 55);
        add(lbl_for);
        
        lbl_exp=new JLabel("Ingrese la expresion a calcular:");
        lbl_exp.setBounds(170, 130, 300, 40);
        lbl_exp.setFont(new Font("Arial",2,18));
        lbl_exp.setForeground(new Color(84, 187, 0));
        add(lbl_exp);
        
        txt_exp=new JTextField();
        txt_exp.setBounds(200, 190, 200, 30);
        txt_exp.setBackground(new Color(141, 232, 0));
        txt_exp.setFont(new Font("Arial",0,16));
        txt_exp.setForeground(new Color(255,255,255));
        add(txt_exp);
        
        bt_calcular=new JButton("Calcular");
        bt_calcular.setBounds(250, 240, 100, 30);
        bt_calcular.setBackground(new Color(141,232,0));
        bt_calcular.setFont(new Font("Arial",3,14));
        bt_calcular.setForeground(new Color(255,255,255));
        bt_calcular.addActionListener(this);
        add(bt_calcular);
    }
    
    public Icon image(String url,int anch,int alt){
        Icon image = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance
        (anch, alt,java.awt.Image.SCALE_SMOOTH));
        return image;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt_calcular){
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
        menu.setBounds(0,0,600,350);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
