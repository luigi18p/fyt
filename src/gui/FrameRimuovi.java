/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.rmi.ConnectException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import businessLogic.GestoreAccordo;
import businessLogic.GestoreAnnuncio;
import jdk.nashorn.internal.runtime.ECMAErrors;
import rmi.IGestoreAnnuncio;
import rmi.IGestoreUtente;


/**
 *
 * @author gioac
 */
public class FrameRimuovi extends javax.swing.JFrame {

    /**
     * Creates new form FrameRimuovi
     */
	private static String username;
	private static int id;
	
    public FrameRimuovi(String username, int id) {
    	this.username = username;
    	this.id = id;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonVenduto = new javax.swing.JRadioButton();
        jRadioButtonInvenduto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextUserAcq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFeedback = new javax.swing.JTextArea();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jSliderRating = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Find Your Ticket");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Seleziona il motivo:");

        buttonGroup1.add(jRadioButtonVenduto);
        jRadioButtonVenduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonVenduto.setText("Biglietto venduto");

        buttonGroup1.add(jRadioButtonInvenduto);
        jRadioButtonInvenduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonInvenduto.setText("Biglietto invenduto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserisci username acquirente:");

        jTextUserAcq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Inserisci feedback:");

        jTextAreaFeedback.setColumns(20);
        jTextAreaFeedback.setRows(5);
        jScrollPane1.setViewportView(jTextAreaFeedback);

        jButtonAnnulla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonConferma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jSliderRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSliderRating.setMaximum(5);
        jSliderRating.setMinimum(1);
        jSliderRating.setPaintLabels(true);
        jSliderRating.setValue(1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rating:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButtonConferma)
                                .addGap(47, 47, 47)
                                .addComponent(jButtonAnnulla))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonInvenduto)
                                        .addComponent(jRadioButtonVenduto)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSliderRating, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jTextUserAcq, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonVenduto)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonInvenduto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextUserAcq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSliderRating, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConferma)
                            .addComponent(jButtonAnnulla))
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
    }                                              

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        //pulsante conferma
	    if(jRadioButtonInvenduto.isSelected()) {
	    	//GestoreAnnuncio gestoreAnnucio = new GestoreAnnuncio();
	    	try {	
	    		Registry registry = LocateRegistry.getRegistry("localhost",5008);
		        IGestoreAnnuncio igestoreAnnuncio = (IGestoreAnnuncio) registry.lookup("IGestoreAnnuncio");
	    		igestoreAnnuncio.DeleteBiglietto(id);
	    		JOptionPane.showMessageDialog(null,"Rimozione Confermata\nBiglietto non venduto!");
	    		this.toBack();
	            setVisible(false);
	    	}catch(ConnectException ce) {
	    		JOptionPane.showMessageDialog(null,"Server non raggiungibile. ");
	    	}catch(Exception e) {
	    		JOptionPane.showMessageDialog(null,"Rimozione non confermata.");
	    		//e.printStackTrace();
	    	}
    	}else if(jRadioButtonVenduto.isSelected()){
	    	//GestoreAnnuncio gestoreAnnuncio = new GestoreAnnuncio();
	    	String userAcq = jTextUserAcq.getText();
	    	String reviewVen = jTextAreaFeedback.getText();
	    	Boolean venduto = jRadioButtonVenduto.isSelected();
	    	int ratingV = jSliderRating.getValue();
	    	
	    	try {
	    		Registry registry = LocateRegistry.getRegistry("localhost",5008);
		        IGestoreAnnuncio igestoreAnnuncio = (IGestoreAnnuncio) registry.lookup("IGestoreAnnuncio");
				igestoreAnnuncio.CreateAccordo(username, id, userAcq,reviewVen,ratingV);
	    	}catch(ConnectException ce) {
	    		JOptionPane.showMessageDialog(null,"Server non raggiungibile. ");
	    	} catch(NullPointerException npe){
				JOptionPane.showMessageDialog(null,"Accordo non approvato!\nUsername invalida");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Accordo non approvato!");
				e.printStackTrace();
			} finally {
				this.toBack();
		        setVisible(false);
			}
    	}else
	    	JOptionPane.showMessageDialog(null,"Rimozione non autorizzata!\nSelezionare Venduto o Invenduto");
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
            java.util.logging.Logger.getLogger(FrameRimuovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRimuovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRimuovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRimuovi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRimuovi(username,id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonInvenduto;
    private javax.swing.JRadioButton jRadioButtonVenduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderRating;
    private javax.swing.JTextArea jTextAreaFeedback;
    private javax.swing.JTextField jTextUserAcq;
    // End of variables declaration                   
}
