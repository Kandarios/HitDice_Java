package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class MainWindow {

  private JFrame frmDiceSimulator;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainWindow window = new MainWindow();
          window.frmDiceSimulator.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public MainWindow() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmDiceSimulator = new JFrame();
    frmDiceSimulator.setTitle("Dice Simulator");
    frmDiceSimulator.setBounds(100, 100, 628, 670);
    frmDiceSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.setBackground(SystemColor.control);
    tabbedPane.setFont( new Font( "Dialog", Font.PLAIN, 18 ) );
    frmDiceSimulator.getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
    
    Panel panel = new Panel();
    panel.setBackground(SystemColor.control);
    tabbedPane.addTab("D6", null, panel, null);
    panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JPanel panel_3 = new DiceRolePannel();

//    panel_3.initialize();
    panel.add(panel_3);
    
    
    
    Panel panel_1 = new Panel();
    panel_1.setBackground(SystemColor.control);
    tabbedPane.addTab("D20", null, panel_1, null);
    
    DiceRolePannel diceRolePannel = new DiceRolePannel();
    panel_1.add(diceRolePannel);
    
    Panel panel_2 = new Panel();
    panel_2.setBackground(SystemColor.control);
    tabbedPane.addTab("Hit Zone", null, panel_2, null);
    
    DiceRolePannel diceRolePannel_1 = new DiceRolePannel();
    panel_2.add(diceRolePannel_1);
    

    
    
  }
}
