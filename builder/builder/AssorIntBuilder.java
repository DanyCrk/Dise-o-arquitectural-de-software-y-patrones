import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AssorIntBuilder extends UIBuilder {
  private JTextField txtAddress = new JTextField(20);
  private JTextField txtID = new JTextField(10);
  private JTextField txtEmail = new JTextField(20);
  private JTextField txtIES = new JTextField(20);
  private JTextField txtPhone = new JTextField(15);

  public void addUIControls() {
    searchUI = new JPanel();
    JLabel lblAddress = new JLabel("Address: ");
    JLabel lblID = new JLabel("Identification number: ");
    JLabel lblEmail = new JLabel("E-mail: ");
    JLabel lblIES = new JLabel("Education Institute: ");
    JLabel lblPhone = new JLabel("Phone Number:");

    GridBagLayout gridbag = new GridBagLayout();
    searchUI.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.anchor = GridBagConstraints.WEST;

    searchUI.add(lblAddress);
    searchUI.add(txtAddress);
    searchUI.add(lblID);
    searchUI.add(txtID);
    searchUI.add(lblEmail);
    searchUI.add(txtEmail);
    searchUI.add(lblIES);
    searchUI.add(txtIES);
    searchUI.add(lblPhone);
    searchUI.add(txtPhone);

    gbc.insets.top = 5;
    gbc.insets.bottom = 5;
    gbc.insets.left = 5;
    gbc.insets.right = 5;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gridbag.setConstraints(lblAddress, gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gridbag.setConstraints(txtAddress, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;

    gridbag.setConstraints(lblID, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gridbag.setConstraints(txtID, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;

    gridbag.setConstraints(lblEmail, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gridbag.setConstraints(txtEmail, gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;

    gridbag.setConstraints(lblIES, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gridbag.setConstraints(txtIES, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;

    gridbag.setConstraints(lblPhone, gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    gridbag.setConstraints(txtPhone, gbc);
  }

  public void initialize() {
    txtAddress.setText("Enter Address");
    txtID.setText("Enter ID");
    txtEmail.setText("example@domain.com");
    txtIES.setText("Enter Education Institute");
    txtPhone.setText("(000) 000-0000");
  }

  public String getSQL() {
    return "INSERT INTO assistant or Intern (Address, Identification Number, Email, IES, PhoneNumber) VALUES ('" +
        txtAddress.getText() + "', '" +
        txtID.getText() + "', '" +
        txtEmail.getText() + "', '" +
        txtIES.getText() + "', '" +
        txtPhone.getText() + "', '" +
        "')";
  }

}
