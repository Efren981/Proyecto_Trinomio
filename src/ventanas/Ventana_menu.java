package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana_menu extends JFrame  {
    private JLabel lbl_tri,lbl_for,lbl_exp;
    private JTextField txt_exp;
    public static String formula;
    private JMenuBar bar1;
    private JMenu menu_opc;
    private JMenuItem item_cal,item_nuevo;
    private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14;
    private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10;
    private JPanel panel_calcu;
    public Ventana_menu(){
        
        setTitle("Trinomio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(176,224,27));
        
        Container contenedor=getContentPane();
        bar1=new JMenuBar();
        setJMenuBar(bar1);
        contenedor.add(bar1,BorderLayout.NORTH);
        
        menu_opc=new JMenu("Opciones");
        bar1.add(menu_opc);
        
        item_cal=new JMenuItem("Calcular");
        menu_opc.add(item_cal);
        
        item_nuevo=new JMenuItem("Nuevo");
        menu_opc.add(item_nuevo);
        
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
        
        bt14=new JButton("x*2");
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
      
    }
    
    public Icon image(String url,int anch,int alt){
        Icon image = new ImageIcon(new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance
        (anch, alt,java.awt.Image.SCALE_SMOOTH));
        return image;
    }
    
    //@Override
    /*public void actionPerformed(ActionEvent e){
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
    }*/
    public static void main(String[] args) {
        Ventana_menu menu =new Ventana_menu();
        menu.setBounds(0,0,600,350);
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }
}
