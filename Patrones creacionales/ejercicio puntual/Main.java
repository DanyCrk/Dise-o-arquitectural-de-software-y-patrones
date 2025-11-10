// Main program
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AutoSearchUI frame = new AutoSearchUI();
                ButtonHandler handler = new ButtonHandler(frame);
                frame.setVisible(true);
            }
        });
    }
}