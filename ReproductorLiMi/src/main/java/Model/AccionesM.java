package Model;

import java.util.ArrayList;
import java.util.List;

public class AccionesM {

    private ArrayList<String> listNombres;
    private int numeroAccion;

    public AccionesM(){
        listNombres = new ArrayList<>();
        nombres();
        numeroAccion = 3;
    }

    private void nombres(){
        listNombres.add("INICIO");
        listNombres.add("FAVORITOS");
        listNombres.add("BUSCAR");
    }

    public ArrayList getListNombres(){
        return listNombres;
    }

    public String getNombres(int i){
        return listNombres.get(i);
    }

    public int getNumeroAccion(){
        return numeroAccion;
    }

}
