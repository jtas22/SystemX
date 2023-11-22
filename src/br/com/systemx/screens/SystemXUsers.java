package br.com.systemx.screens;

import javax.swing.ImageIcon;

public class SystemXUsers extends javax.swing.JInternalFrame {

    public SystemXUsers() {
        initComponents();
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/users-logo.png")));
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(682, 582));

        lblId.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblId.setText("Id");

        idUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblName.setText("Nome");

        nameUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblTelephone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblTelephone.setText("Telefone");

        phoneUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblUser.setText("Login");

        loginUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblPass.setText("Senha");

        passUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblProfile.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblProfile.setText("Perfil");

        jComboProfile.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jComboProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        btnCreate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/create.png"))); // NOI18N
        btnCreate.setText("Cadastrar");
        btnCreate.setToolTipText("Cadastrar");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRead.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/read.png"))); // NOI18N
        btnRead.setText("Pesquisar");
        btnRead.setToolTipText("Pesquisar");
        btnRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/update.png"))); // NOI18N
        btnUpdate.setText("Atualizar");
        btnUpdate.setToolTipText("Atualizar");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/delete.png"))); // NOI18N
        btnDelete.setText("Apagar");
        btnDelete.setToolTipText("Apagar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(lblPass)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelephone)
                            .addComponent(lblName)
                            .addComponent(lblProfile)
                            .addComponent(lblId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passUser)
                                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRead)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 682, 582);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField idUser;
    private javax.swing.JComboBox<String> jComboProfile;
    private javax.swing.JLabel lblId;
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
}