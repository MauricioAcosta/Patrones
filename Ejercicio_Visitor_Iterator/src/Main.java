import java.awt.GridLayout;
/*  w  ww .ja  v  a2  s  .  c  o  m*/
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    Integer[] numbers = { 1, 2, 3 };
    String[] names = { "A", "B", "C" };
    JComboBox numberCombo = new JComboBox(numbers);
    JComboBox nameCombo = new JComboBox(names);
    JPanel p = new JPanel(new GridLayout(0, 1, 3, 3));
    p.add(numberCombo);
    p.add(nameCombo);

    JOptionPane.showMessageDialog(null, p);

    Integer chosenNumber = (Integer) numberCombo.getSelectedItem();
    System.out.println("Chosen Number: " + chosenNumber);
    String chosenName = (String) nameCombo.getSelectedItem();
    System.out.println("Chosen Name: " + chosenName);
  }
}