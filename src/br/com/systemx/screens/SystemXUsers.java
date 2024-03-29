package br.com.systemx.screens;

import java.sql.*;
import br.com.systemx.dal.ModuleConnection;
import javax.swing.JOptionPane;

public class SystemXUsers extends javax.swing.JInternalFrame {
    
    Connection connect = null;
    PreparedStatement pst = null;
    ResultSet resultSet = null;
    
    public SystemXUsers() {
        initComponents();
        connectDataBase();
    }
    
    private void connectDataBase(){
        connect = ModuleConnection.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        lblTelephone = new javax.swing.JLabel();
        phoneUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        passUser = new javax.swing.JTextField();
        lblProfile = new javax.swing.JLabel();
        jComboProfile = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblMandatory = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/user-logo.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(682, 582));

        lblId.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblId.setText("Id*");

        idUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblName.setText("Nome*");

        nameUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblTelephone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblTelephone.setText("Telefone");

        phoneUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblUser.setText("Login*");

        loginUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblPass.setText("Senha*");

        passUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblProfile.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblProfile.setText("Perfil");

        jComboProfile.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jComboProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        btnCreate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/create.png"))); // NOI18N
        btnCreate.setToolTipText("Cadastrar");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/read.png"))); // NOI18N
        btnRead.setToolTipText("Pesquisar");
        btnRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/update.png"))); // NOI18N
        btnUpdate.setToolTipText("Atualizar");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/delete.png"))); // NOI18N
        btnDelete.setToolTipText("Apagar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblMandatory.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblMandatory.setText(" * Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelephone)
                            .addComponent(lblName)
                            .addComponent(lblProfile)
                            .addComponent(lblId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMandatory))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passUser)
                                        .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 149, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(lblPass))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMandatory))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameUser)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginUser)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passUser)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRead, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41))
        );

        setBounds(0, 0, 682, 582);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        create();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        read();
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField idUser;
    private javax.swing.JComboBox<String> jComboProfile;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMandatory;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField loginUser;
    private javax.swing.JTextField nameUser;
    private javax.swing.JTextField passUser;
    private javax.swing.JTextField phoneUser;
    // End of variables declaration//GEN-END:variables
    
    private void clearFields(){
        nameUser.setText(null);
        phoneUser.setText(null);
        loginUser.setText(null);
        passUser.setText(null);
        
        jComboProfile.setSelectedIndex(0);
    }
    
    public void delete(){
        String sql = "delete from tbusuarios where iduser = ?";
        String id = idUser.getText();
        
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null,
                "Nenhum Usúario Selecionado \n\n"
              + "Selecione um usúario para apagar! \n"
              ,"Nenhum Usúario Selecionado ", JOptionPane.INFORMATION_MESSAGE
            );
            
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, 
                "Tem certeza que deseja apagar\n "
              + "este usuario?"
              , "Tem Certeza", JOptionPane.YES_NO_OPTION
        );
        
        if(response != JOptionPane.YES_OPTION){
            return;
        }
            
        try {        
            pst = connect.prepareStatement(sql);
            pst.setString(1, id);            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,
                "Usúario Apagado \n\n"
              + "usúario apagado com sucesso! \n"
              ,"Usúario Apagado", JOptionPane.INFORMATION_MESSAGE
            );
            
            clearFields();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Sistema Indiponível \n\n"
                    + "Verifique sua conexão com a internet \n"
                    + "ou entre em contato com o desenvolvedor \n"
                    + "do sistema!",
                    "Sistema Indiponível", JOptionPane.ERROR_MESSAGE
            );    
            connectDataBase();
        }
    }
    
    public void update(){
        String sql = "update tbusuarios set usuario = ?, fone = ?, login = ?, senha = ?, perfil = ? where iduser = ?";    
        
        String id = idUser.getText();
        String user = nameUser.getText();
        String phone = phoneUser.getText();
        String login = loginUser.getText();
        String password = passUser.getText();
        String profile = Integer.toString(jComboProfile.getSelectedIndex());
        
        if(profile.equals("0")){
            profile = "admin";
        }else{
            profile = "user";
        }
        
        try {        
            pst = connect.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, phone);
            pst.setString(3, login);
            pst.setString(4, password);
            pst.setString(5, profile);
            pst.setString(6, id);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,
                "Dados Atualizados \n\n"
              + "Dados atualizados com sucesso! \n"
              ,"Dados Atualizados", JOptionPane.INFORMATION_MESSAGE
            );
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Sistema Indiponível \n\n"
                    + "Verifique sua conexão com a internet \n"
                    + "ou entre em contato com o desenvolvedor \n"
                    + "do sistema!",
                    "Sistema Indiponível", JOptionPane.ERROR_MESSAGE
            );     
            connectDataBase();
        }
    }
     
    private void read(){
        String sql = "select * from tbusuarios where iduser = ?";
        String id = idUser.getText();
        
        try {
            pst = connect.prepareStatement(sql);
            pst.setString(1, id);
            resultSet = pst.executeQuery();
            
            if(resultSet.next()){
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String login = resultSet.getString(4);
                String password = resultSet.getString(5);
                String profile = resultSet.getString(6);
                
                nameUser.setText(name);
                phoneUser.setText(phone);
                loginUser.setText(login);
                passUser.setText(password);
                
                if(profile.equals("admin")){
                    jComboProfile.setSelectedIndex(0);
                }else{
                    jComboProfile.setSelectedIndex(1);
                }
            }else{
                JOptionPane.showMessageDialog(null,
                    "Usuário Não Encontrado \n\n"
                    + "O usúario pesquisado não existe! \n"
                    + "Verifique se os dados estão corretos... \n"
                    ,"Usuário Não Encontrado", JOptionPane.ERROR_MESSAGE
                );
                
                clearFields();
            }
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Sistema Indiponível \n\n"
                    + "Verifique sua conexão com a internet \n"
                    + "ou entre em contato com o desenvolvedor \n"
                    + "do sistema!",
                    "Sistema Indiponível", JOptionPane.ERROR_MESSAGE
            );     
            clearFields();
            connectDataBase();
        }
    }
    
    private void create(){
        String sql = "insert into tbusuarios (iduser, usuario, fone, login, senha, perfil) values (?, ?, ?, ?, ?, ?)";
        String id = idUser.getText();
        String user = nameUser.getText();
        String phone = phoneUser.getText();
        String login = loginUser.getText();
        String password = passUser.getText();
        String profile = Integer.toString(jComboProfile.getSelectedIndex());
        
        if(profile.equals("0")){
            profile = "admin";
        }else{
            profile = "user";
        }
        
        if(idUser.getText().isEmpty() || nameUser.getText().isEmpty() || loginUser.getText().isEmpty() || passUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Campos Vazio\n\n"
                    + "Preencha todos os campos obrigatórios (*)\n"
                    ,"Campos Vazio", JOptionPane.ERROR_MESSAGE
            );
            
            return;
        }
        
        try{
            pst = connect.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, user);
            pst.setString(3, phone);
            pst.setString(4, login);
            pst.setString(5, password);
            pst.setString(6, profile);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,
                "Usúario Cadastrado \n\n"
              + "O usúario foi cadastrado com sucesso! \n"
              ,"Usúario Cadastrado", JOptionPane.INFORMATION_MESSAGE
            );
                
            clearFields();            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Usúario Já Existe\n\n"
                    + "Este usúario já está cadastrado\n"
                    + "não pode existir dois usuarios \n"
                    + "com o mesmo id ou usúario!",
                    "Usúario Já Existe", JOptionPane.ERROR_MESSAGE
            );     
        }
    }
}