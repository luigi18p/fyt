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
import domain.Annuncio;
import domain.BigliettoTreno;
import domain.CatalogoPersonale;
import rmi.IGestoreAnnuncio;

/**
 *
 * @author gioac
 */
public class FrameIMieiAnnunci extends javax.swing.JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5583396281011731777L;
	/**
     * Creates new form FrameIMieiAnnunci
     */
	private static String username;
	
    public FrameIMieiAnnunci(String username) {
    	FrameIMieiAnnunci.username = username;
        initComponents();
        initTable();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnnunci = new javax.swing.JTable();
        jButtonVisualizza = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Find Your Ticket");

        jTableAnnunci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Annuncio", "Prezzo", "Tipo Trasporto"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Float.class, java.lang.String.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAnnunci);

        jButtonVisualizza.setText("Visualizza");
        jButtonVisualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizzaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonVisualizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRimuovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnnulla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButtonVisualizza)
                .addGap(35, 35, 35)
                .addComponent(jButtonRimuovi)
                .addGap(35, 35, 35)
                .addComponent(jButtonAnnulla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>            
    
    private void initTable() {
    	
    	try {
			DefaultTableModel table = (DefaultTableModel) jTableAnnunci.getModel();
			CatalogoPersonale cp = new CatalogoPersonale();
			
			Registry registry = LocateRegistry.getRegistry(FrameLogin.myhost,5008);
			IGestoreAnnuncio sketetonGAnnuncio = (IGestoreAnnuncio) registry.lookup("IGestoreAnnuncio");
			cp = sketetonGAnnuncio.getAllAnnunciPersonali(username);
			
			for(Annuncio a : cp.getElencoAnnunci()) {
				table.addRow(new Object[] {a.getIdAnnuncio(),a.getPrezzoRichiesto(),a.getTipoTrasporto()});
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
    	try {
	    	ListSelectionModel cellSelectionModel = jTableAnnunci.getSelectionModel();
	    	cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    	
	    	
	    	int[] selectedRow = jTableAnnunci.getSelectedRows();
	        //int[] selectedColumns = jTableAnnunci.getSelectedColumns();
	    	//Object idBiglietto = jTableAnnunci.getValueAt(selectedRow[0], selectedColumns[0]);
	        
	        Object idBiglietto = jTableAnnunci.getValueAt(selectedRow[0], 0);
	       // String id = String.valueOf(idBiglietto);
	        int id = (int) idBiglietto;
	        

	        //GestoreAnnuncio gestoreAnnuncio = new GestoreAnnuncio();
	        Registry registry = LocateRegistry.getRegistry(FrameLogin.myhost,5008);
	        IGestoreAnnuncio sketetonGAnnuncio = (IGestoreAnnuncio) registry.lookup("IGestoreAnnuncio");
	        BigliettoTreno b = sketetonGAnnuncio.ReadBigliettoTreno(id);
	        
	        JOptionPane.showMessageDialog(null,
	        		"\nNome:		"+b.getNominativo()+
	        		"\nPartenza:	"+b.getPartenza()+
	        		"\nArrivo:		"+b.getArrivo()+
	        		"\nData Andata:	"+b.getDataAndata()+
	        		"\nData Ritorno:"+b.getDataRitorno()+
	        		"\nTipologia A/R:"+b.getTipologiaAR()+
	        		"\nPrezzo Acquisto:"+b.getPrezzoAcquisto()+
	        		"\nN. Posti:	"+b.getNumeroDiPosti()+
	        		"\nCompagnia:	"+b.getCompagnia()+
	        		"\nClasse:		"+b.getClasse()+
	        		"\nFermate:		"+b.getFermate()
	        	);
    	}catch(ConnectException ce) {
    		JOptionPane.showMessageDialog(null,"Server non raggiungibile. ");
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"Seleziona un annuncio");
    		//e.printStackTrace();
    	}
        
    }                                                 

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        //pulsante rimuovi
    	
    	try {
	    	ListSelectionModel cellSelectionModel = jTableAnnunci.getSelectionModel();
	    	cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    	
	    	int[] selectedRow = jTableAnnunci.getSelectedRows();
	        //int[] selectedColumns = jTableAnnunci.getSelectedColumns();
	    	//Object idBiglietto = jTableAnnunci.getValueAt(selectedRow[0], selectedColumns[0]);
	        Object idBiglietto = jTableAnnunci.getValueAt(selectedRow[0], 0);
	        //String id = String.valueOf(idBiglietto);
	        int i = (int) idBiglietto;
	        
	        FrameRimuovi rimuovi = new FrameRimuovi(username,i);
	        rimuovi.setVisible(true);
	        rimuovi.toFront();
	        this.setVisible(false);
	        
    	}catch(Exception e) {
    		//e.printStackTrace();
    		JOptionPane.showMessageDialog(null,"Seleziona un annuncio da eliminare");
    		
    	}
	        		
    }                                              

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        //pulsante annulla
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
            java.util.logging.Logger.getLogger(FrameIMieiAnnunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAnnunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAnnunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameIMieiAnnunci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	new FrameIMieiAnnunci(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonVisualizza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAnnunci;
    // End of variables declaration                   
}
