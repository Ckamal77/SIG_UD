/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Christine
 */
public class invHeaderTableModel extends AbstractTableModel {   

    private final List<Invoice>invoicesArray;
    private final DateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy");
    public invHeaderTableModel(List<Invoice>invoicesArray) {
    this.invoicesArray = invoicesArray;
     
    }

   
    @Override
    public int getRowCount() {
return invoicesArray.size();
    }
 public List<Invoice> getInvoicesArray() {
        return invoicesArray;
    }
   
 
    @Override
    public int getColumnCount() {
        return 4;
    }
        

    
@Override
    public String getColumnName(int columnIndex){
      switch (columnIndex) {
          case 0 :
              return "invoice Num";
          case 1 :
              return "Customer Name";
          case 2 :
              return "Invoice Date";
          case 3 :
              return "Invoice Total";
          default:
              return "";
      }
    }
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice row =invoicesArray.get(rowIndex);
        switch(columnIndex){
            case 0: return row.getInvNum();
            case 1 : return row.getCustomerName();
            case 2 : return dateformate.format(row.getInvDate());
            case 3 : return row.getInvTotal();
            default:
            return null;
    }
}

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
          case 0 :
              return Integer.class;
          case 1 :
              return String.class;
          case 2 :
              return String.class;
          case 3 :
              return Double.class;
          default:
              return Object.class;
    }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
    }

  

   

 }
 