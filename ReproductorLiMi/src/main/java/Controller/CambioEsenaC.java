package Controller;

import Model.AccionesM;
import View.CambioEsenaV;
import View.PlantillasV;

public class CambioEsenaC {

    private AccionesM accionesM;

    private CambioEsenaV cambioEsenaV;
    private PlantillasV plantillasV;

    public CambioEsenaC(AccionesM accionesM, CambioEsenaV cambioEsenaV, PlantillasV plantillasV){
        this.accionesM = accionesM;
        this.cambioEsenaV = cambioEsenaV;
        this.plantillasV = plantillasV;

        nombreAccion();
        numeroAcciones();
        accion1();
        accion2();
        accion3();
    }

    private void nombreAccion(){
        cambioEsenaV.ponerNombreAccion(accionesM.getListNombres());
    }
    private void numeroAcciones(){
        cambioEsenaV.ponerNumeroAcciones(accionesM.getNumeroAccion());
    }

    private void accion1(){
        cambioEsenaV.accion(e -> {
            plantillasV.conexion(accionesM.getNombres(0));
        }, 0);
    }

    private void accion2(){
        cambioEsenaV.accion(e -> {
            plantillasV.conexion(accionesM.getNombres(1));
        }, 1);
    }

    private void accion3(){
        cambioEsenaV.accion(e -> {
            plantillasV.conexion(accionesM.getNombres(2));
        }, 2);
    }

}
