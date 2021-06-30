import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        String nombre,apellido, hobbie, editorCodigoPreferido,sistemaOperativo;
        int edad;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese su Nombre: ");
        nombre = myScanner.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido = myScanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(myScanner.nextLine());
        System.out.println("Cual es su hobbie? ");
        hobbie = myScanner.nextLine();
        System.out.println("Que editor de Texto usa? ");
        editorCodigoPreferido = myScanner.nextLine();
        System.out.println("Que Sistema Operativo usa? ");
        sistemaOperativo = myScanner.nextLine();

        System.out.println("Datos: \nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nIDE Favorito: "+editorCodigoPreferido+"\nSistema Operativo: "+sistemaOperativo);


    }
}
