package View;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import static javax.swing.ScrollPaneConstants.*;

public class CancionesV extends JPanel {

    private final Font FONT = new Font("Arial", Font.ITALIC, 14);

    private JButton btCancion;
    private JPanel pnContenido;
    private JScrollPane scrollPane;

    private String nombreCancion = "¡Corre!";
    private int numeroCanciones = 30;

    public CancionesV(){
        setLayout(new BorderLayout());
        pnContenido = new JPanel(new GridLayout(0, 1, 10, 10));
        pnContenido.setBackground(new Color(209, 209, 209));

        ponerCancion();
        scroll();
    }

    private void scroll(){
        scrollPane = new JScrollPane(pnContenido);
        scrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.EAST);
    }

    private void ponerCancion(){
        for(int i= 0; i< numeroCanciones; i++)
            cancion();
    }

    private void cancion() {
        btCancion = new JButton(nombreCancion);
        btCancion.setFont(FONT);
        btCancion.setBackground(new Color(138, 138, 138));
        btCancion.setForeground(Color.WHITE);
        btCancion.setPreferredSize(new Dimension(250, 40));
        btCancion.setAlignmentY(BOTTOM_ALIGNMENT);

        URL url = getClass().getResource("/iconoCancion.png");
        ImageIcon icono = new ImageIcon(url);
        Image img = icono.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        btCancion.setIcon(icon);

        pnContenido.add(btCancion);
    }

    public void ponerNombreCancion(String nombreCancion){
        this.nombreCancion = nombreCancion;
    }

    public void ponerNumeroCanciones(int numeroCanciones){
        this.numeroCanciones = numeroCanciones;
    }

}
