import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MiApp {
    private JPanel Contenedor;
    private JButton resgistrarButton;
    private JButton editarButton;
    private JTextArea textArea1;

    public MiApp() {
        Contenedor.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }
}
