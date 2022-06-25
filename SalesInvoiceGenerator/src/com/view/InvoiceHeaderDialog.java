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
public class InvoiceHeaderDialog extends JDialog{
private final JTextField custNameField;
    private final JTextField invDateField;
    private final JLabel custNameLbl;
    private final JLabel invDateLbl;
    private final JButton okBtn;
    private final JButton cancelBtn;

    public InvoiceHeaderDialog(InvoiceFrame frame) {

        custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        invDateLbl = new JLabel("Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
 
        okBtn.setActionCommand("createInvOK");
        cancelBtn.setActionCommand("createInvCancel");
       okBtn.addActionListener(frame.getListener());
         cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(custNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }

    
}
