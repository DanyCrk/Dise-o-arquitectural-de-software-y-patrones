// AutoSearchUI - GUI Interface

import javax.swing.*;
import java.awt.*;

public class AutoSearchUI extends JFrame {
    public static final String SEARCH = "Show";
    public static final String EXIT = "Exit";
    public static final String CAR = "Car";
    public static final String SUV = "SUV";
    public static final String MINIVAN = "Mini-Van";
    
    private JComboBox<String> cmbVehicleCategory;
    private JComboBox<String> cmbVehicleType;
    private JLabel lblVehicleCategory;
    private JLabel lblVehicleType;
    private JLabel lblCarName;
    private JLabel lblCarNameValue;
    private JButton openButton;
    private JButton exitButton;
    
    public AutoSearchUI() {
        setTitle("Abstract Factory Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Initialize components
        cmbVehicleCategory = new JComboBox<>(new String[]{
            VehicleFactory.LUXURY_VEHICLE,
            VehicleFactory.NON_LUXURY_VEHICLE
        });
        
        cmbVehicleType = new JComboBox<>(new String[]{CAR, SUV, MINIVAN});
        
        lblVehicleCategory = new JLabel("Vehicle Category:");
        lblVehicleType = new JLabel("Vehicle Type:");
        lblCarName = new JLabel("Search Result:");
        lblCarNameValue = new JLabel(" Please click on Show button");
        
        openButton = new JButton(SEARCH);
        exitButton = new JButton(EXIT);
        
        // Add components to grid
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblVehicleCategory, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(cmbVehicleCategory, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblVehicleType, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(cmbVehicleType, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblCarName, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(lblCarNameValue, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(openButton, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(exitButton, gbc);
        
        pack();
        setLocationRelativeTo(null);
    }
    
    public JButton getExitButton() {
        return exitButton;
    }
    
    public JButton getOpenButton() {
        return openButton;
    }
    
    public JComboBox<String> getCmbVehicleCategory() {
        return cmbVehicleCategory;
    }
    
    public JComboBox<String> getCmbVehicleType() {
        return cmbVehicleType;
    }
    
    public JLabel getLblCarNameValue() {
        return lblCarNameValue;
    }
    
    public void setText(String s) {
        lblCarNameValue.setText(s);
    }
}