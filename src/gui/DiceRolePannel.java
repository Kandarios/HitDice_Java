package gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class DiceRolePannel extends JPanel {
  
  public DiceRolePannel() {
    initialize();
  }

  void initialize() {

    JPanel panel_4 = new JPanel();

    JPanel panel_5 = new JPanel();

    JPanel panel_6 = new JPanel();

    JPanel panel_results = new JPanel();
    panel_results.setLayout(new BoxLayout(panel_results, BoxLayout.Y_AXIS));

    JLabel lblNumberOfRoles = new JLabel("Number of Roles:");
    panel_5.add(lblNumberOfRoles);
    lblNumberOfRoles.setFont(new Font("Tahoma", Font.PLAIN, 18));

    JSpinner spinnerNofRoles = new JSpinner();
    panel_5.add(spinnerNofRoles);
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    JLabel lblNumberOfDice = new JLabel("Number of Dice: ");
    panel_4.add(lblNumberOfDice);
    lblNumberOfDice.setFont(new Font("Tahoma", Font.PLAIN, 18));
    JSpinner spinnerNofDice = new JSpinner();
    panel_4.add(spinnerNofDice);
    this.add(panel_4);
    this.add(panel_5);
    this.add(panel_6);

    JLabel lblResults = new JLabel("Results:");
    lblResults.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.add(lblResults);
    this.add(panel_results);

    JButton btnRole = new JButton("Role");
    panel_6.add(btnRole);
    btnRole.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        Component[] components = panel_results.getComponents();
        for(Component c: components) {
          panel_results.remove(c);
          panel_results.validate();
          panel_results.repaint();
          validate();
          repaint();
        }
        for(int i = 0; i < (int)spinnerNofRoles.getValue(); i++) {
          JLabel label = new JLabel("Result " + (i+1));
          label.setAlignmentX(Component.CENTER_ALIGNMENT);
          panel_results.add(label);
          System.out.println("Did something");
        }
        panel_results.validate();
        panel_results.repaint();
        validate();
        repaint();
        getParent().validate();
        getParent().repaint();
      }
    });
    btnRole.setVerticalAlignment(SwingConstants.BOTTOM);
  }
}
