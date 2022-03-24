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
import java.util.*;
public class Cuadrado
{

    public static void main (String[]args)
{
    int a = 0,b = 0,q,w,e,t;
    Scanner dato=new Scanner (System.in);
    
System.out.println("(a+b)^2 = a^2 + 2ab + b^2");

System.out.print("Escribe a: ");

a = dato.nextInt();

System.out.print("Escribe b: ");

b = dato.nextInt();

q=a*a;
w=2*a*b;
e=b*b;
t=q+w+e;
System.out.print("(");
System.out.print(q +"^2");
System.out.print(" + ");
System.out.print(w+"x");
System.out.print(" + ");
System.out.print(e);
System.out.print(") = ");
System.out.print(t);
}
}