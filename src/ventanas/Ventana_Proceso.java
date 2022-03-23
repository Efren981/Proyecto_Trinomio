package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana_Proceso extends JFrame implements ActionListener{
    
    private JLabel lbl_formul,lbl_res;
    private JScrollPane scroll;
    private JTextArea ar_res;
    private JButton bt_regresar,bt_salir;
    String expresion,x1,x2;
    
    public Ventana_Proceso() {
        setLayout(null);
        setTitle("Calculo de Trinomio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color( 0, 147, 96 ));
        //Objeto de la primer clase
        Ventana_menu menu=new Ventana_menu();
        expresion=menu.formula;
        x1=menu.x1;
        x2=menu.x2;
        //aqui importamos todas las variables
        
        //agregando componentes
        lbl_formul=new JLabel("Expresión: "+expresion);
        lbl_formul.setBounds(30, 30, 300, 30);
        lbl_formul.setFont(new Font("Arial",1,18));
        lbl_formul.setForeground(new Color(255, 255, 255));
        add(lbl_formul);
        
        lbl_res=new JLabel("Resultado");
        lbl_res.setBounds(190, 95, 200, 30);
        lbl_res.setFont(new Font("Arial",1,18));
        lbl_res.setForeground(new Color(255, 255, 255));
        add(lbl_res);
        
        //elegi un text area para plasmar el resultado pero si consideran necesario se cambia por otra cosa solo se borra este bloque
        ar_res=new JTextArea();
        ar_res.setEditable(false);
        ar_res.setBackground(new Color(0, 186, 121));
        ar_res.setFont(new Font("Arial",0,16));
        ar_res.setForeground(new Color(255,255,255));
        ar_res.setText("( x + "+x1+")  (x + "+x2+")");
        scroll=new JScrollPane(ar_res);
        scroll.setBounds(30, 125, 440, 200);
        add(scroll);
        
        //Estos son los botones, no borrar
        
        bt_regresar=new JButton("Regresar");
        bt_regresar.setBounds(80, 350, 120, 30);
        bt_regresar.setBackground(new Color(0, 186, 121));
        bt_regresar.setFont(new Font("Arial",3,14));
        bt_regresar.setForeground(new Color(255,255,255));
        bt_regresar.addActionListener(this);
        add(bt_regresar);
        
        bt_salir=new JButton("Salir");
        bt_salir.setBounds(300, 350, 120, 30);
        bt_salir.setBackground(new Color(0, 186, 121));
        bt_salir.setFont(new Font("Arial",3,14));
        bt_salir.setForeground(new Color(255,255,255));
        bt_salir.addActionListener(this);
        add(bt_salir);
    }
    
    //Accion del boton
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt_regresar){
            Ventana_menu menu =new Ventana_menu();
            menu.setBounds(0,0,1000,600);
            menu.setVisible(true);
            menu.setResizable(false);
            menu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource()==bt_salir){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Ventana_Proceso ven=new Ventana_Proceso();
        ven.setBounds(0, 0, 500, 450);
        ven.setVisible(true);
        ven.setResizable(false);
        ven.setLocationRelativeTo(null);
    }
    
}
