package clases;
public class clase_proceso {
    
    public String x1(int a,int b,int c){
        String retorno="";
        double det=Math.pow(b, 2) - (4*a*c);
        if(det>0){
            double x1,x2;
            x1=(((b*(-1))+Math.sqrt(det))/(2*a));
            retorno =""+x1;
        }
        else{
            System.out.println("No se puede realizar operacion");
        }
        return retorno;
    }

    public String x2(int a,int b,int c){
        String retorno1="";
        double det=Math.pow(b, 2) - (4*a*c);
        if(det>0){
            double x1,x2;
            x2=(((b*(-1))-Math.sqrt(det))/(2*a));
            retorno1=""+x2;
        }
        else{
            System.out.println("No se puede realizar operacion");
        }
        return retorno1;
    }

}
