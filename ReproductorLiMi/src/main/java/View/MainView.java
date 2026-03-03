package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    public MainView(){
        setMinimumSize(new Dimension(1000,600));
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("~LiMi~");
        setLayout(new BorderLayout());

        plantillas();
        canciones();
        esenas();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void plantillas(){
        PlantillasV plantillasV = new PlantillasV();

        add(plantillasV, BorderLayout.CENTER);
    }

    private void canciones(){
        CancionesV cancionesV = new CancionesV();

        add(cancionesV, BorderLayout.EAST);
    }

    private void esenas(){
        CambioEsenaV cambioEsenaV = new CambioEsenaV();

        add(cambioEsenaV, BorderLayout.WEST);
    }

}
