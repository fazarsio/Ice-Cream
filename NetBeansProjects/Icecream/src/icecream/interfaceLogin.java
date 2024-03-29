

package icecream;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import Icecream.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.MessageDigest;

public class interfaceLogin extends javax.swing.JFrame {
    
    
    //Initialiss parametres de connexion
    
    KeyListener k;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
//Variable responsable
    String responsable;
    /**
     * Creates new form Login
     */
    public interfaceLogin() {
        
        initComponents();
        conn=Icecream.connecterDB();
        
        //Lecture du clavier afin de prendre en compte le touche entrer
        KeyListener K = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
               if(e.getKeyCode()==10){
                        Boutton_coActionPerformed(null);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
           
        };
        k=K;
        user.addKeyListener(K);
        password.addKeyListener(K);
        this.setLocationRelativeTo(null);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        intitule_password = new javax.swing.JLabel();
        intitule_user = new javax.swing.JLabel();
        Boutton_co = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Connection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        intitule_password.setText("Mot de passe :");

        intitule_user.setText("Identifiant :");

        Boutton_co.setText("Connection");
        Boutton_co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boutton_coActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(intitule_password)
                    .addComponent(intitule_user))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(user)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Boutton_co, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intitule_user))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intitule_password))
                .addGap(18, 18, 18)
                .addComponent(Boutton_co)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 700, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Ice-Cream");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(700, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(700, 400));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

         /**
         * BOUTTON CONNECTER
         */
    
    private void Boutton_coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boutton_coActionPerformed
       
        // TODO add your handling code here:
        //requete Sql avec vérification dans la bdd
        
        String sql="select * from Employer E,point_de_vente P where E.id_pdv=P.id_pdv and Login=? and MDP=PASSWORD(?) ";
       
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,password.getText());
            //Exécution de la requete

            rs=pst.executeQuery();

            // Si log ok alors interface employer sinon Erreur

            if(rs.next()){
                
                    JOptionPane.showMessageDialog(null, "Identifiant correcte, appuyez sur ok pour continuer");
                    interfaceemployer ie= new interfaceemployer();                             
                    ie.setVisible(true);
                    this.dispose();

                    ie.nom.setText(rs.getString("Nom"));
                    ie.prenom.setText(rs.getString("Prenom"));
                    ie.pdv.setText(rs.getString("Ville"));
                    ie.id.setText(rs.getString("id_pdv"));
                    ie.id_emp.setText(rs.getString("id_emp"));
                 
                 // initialisation  chaine responsable   
                 String s=rs.getString("Responsable");
                
                 // Si responsable != ok stock = false
                 
                 if( s.equals("1"))
                
                 {
                     responsable="vous êtes un responsable";
                     
                 }
                 else
                 {
                     
                     responsable="vous n'etes pas responsable";
                     
                     
                 }
               
                 ie.Label_responsable.setText(responsable);
                 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Nom utilisateur et Mot de passe incorrecte");
                }
        }
        
        catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Boutton_coActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boutton_co;
    private javax.swing.JLabel intitule_password;
    private javax.swing.JLabel intitule_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
