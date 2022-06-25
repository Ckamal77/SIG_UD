/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Christine
 */
public class InvoiceLineDialog extends JDialog{
    private final JTextField itemNameField;
    private final JTextField itemCountField;
    private final JTextField itemPriceField;
    private final JLabel itemNameLbl;
    private final JLabel itemCountLbl;
    private final JLabel itemPriceLbl;
    private final JButton okBtn;
    private final JButton cancelBtn;
    
    public InvoiceLineDialog(InvoiceFrame frame) {
        itemNameField = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCountField = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPriceField = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener(frame.getListener());
        cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemNameField);
        add(itemCountLbl);
        add(itemCountField);
        add(itemPriceLbl);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }


    
}
  
