
import java.util.*;
import java.io.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;

public class OrderManager extends JFrame {

    public static final String newline = "\n";
    public static final String GET_TOTAL = "Get Total";

    //First Modification
    public static final String MODIFY = "Modify";
    public static final String SEARCH = "Search";
    private int order_number = 0;
    public static final String CREATE_ORDER = "Create Order";
    public static final String EXIT = "Exit";
    public static final String CA_ORDER = "California Order";
    public static final String NON_CA_ORDER = "Non-California Order";
    public static final String OVERSEAS_ORDER = "Overseas Order";

    private JComboBox cmbOrderType;
    private JTextField txtOrderAmount, txtAdditionalTax, txtAdditionalSH, txtNumOrderModify;
    private JLabel lblOrderType, lblOrderAmount;
    private JLabel lblAdditionalTax, lblAdditionalSH;
    private JLabel lblTotal, lblTotalValue, lblNumOrder, lblOrderModify, lblContOrder;

    public void setLblContOrder() {
//        this.lblContOrder = lblContOrder;
        this.lblContOrder.setText(Integer.toString(getOrder_number()));
        //Integer.toString(getOrder_number()));
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }
    private OrderVisitor objVisitor;

    public OrderManager() {
        super("Visitor Pattern - Example");

        //Create the visitor instance
        objVisitor = new OrderVisitor();

        cmbOrderType = new JComboBox();
        cmbOrderType.addItem(OrderManager.CA_ORDER);
        cmbOrderType.addItem(OrderManager.NON_CA_ORDER);
        cmbOrderType.addItem(OrderManager.OVERSEAS_ORDER);

        txtOrderAmount = new JTextField(10);
        txtAdditionalTax = new JTextField(10);
        txtAdditionalSH = new JTextField(10);
        txtNumOrderModify = new JTextField(10);

        lblOrderType = new JLabel("Order Type:");
        lblOrderAmount = new JLabel("Order Amount:");
        lblAdditionalTax = new JLabel("Additional Tax(CA Orders Only):");
        lblAdditionalSH = new JLabel("Additional S & H(Overseas Orders Only):");

        lblTotal = new JLabel("Result:");
        lblTotalValue = new JLabel("Click Create or GetTotal Button");

        lblNumOrder = new JLabel("Order Number:");
        lblContOrder = new JLabel(Integer.toString(order_number));

        lblOrderModify = new JLabel("Order Number to Modify:");

        //Create the get Total button
        JButton getTotalButton = new JButton(OrderManager.GET_TOTAL);
        getTotalButton.setMnemonic(KeyEvent.VK_G);

        //Create the save button
        JButton searchButton = new JButton(OrderManager.SEARCH);
        getTotalButton.setMnemonic(KeyEvent.VK_C);

        JButton createOrderButton = new JButton(OrderManager.CREATE_ORDER);
        getTotalButton.setMnemonic(KeyEvent.VK_C);

        // Create the search button
        JButton saveButton = new JButton(OrderManager.MODIFY);
        getTotalButton.setMnemonic(KeyEvent.VK_C);

        JButton exitButton = new JButton(OrderManager.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);

        ButtonHandler objButtonHandler = new ButtonHandler(this);

        getTotalButton.addActionListener(objButtonHandler);
        createOrderButton.addActionListener(objButtonHandler);

        searchButton.addActionListener(objButtonHandler);
        saveButton.addActionListener(objButtonHandler);

        exitButton.addActionListener(new ButtonHandler());

        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel();

        JPanel panel = new JPanel();

        JPanel searchPanel = new JPanel();

        GridBagLayout gridbag2 = new GridBagLayout();
        panel.setLayout(gridbag2);

        GridBagConstraints gbc2 = new GridBagConstraints();
        panel.add(getTotalButton);
        panel.add(createOrderButton);
        panel.add(searchButton);
        panel.add(exitButton);

        gbc2.anchor = GridBagConstraints.EAST;
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(createOrderButton, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(searchButton, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(getTotalButton, gbc2);
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(exitButton, gbc2);

        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblOrderType, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(cmbOrderType, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblOrderAmount, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(txtOrderAmount, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblAdditionalTax, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(txtAdditionalTax, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblAdditionalSH, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(txtAdditionalSH, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(lblTotal, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(lblTotalValue, gbc);

        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;

        gbc.anchor = GridBagConstraints.PAGE_END; //bottom of space
        gbc.insets = new Insets(50, 50, 0, 0);  //top padding
        gridbag.setConstraints(lblNumOrder, gbc);
        gridbag.setConstraints(lblContOrder, gbc);
        gbc.gridx = 10;
        gbc.gridy = 5;
        gridbag.setConstraints(lblOrderModify, gbc);
        gbc.gridx = 10;
        gbc.gridy = 5;
        gridbag.setConstraints(txtNumOrderModify, gbc);
        gbc.gridx = 10;
        gbc.gridy = 5;

        buttonPanel.add(lblOrderType);
        buttonPanel.add(cmbOrderType);
        buttonPanel.add(lblOrderAmount);
        buttonPanel.add(txtOrderAmount);
        buttonPanel.add(lblAdditionalTax);
        buttonPanel.add(txtAdditionalTax);
        buttonPanel.add(lblAdditionalSH);
        buttonPanel.add(txtAdditionalSH);
        buttonPanel.add(lblTotal);
        buttonPanel.add(lblTotalValue);

        searchPanel.add(lblNumOrder);
        searchPanel.add(lblContOrder);
        searchPanel.add(lblOrderModify);
        searchPanel.add(txtNumOrderModify);

        //buttonPanel.add(lbcontOrder);
        panel.add(createOrderButton);
        panel.add(getTotalButton);
        panel.add(saveButton);
        panel.add(searchButton);
        panel.add(exitButton);

        //****************************************************
        //Add the buttons and the log to the frame
        Container contentPane = getContentPane();

        contentPane.add(buttonPanel, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(searchPanel, BorderLayout.SOUTH);
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(
                    OrderManager.this);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new OrderManager();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

        frame.pack();
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    public void setTotalValue(String msg) {
        lblTotalValue.setText(msg);
    }
    
    public void clean(){
        txtAdditionalSH.setText("");
        txtAdditionalTax.setText("");
        txtNumOrderModify.setText("");
        txtOrderAmount.setText("");
        
    }

    public OrderVisitor getOrderVisitor() {
        System.out.println("\nGetting the order visitor ^^");
        return objVisitor;
    }

    public String getOrderType() {
        return (String) cmbOrderType.getSelectedItem();
    }

    public String getOrderAmount() {
        return txtOrderAmount.getText();
    }

    public String getTax() {
        return txtAdditionalTax.getText();
    }

    public String getSH() {
        return txtAdditionalSH.getText();
    }

    public void setCmbOrderType(int cmbOrderType) {
        this.cmbOrderType.setSelectedIndex(cmbOrderType);
    }

    public void setTxtOrderAmount(String txtOrderAmount) {
        this.txtOrderAmount.setText(txtOrderAmount);
    }

    public void setTxtAdditionalTax(String txtAdditionalTax) {
        this.txtAdditionalTax.setText(txtAdditionalTax);
    }

    public void setTxtAdditionalSH(String txtAdditionalSH) {
        this.txtAdditionalSH.setText(txtAdditionalSH);
    }

    public String getNumOrderModify() {

        return txtNumOrderModify.getText();
    }

    public void setNumOrderModify(JTextField txtNumOrderModify) {
        this.txtNumOrderModify = txtNumOrderModify;
    }

} // End of class OrderManager

class ButtonHandler implements ActionListener {

    OrderManager objOrderManager;
    AllOrders ao = new AllOrders();
    Order order;
    int idOrder;
    int numModify;

    public void actionPerformed(ActionEvent e) {
        String totalResult;

        if (e.getActionCommand().equals(OrderManager.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(OrderManager.MODIFY)) {

            //get input values
            idOrder = numModify - 1;
            System.out.println("Modify id: " + idOrder);
            String orderType = objOrderManager.getOrderType();
            String strOrderAmount = objOrderManager.getOrderAmount();
            String strTax = objOrderManager.getTax();
            String strSH = objOrderManager.getSH();

            //Modify the order
            modifyOrder(idOrder, orderType,
                    Double.parseDouble(strOrderAmount),
                    Double.parseDouble(strTax),
                    Double.parseDouble(strSH)
            );
            objOrderManager.clean();
        }
        if (e.getActionCommand().equals(OrderManager.SEARCH)) {

            try {
                numModify = Integer.parseInt(objOrderManager.getNumOrderModify());
                searchOrder(numModify);
            } catch (Exception ec) {
            JOptionPane.showMessageDialog(objOrderManager, "Maybe This order does not exist");        
            }

        }

        if (e.getActionCommand().equals(OrderManager.CREATE_ORDER)) {
            //get input values
            idOrder = objOrderManager.getOrder_number();
            String orderType = objOrderManager.getOrderType();
            String strOrderAmount = objOrderManager.getOrderAmount();
            String strTax = objOrderManager.getTax();
            String strSH = objOrderManager.getSH();

            double dblOrderAmount = 0.0;
            double dblTax = 0.0;
            double dblSH = 0.0;

            if (strOrderAmount.trim().length() == 0) {
                strOrderAmount = "0.0";
            }
            if (strTax.trim().length() == 0) {
                strTax = "0.0";
            }
            if (strSH.trim().length() == 0) {
                strSH = "0.0";
            }

            dblOrderAmount = new Double(strOrderAmount).doubleValue();
            dblTax = new Double(strTax).doubleValue();
            dblSH = new Double(strSH).doubleValue();

            //Create the order
            order = createOrder(idOrder, orderType, dblOrderAmount, dblTax, dblSH);

            objOrderManager.setOrder_number(objOrderManager.getOrder_number() + 1);

            objOrderManager.setLblContOrder();
            objOrderManager.clean();

        }

        if (e.getActionCommand().equals(OrderManager.GET_TOTAL)) {

            //System.out.println("I'm trying to get the total");
            liquidateOrder();
            //Get the Visitor
            OrderVisitor visitor = objOrderManager.getOrderVisitor();
            //System.out.println("I've created the visitor");
            totalResult = new Double(visitor.getOrderTotal()).toString();
            totalResult = " Orders Total = " + totalResult;
            System.out.println("Total Result: " + totalResult);
            objOrderManager.setTotalValue(totalResult);

        }
    }

    public Order createOrder(int idOrder, String orderType, double orderAmount, double tax, double SH) {

        ao.saveOrder(idOrder, orderType, orderAmount, tax, SH);

        if (orderType.equalsIgnoreCase(OrderManager.CA_ORDER)) {
            return new CaliforniaOrder(orderAmount, tax);
        }
        if (orderType.equalsIgnoreCase(
                OrderManager.NON_CA_ORDER)) {
            return new NonCaliforniaOrder(orderAmount);
        }
        if (orderType.equalsIgnoreCase(
                OrderManager.OVERSEAS_ORDER)) {
            return new OverseasOrder(orderAmount, SH);
        }

        objOrderManager.setTotalValue(" Order Created Successfully");

        return null;
    }

    public void modifyOrder(int idOrder, String orderType, double orderAmount, double tax, double SH) {

        ao.saveOrder(idOrder, orderType, orderAmount, tax, SH);

        objOrderManager.setTotalValue(" Order Modify Successfully");
    }

    public void liquidateOrder() {

        //Get the Visitor
        OrderVisitor visitor = objOrderManager.getOrderVisitor();
        try {
            // accept the visitor instance
            order.accept(visitor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(objOrderManager, "Maybe We don't have any order");
        }
    }

    public Order searchOrder(int numModify) {

        if (Integer.parseInt(objOrderManager.getNumOrderModify()) >= ao.getSize()) {

            //System.out.println("SEARCH id: " + numModify);
            String dato = ao.data.get(numModify - 1).toString();

            String[] datos = dato.split(",");

            if (datos[0].length() == 17) {
                objOrderManager.setCmbOrderType(0);
            }

            if (datos[0].length() == 21) {
                objOrderManager.setCmbOrderType(1);
            }

            if (datos[0].length() == 15) {
                objOrderManager.setCmbOrderType(2);
            }

            objOrderManager.setTxtOrderAmount(datos[1]);
            objOrderManager.setTxtAdditionalTax(datos[2]);
            objOrderManager.setTxtAdditionalSH(datos[3]);
        }

        return null;
    }

    public ButtonHandler() {
    }

    public ButtonHandler(OrderManager inObjOrderManager) {
        objOrderManager = inObjOrderManager;
    }

} // End of class ButtonHandler

