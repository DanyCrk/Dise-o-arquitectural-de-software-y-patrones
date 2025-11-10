// ButtonHandler - Event Handler

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler {
    private AutoSearchUI frame;
    
    public ButtonHandler(AutoSearchUI frame) {
        this.frame = frame;
        
        // Add action listeners
        frame.getExitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventExitButton();
            }
        });
        
        frame.getOpenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventOpenButton();
            }
        });
    }
    
    private void eventExitButton() {
        frame.dispose();
        System.exit(0);
    }
    
    private void eventOpenButton() {
        String vhCategory = (String) frame.getCmbVehicleCategory().getSelectedItem();
        String vhType = (String) frame.getCmbVehicleType().getSelectedItem();
        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);
        String searchResult = "";
        
        if (vhType.equals(AutoSearchUI.CAR)) {
            Car c = vf.getCar();
            searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
        }
        if (vhType.equals(AutoSearchUI.SUV)) {
            SUV s = vf.getSUV();
            searchResult = "Name: " + s.getSUVName() + " Features: " + s.getSUVFeatures();
        }
        if (vhType.equals(AutoSearchUI.MINIVAN)) {
            Minivan m = vf.getMiniVan();
            searchResult = "Name: " + m.getMinivanName() + " Features: " + m.getMinivanFeatures();
        }
        
        frame.setText(searchResult);
    }
}