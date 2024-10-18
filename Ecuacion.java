
import javax.swing.JOptionPane;



public class Ecuacion {

    public static void main(String[] args) {
        boolean si=true;
      
        do {
            int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de A"));
            int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de B"));
            int x=a+(b*2+a); 

            System.out.println("El valor de x es: "+x);

            String pregunta=JOptionPane.showInputDialog("Desea volver a hacer el proceso?");
            if(pregunta.equalsIgnoreCase("si")){
                si=true;
            }else{  
                si=false;
                System.out.println("Gracias por usar el sistema");
            }
        } while (si==true);
    }
}