package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CambioEsenaV extends JPanel{

    private final Font FONT = new Font("Arial", Font.ITALIC, 14);

    private JPanel pnContenido;
    private JButton btAccion;

    private ArrayList<JButton> listBoton;
    private ArrayList<String> listNombreAccion;

    private int numeroAcciones;

    public CambioEsenaV(){
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        pnContenido = new JPanel();
        pnContenido.setLayout(new GridLayout(0, 1, 20, 20));

        listBoton = new ArrayList<>();
        listNombreAccion = new ArrayList<>();

        for(int i= 0; i< numeroAcciones; i++)
            listBoton.add(canciones(i));

        add(pnContenido, BorderLayout.NORTH);
    }

    private JButton canciones(int i){
        btAccion = new JButton(listNombreAccion.get(i));
        btAccion.setFont(FONT);
        btAccion.setForeground(new Color(20, 2, 2));
        btAccion.setBackground(new Color(209, 209, 209));
        btAccion.setPreferredSize(new Dimension(180, 40));
        pnContenido.add(btAccion);
        return btAccion;
    }

    public void accion(ActionListener e, int i){
        listBoton.get(i).addActionListener(e);
    }

    public void ponerNombreAccion(ArrayList<String> nombreAccion){
        listNombreAccion.addAll(nombreAccion);
    }
    public void ponerNumeroAcciones(int n){
        numeroAcciones = n;
    }

}

