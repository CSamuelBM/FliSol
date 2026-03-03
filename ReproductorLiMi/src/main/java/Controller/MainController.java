package Controller;

import Model.AccionesM;
import View.CambioEsenaV;
import View.PlantillasV;

public class MainController {

    public MainController(AccionesM accionesM, CambioEsenaV cambioEsenaV, PlantillasV plantillasV){
        CambioEsenaC cambioEsenaC = new CambioEsenaC(accionesM, cambioEsenaV, plantillasV);
    }

}
