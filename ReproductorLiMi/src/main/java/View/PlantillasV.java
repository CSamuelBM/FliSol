package View;

import javax.swing.JPanel;
import java.awt.*;

public class PlantillasV extends JPanel {

    private CardLayout card;

    public PlantillasV() {
        card = new CardLayout();
        setBackground(new Color(209, 209, 209));
        setLayout(card);
    }

    public void conexion(String id){ card.show(this, id); }

}
