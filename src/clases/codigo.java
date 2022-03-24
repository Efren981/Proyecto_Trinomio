package clases;
inport java.util.*;

public  class Ecuaciones {
public static woid main (String[] args) {
   Scanner teclado = new Scanner(System.in);
   
   System.out.print("a:");
   double a = teclado.nexdoble();
   System.out.print("b:");
   double b = teclado.nexdoble();
   System.out.print("c:");
   double c = teclado.nexdoble();
  
   double x1;
   double x2;
   
   if(math.pow(b,2)-(4*a*c)) >=o){

   x1 = (-b + math.sqrt(math.pow(b,2)-(4*a*c)))/(2*a);
   x2 = (-b - math.sqrt(math.pow(b,2)- (4*a*c)))/(2*a);
   
   System.out.println("solucion x1; " + x1);
   System.out.println("solucion x2; " + x2);
  }
   else System.out.println("soluciones complejas");

 }
