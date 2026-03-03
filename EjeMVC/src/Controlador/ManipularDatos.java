package Controlador;

import Modelo.Libro;
import Vista.MostrarDatos;

public class ManipularDatos {

    private Libro libro;
    private MostrarDatos datosIngresados;

     public ManipularDatos(Libro libro, MostrarDatos datosIngresados){
         this.libro = libro;
         this.datosIngresados = datosIngresados;
     }

     public void instruccionNombre(){
         datosIngresados.letreroNombre();
     }
     public void ingresarNombre(String nombre){
          libro.setNombre(nombre);
     }
     public void mostrarNombre(){
        datosIngresados.mostrarNombre(libro.getNombre());
     }

     public void instruccionAutor(){
         datosIngresados.letreroAutor();
     }
     public void ingresarAutor(String autor) {
         libro.setAutor(autor);
     }
     public void mostrarAutor(){
         datosIngresados.mostrarAutor(libro.getAutor());
     }

}
