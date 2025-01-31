/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.rmi.AccessException;
import java.rmi.ConnectException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import domain.Accordo;
import domain.ElencoAccordi;
import rmi.IGestoreAccordo;

/**
 *
 * @author gioac
 */
public class FrameIMieiAcquisti extends javax.swing.JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1976673200586042819L;
	/**
     * Creates new form FrameIMieiAcquisti
     */
	private static String username;
	
    public FrameIMieiAcquisti(String username) {
    	FrameIMieiAcquisti.username=username;
        initComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonVisualizza = new javax.swing.JButton();
        jButtonRilascia = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Find Your Ticket");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username Venditore", "Id Biglietto", "Data Accordo", "Review Venditore", "Rating Venditore", "Rating Personale"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 3893158084794701141L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonVisualizza.setText("Visualizza Review");
        jButtonVisualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizzaActionPerformed(evt);
            }
        });

        jButtonRilascia.setText("Rilascia Review");
        jButtonRilascia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRilasciaActionPerformed(evt);
            }
        });

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonRilascia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnnulla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButtonVisualizza)
                .addGap(31, 31, 31)
                .addComponent(jButtonRilascia)
                .addGap(39, 39, 39)
                .addComponent(jButtonAnnulla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>   
    
    private void initTable() {
    	
    	try {
			DefaultTableModel table = (DefaultTableModel) jTable1.getModel();

			ElencoAccordi ea = new ElencoAccordi();
			Registry registry = LocateRegistry.getRegistry(FrameLogin.myhost,5008);
			IGestoreAccordo sketetonGAccordo = (IGestoreAccordo) registry.lookup("IGestoreAccordo");
			
			ea = sketetonGAccordo.ReadAllAccordi(username);
			for(Accordo a : ea.getElencoAccordi()) {
				table.addRow(new Object[] {a.getUserVen(),a.getIdAnnuncio(),a.getDataAccordo(),
						a.getReviewVen(),a.getRatingVen(),a.getRatingAcq()});
			}
    	}catch(ConnectException ce) {
    		JOptionPane.showMessageDialog(null,"Server non raggiungibile. ");
    	} catch (AccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void jButtonVisualizzaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        //visualizza review
    	try {
	    	ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();
	    	cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    	
	    	int[] selectedRow = jTable1.getSelectedRows();
	        //int[] selectedColumns = jTable1.getSelectedColumns();
	        
	        Object review = jTable1.getValueAt(selectedRow[0], 3);
	       // Object review = jTable1.getValueAt(selectedRow[0], selectedColumns[0]);
	        //String id = String.valueOf(idBiglietto);
       
	        JOptionPane.showMessageDialog(null,review);
    	}catch(Exception e) {
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(null,"Seleziona un elemento della colonna Review Venditore");
    	}
    }                                                 

    private void jButtonRilasciaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        //rilascia review
    	try {
	    	ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();
	    	cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    	
	    	int[] selectedRow = jTable1.getSelectedRows();
	        //int[] selectedColumns = jTable1.getSelectedColumns();
	        
	        //Object idBiglietto = jTable1.getValueAt(selectedRow[0], selectedColumns[0]);
	        Object idBiglietto = jTable1.getValueAt(selectedRow[0], 1);
	        //String id = String.valueOf(idBiglietto);

	        FrameRilasciaReview rilasciaReview = new FrameRilasciaReview(username,(int)idBiglietto);
	        rilasciaReview.setVisible(true);
	    	rilasciaReview.toFront();
	    	this.setVisible(false);
       
	        
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"Errore");
    		//e.printStackTrace();
    	}

    }                                               

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        //annulla
        this.toBack();
        setVisible(false);
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAcquisti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAcquisti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAcquisti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAcquisti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameIMieiAcquisti(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonRilascia;
    private javax.swing.JButton jButtonVisualizza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
