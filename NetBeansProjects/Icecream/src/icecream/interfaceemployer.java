

package icecream;

public class interfaceemployer extends javax.swing.JFrame {
      
    public interfaceemployer() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        id.setVisible(false);
        id_emp.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pdv = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        caisse = new javax.swing.JButton();
        commande = new javax.swing.JButton();
        fond_caisse = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        Label_responsable = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        id_emp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Point de vente:");

        pdv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdv.setText("jLabel2");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        caisse.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        caisse.setText("CAISSE");
        caisse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisseActionPerformed(evt);
            }
        });

        commande.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        commande.setText("COMMMANDE");
        commande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandeActionPerformed(evt);
            }
        });

        fond_caisse.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        fond_caisse.setText("FOND CAISSE");
        fond_caisse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fond_caisseActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(commande)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(caisse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fond_caisse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(caisse)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(commande)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fond_caisse)
                .addGap(32, 32, 32))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Bonjour, ");

        nom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nom.setText("jLabel3");

        prenom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        prenom.setText("jLabel4");

        Label_responsable.setText("jLabel3");

        id.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        id.setText("jLabel3");

        id_emp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id_emp.setText("jLabel3");

        jMenu1.setText("Menu");

        jMenuItem1.setText("Se déconnecter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pdv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_responsable)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_emp)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom)
                    .addComponent(prenom)
                    .addComponent(id_emp))
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pdv)
                    .addComponent(Label_responsable)
                    .addComponent(id))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Initialisation de l'interface de connexion
     * Si le boutton est selectionné l'interface de connexion est appelé
     * @param evt 
     */
    
    //Menu de deconnexion
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        // TODO add your handling code here:
        
        interfaceLogin l=new interfaceLogin();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

     /**
     /* Initialisation de l'interface caisse
     * Si le boutton est selectionné l'interface du caisse
     */
    
    private void caisseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisseActionPerformed
        // TODO add your handling code here:
        interfacecaisse ic = new interfacecaisse(this);
        ic.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_caisseActionPerformed

     /**
     /* Initialisation de l'interface commande
     * Si le boutton est selectionné l'interface commande
     */
    
    private void commandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandeActionPerformed
        // TODO add your handling code here:
        interfacecommande ico = new interfacecommande(this);
        ico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_commandeActionPerformed
    
     /**
     /* Initialisation de l'interface fond caisse
     * Si le boutton est selectionné l'interface fond caisse
     */
    private void fond_caisseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fond_caisseActionPerformed
        // TODO add your handling code here:
        interfacefondcaisse ifc= new interfacefondcaisse(this);
        ifc.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_fond_caisseActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Label_responsable;
    public javax.swing.JButton caisse;
    public javax.swing.JButton commande;
    private javax.swing.JButton fond_caisse;
    public javax.swing.JLabel id;
    public javax.swing.JLabel id_emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel nom;
    public javax.swing.JLabel pdv;
    public javax.swing.JLabel prenom;
    // End of variables declaration//GEN-END:variables
}
