/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import businessLogic.GestoreBiglietto;
import businessLogic.GestoreProfilo;
import domain.Profilo;

/**
 *
 * @author gioac
 */
public class FrameHome extends javax.swing.JFrame {

    /**
     * Creates new form FrameHome
     */
	private static String username;
	
    public FrameHome(String username) {
    	this.username=username;
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPartenza = new javax.swing.JTextField();
        jTextDestinazione = new javax.swing.JTextField();
        jCheckBoxTipAR = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCerca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerNPosti = new javax.swing.JSpinner();
        dateChooserPartenza = new datechooser.beans.DateChooserCombo();
        dateChooserDestinazione = new datechooser.beans.DateChooserCombo();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCiao = new javax.swing.JMenu();
        jMenuItemIMieiAnnunci = new javax.swing.JMenuItem();
        jMenuImieiAcquisti = new javax.swing.JMenuItem();
        jMenuGestisciProfilo = new javax.swing.JMenuItem();
        jMenuImpostazioni = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenuItem();
        jMenuInserisciAnnuncio = new javax.swing.JMenu();
        jMenuRiepilogo = new javax.swing.JMenu();
        jMenuContatti = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find Your Ticket");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Destinazione");

        jTextFieldPartenza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextDestinazione.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jCheckBoxTipAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxTipAR.setText("Andata e Ritorno");
        jCheckBoxTipAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTipARActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data Partenza");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data Ritorno");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Partenza");

        jButtonCerca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCerca.setText("Cerca");
        jButtonCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCercaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("N. Posti");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(dateChooserDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserPartenza, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerNPosti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerca))
                    .addComponent(jCheckBoxTipAR)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPartenza)
                            .addComponent(jTextDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxTipAR)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPartenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(dateChooserPartenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dateChooserDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerca)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jSpinnerNPosti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Biglietto Treno", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Biglietto Aereo", jPanel2);

        //jPanel3.setVisible(false);//non visualizza la ricerca

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 73));

        jLabel9.setText("Biglietto");

        jButton4.setText("Visualizza");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton4))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);
        jScrollPane1.setVisible(false);//non visualizza la ricerca

        jMenuCiao.setText("Ciao "+username+"!");

        jMenuItemIMieiAnnunci.setText("I miei annunci");
        jMenuItemIMieiAnnunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIMieiAnnunciActionPerformed(evt);
            }
        });
        jMenuCiao.add(jMenuItemIMieiAnnunci);

        jMenuImieiAcquisti.setText("I miei acquisti");
        jMenuImieiAcquisti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuImieiAcquistiMouseClicked(evt);
            }
        });
        jMenuImieiAcquisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuImieiAcquistiActionPerformed(evt);
            }
        });
        jMenuCiao.add(jMenuImieiAcquisti);

        jMenuGestisciProfilo.setText("Gestisci profilo");
        jMenuGestisciProfilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGestisciProfiloMouseClicked(evt);
            }
        });
        jMenuGestisciProfilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestisciProfiloActionPerformed(evt);
            }
        });
        jMenuCiao.add(jMenuGestisciProfilo);

        jMenuImpostazioni.setText("Impostazioni");
        jMenuCiao.add(jMenuImpostazioni);

        jMenuLogout.setText("Logout");
        jMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoutActionPerformed(evt);
            }
        });
        jMenuCiao.add(jMenuLogout);

        jMenuBar1.add(jMenuCiao);

        jMenuInserisciAnnuncio.setText("Inserisci Annuncio");
        jMenuInserisciAnnuncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInserisciAnnuncioMouseClicked(evt);
            }
        });
        jMenuInserisciAnnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInserisciAnnuncioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuInserisciAnnuncio);

        jMenuRiepilogo.setText("Riepilogo");
        jMenuRiepilogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRiepilogoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRiepilogo);

        jMenuContatti.setText("Contatti");
        jMenuContatti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuContattiMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuContatti);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    private void jMenuItemIMieiAnnunciActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        this.toBack();
        //setVisible(false);//senza questa resta eseguita una finestra java di home
        FrameIMieiAnnunci myhome = new FrameIMieiAnnunci(username);
        myhome.setVisible(true);
        myhome.toFront();
        
    }                                                     

    private void jMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new FrameLogin().toFront();
        new FrameLogin().setState(java.awt.Frame.NORMAL);
        new FrameLogin().setVisible(true); //se tolgo l'istruz in login allora rimuovi anche questa, serve per rendere visibile la nuova finestra di login
        
    }                                           

    private void jMenuContattiMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        FrameContatti contatti = new FrameContatti();
        contatti.setVisible(true);
        contatti.toFront();
    }                                          

    private void jCheckBoxTipARActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonCercaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        //jPanel3.setVisible(true);//visualizza ricerca
        jScrollPane1.setVisible(true);//visualizza ricerca
        pack();
    }                                            

    private void jMenuImieiAcquistiActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        this.toBack();
        FrameIMieiAcquisti mieiAcquisti = new FrameIMieiAcquisti(username);
        mieiAcquisti.setVisible(true);
    	mieiAcquisti.toFront();
    }                                                  

    private void jMenuGestisciProfiloMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jMenuGestisciProfiloActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        this.toBack();
        FrameGestisciProfilo gestisciProfilo = new FrameGestisciProfilo(username);
        gestisciProfilo.setVisible(true);
    	gestisciProfilo.toFront();
    }                                                    

    private void jMenuInserisciAnnuncioActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jMenuInserisciAnnuncioMouseClicked(java.awt.event.MouseEvent evt) {                                                    
        // TODO add your handling code here:
        this.toBack();
        FrameInserisciAnnuncio inserisciAnnuncio = new FrameInserisciAnnuncio(username);
        inserisciAnnuncio.setVisible(true);
    	inserisciAnnuncio.toFront();
    }                                                   

    private void jMenuImieiAcquistiMouseClicked(java.awt.event.MouseEvent evt) {                                                
        // TODO add your handling code here:
        //pulsante i miei acquisti
    }                                               

    private void jMenuRiepilogoMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        ///riepologo
    	try {
			Profilo p = new Profilo(username);
			GestoreProfilo gestoreProfilo = new GestoreProfilo();
			p = gestoreProfilo.ReadProfilo(username);
			JOptionPane.showMessageDialog(null,
					"Username:"+username+
					"\nTotale Biglietti in vendita:"+p.getTotaleBigliettiInVendita()+
					"\nMedia Feedback:"+p.getMediaFeedback()+
					"\nN. Visite:"+p.getnVisite());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Errore nella visualizzazione del profilo");
			e.printStackTrace();
		}
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
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHome(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private datechooser.beans.DateChooserCombo dateChooserDestinazione;
    private datechooser.beans.DateChooserCombo dateChooserPartenza;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCerca;
    private javax.swing.JCheckBox jCheckBoxTipAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCiao;
    private javax.swing.JMenu jMenuContatti;
    private javax.swing.JMenuItem jMenuGestisciProfilo;
    private javax.swing.JMenuItem jMenuImieiAcquisti;
    private javax.swing.JMenuItem jMenuImpostazioni;
    private javax.swing.JMenu jMenuInserisciAnnuncio;
    private javax.swing.JMenuItem jMenuItemIMieiAnnunci;
    private javax.swing.JMenuItem jMenuLogout;
    private javax.swing.JMenu jMenuRiepilogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerNPosti;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextDestinazione;
    private javax.swing.JTextField jTextFieldPartenza;
    // End of variables declaration                   
}
