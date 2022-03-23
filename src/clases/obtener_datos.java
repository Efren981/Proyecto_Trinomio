/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Julio Alejandro
 */
public class obtener_datos 
{
    public void TCP(int a, int b, int c){
            //Calcular la raiz del primer y ultimo termino
            double raizA = Math.sqrt(a);
            double raizC = Math.sqrt(c);
            double resultado = 2*raizA*raizC;
                if(resultado==b){
                    //Aqui se puede agregar el metodo que de respuesta a la ecuacion
                    //de momento solo pondre mensajes
                    System.out.println("La expresion es un TCP");
                }
                else{
                    System.out.println("Este no es un TCP por lo cual no se puede factorizar");
                }
    } 
    
}
