import Controlador.ManipularDatos;
import Modelo.Libro;
import Vista.MostrarDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Libro libro = new Libro();
        MostrarDatos mostrarDatos = new MostrarDatos();
        ManipularDatos manipularDatos = new ManipularDatos(libro, mostrarDatos);

        manipularDatos.instruccionNombre();
        manipularDatos.ingresarNombre(cs.next());

        manipularDatos.instruccionAutor();
        manipularDatos.ingresarAutor(cs.next());

        manipularDatos.mostrarNombre();
        manipularDatos.mostrarAutor();

    }
}