package javau2actpracoblig;
import javax.swing.JOptionPane;
public class JavaU2ActPracOblig {
    public static void main(String[] args) {
        // Crear un programa en java en el cual 
        // se pida al usuario ingresar su nombre, apellido, 
        // edad, hobbie, editor de código preferido, 
        // sistema operativo que utiliza, 
        // luego deberá mostrarse por consola los datos ingresados.
        System.out.println("\tBienvenido al sistema\n");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad (años): ", "0"));
        String hobbie = JOptionPane.showInputDialog("Ingrese su hobbie: ");
        String editorFavorito = JOptionPane.showInputDialog("Ingrese su editor de codigo favorito: ");
        String sistemaOperativo = JOptionPane.showInputDialog("Ingrese su sistema operativo usado: ");
        
        System.out.println("Los datos ingresados son:\n");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad+" años");
        System.out.println("Hobbie: "+hobbie);
        System.out.println("Editor favorito: "+editorFavorito);
        System.out.println("Sistema Operativo: "+sistemaOperativo);
    }
}
