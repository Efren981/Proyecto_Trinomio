package clases;

import javax.swing.JOptionPane;

public class clase_proceso {
    
    public String x1(int a,int b,int c){
        String retorno="";
        double det=Math.pow(b, 2) - (4*a*c);
        if(det>0){
            double x1;
            x1=(((b*(-1))+Math.sqrt(det))/(2*a));
            retorno =""+x1;
        }
        else{
            JOptionPane.showMessageDialog(null, "Elige otros datos");
        }
        return retorno;
    }

    public String x2(int a,int b,int c){
        String retorno1="";
        double det=Math.pow(b, 2) - (4*a*c);
        if(det>0){
            double x2;
            x2=(((b*(-1))-Math.sqrt(det))/(2*a));
            retorno1=""+x2;
        }
        else{
            JOptionPane.showMessageDialog(null, "Elige otros datos");
        }
        return retorno1;
    }
    public static void main(String[] args) {
        
        //numeros de prueba 1 6 8
        clase_proceso clase=new clase_proceso();
        System.out.println("x1: "+ clase.x1(2, -2, -3));
        System.out.println("x2: "+ clase.x2(2, -2, -3));;
    }
}
