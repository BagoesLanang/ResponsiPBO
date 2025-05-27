package view;

import controllerpack.RentalController;
import model.Rental;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class RentalPage extends JFrame{
    private JTable table;
    private RentalController controller = new RentalController();
    private JTextField nama, kontak, durasi;
    private JComboBox<String>jenis, status;
    private DefaultTableModel model;
    
public RentalPage(){
    setTitle("Input Data Rental ");
    setSize(900, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout(10,10));
    
    //Panel Form
    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    
    JLabel lblNama = new JLabel("Nama");
    nama = new JTextField();
    JLabel lblKontak = new JLabel("Kontak");
    kontak = new JTextField();
    JLabel lblJenis = new JLabel("Jenis");
    jenis = new JComboBox<>(new String[]{"Toyota", "Xenia", "Pajero", "BMW" });
    
    
    
    
}
    
}
