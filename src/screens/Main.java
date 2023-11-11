/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import utils.FontLoader;
import classes.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rwill
 */
public class Main extends javax.swing.JFrame {
    FontLoader fontLoader = new FontLoader();
    Font inter;
    Font puritanBold;
    Font puritanBoldSmall;

    /**
     * Creates new form Reservations
     */
    public Main() {
        setFonts();
        initComponents();
        setFrameIcon();
        setFirstPanel();
        fetchData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsBtnGroup = new javax.swing.ButtonGroup();
        sidePnl = new javax.swing.JPanel();
        reservationsBtn = new javax.swing.JButton();
        customersBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        mainPnl = new javax.swing.JPanel();
        reservationsPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        addReservationBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationsTbl = new javax.swing.JTable();
        reservationsTbl.getTableHeader().setFont(inter);
        customersPnl = new javax.swing.JPanel();
        aboutTitleLabel1 = new javax.swing.JLabel();
        searchField1 = new javax.swing.JTextField();
        inventoryPnl = new javax.swing.JPanel();
        aboutPnl = new javax.swing.JPanel();
        aboutTitle = new javax.swing.JPanel();
        aboutDesc = new javax.swing.JPanel();
        aboutHead1 = new javax.swing.JLabel();
        aboutDescText = new javax.swing.JLabel();
        aboutPrevimg1 = new javax.swing.JLabel();
        aboutPrevimg2 = new javax.swing.JLabel();
        aboutTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lath's Auto-Electrical Shop");

        sidePnl.setBackground(new java.awt.Color(255, 255, 255));
        sidePnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(0, 0, 0, 1, new java.awt.Color(218, 218, 218))
            , javax.swing.BorderFactory.createEmptyBorder(32, 32, 32, 32)));

    reservationsBtn.setBackground(new java.awt.Color(248, 248, 248));
    reservationsBtn.setFont(inter);
    reservationsBtn.setForeground(new java.awt.Color(35, 35, 35));
    reservationsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ClipboardCheckOutline.png"))); // NOI18N
    reservationsBtn.setText("  Reservations");
    reservationsBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    reservationsBtn.setBorderPainted(false);
    reservationsBtn.setFocusPainted(false);
    reservationsBtn.setFocusable(false);
    reservationsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    reservationsBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            reservationsBtnActionPerformed(evt);
        }
    });

    customersBtn.setBackground(new java.awt.Color(255, 255, 255));
    customersBtn.setFont(inter);
    customersBtn.setForeground(new java.awt.Color(35, 35, 35));
    customersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/UserOutline.png"))); // NOI18N
    customersBtn.setText("  Customers");
    customersBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    customersBtn.setBorderPainted(false);
    customersBtn.setFocusPainted(false);
    customersBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    customersBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            customersBtnActionPerformed(evt);
        }
    });

    inventoryBtn.setBackground(new java.awt.Color(255, 255, 255));
    inventoryBtn.setFont(inter);
    inventoryBtn.setForeground(new java.awt.Color(35, 35, 35));
    inventoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ArchiveOutline.png"))); // NOI18N
    inventoryBtn.setText("  Inventory");
    inventoryBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    inventoryBtn.setBorderPainted(false);
    inventoryBtn.setFocusPainted(false);
    inventoryBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            inventoryBtnActionPerformed(evt);
        }
    });

    aboutBtn.setBackground(new java.awt.Color(255, 255, 255));
    aboutBtn.setFont(inter);
    aboutBtn.setForeground(new java.awt.Color(35, 35, 35));
    aboutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ExclamationCircleOutline.png"))); // NOI18N
    aboutBtn.setText("  About");
    aboutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    aboutBtn.setBorderPainted(false);
    aboutBtn.setFocusPainted(false);
    aboutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    aboutBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            aboutBtnActionPerformed(evt);
        }
    });

    logoutBtn.setBackground(new java.awt.Color(40, 40, 40));
    logoutBtn.setFont(inter);
    logoutBtn.setForeground(new java.awt.Color(248, 248, 248));
    logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LogoutOutline.png"))); // NOI18N
    logoutBtn.setText("  Log out");
    logoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    logoutBtn.setBorderPainted(false);
    logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    logoutBtn.setFocusPainted(false);
    logoutBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            logoutBtnActionPerformed(evt);
        }
    });

    logoLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("../assets/logo.png")).getImage().getScaledInstance(167, 128, Image.SCALE_SMOOTH)));
    logoLabel.setMaximumSize(new java.awt.Dimension(167, 128));
    logoLabel.setMinimumSize(new java.awt.Dimension(167, 128));

    javax.swing.GroupLayout sidePnlLayout = new javax.swing.GroupLayout(sidePnl);
    sidePnl.setLayout(sidePnlLayout);
    sidePnlLayout.setHorizontalGroup(
        sidePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(sidePnlLayout.createSequentialGroup()
            .addGroup(sidePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reservationsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addComponent(customersBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aboutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    sidePnlLayout.setVerticalGroup(
        sidePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(sidePnlLayout.createSequentialGroup()
            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(reservationsBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(customersBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(inventoryBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(aboutBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
            .addComponent(logoutBtn))
    );

    getContentPane().add(sidePnl, java.awt.BorderLayout.WEST);

    mainPnl.setLayout(new java.awt.CardLayout());

    reservationsPnl.setBackground(new java.awt.Color(255, 255, 255));
    reservationsPnl.setBorder(javax.swing.BorderFactory.createEmptyBorder(32, 64, 32, 64));

    jLabel2.setFont(puritanBold);
    jLabel2.setForeground(new java.awt.Color(35, 35, 35));
    jLabel2.setText("RESERVATIONS");

    searchField.setBackground(new java.awt.Color(248, 248, 248));
    searchField.setFont(inter);
    searchField.setForeground(new java.awt.Color(129, 129, 129));
    searchField.setText("Search reservations");
    searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 218, 218)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
    searchField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            searchFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            searchFieldFocusLost(evt);
        }
    });
    searchField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchFieldActionPerformed(evt);
        }
    });

    addReservationBtn.setBackground(new java.awt.Color(40, 40, 40));
    addReservationBtn.setFont(inter);
    addReservationBtn.setForeground(new java.awt.Color(248, 248, 248));
    addReservationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Plus.png"))); // NOI18N
    addReservationBtn.setText("  Add new reservation");
    addReservationBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
    addReservationBtn.setBorderPainted(false);
    addReservationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addReservationBtn.setFocusPainted(false);
    addReservationBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addReservationBtnActionPerformed(evt);
        }
    });

    reservationsTbl.setBackground(new java.awt.Color(255, 255, 255));
    reservationsTbl.setFont(inter);
    reservationsTbl.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {"Richard William Flores", "10/22/2023", "09764753058", "Alternator repair"},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Name", "Date", "Contact number", "Service"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    reservationsTbl.setOpaque(false);
    jScrollPane1.setViewportView(reservationsTbl);

    javax.swing.GroupLayout reservationsPnlLayout = new javax.swing.GroupLayout(reservationsPnl);
    reservationsPnl.setLayout(reservationsPnlLayout);
    reservationsPnlLayout.setHorizontalGroup(
        reservationsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(reservationsPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(reservationsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addGroup(reservationsPnlLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(reservationsPnlLayout.createSequentialGroup()
                    .addComponent(searchField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(addReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    reservationsPnlLayout.setVerticalGroup(
        reservationsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(reservationsPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addGroup(reservationsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(addReservationBtn))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    mainPnl.add(reservationsPnl, "card3");

    customersPnl.setBackground(new java.awt.Color(255, 255, 255));
    customersPnl.setBorder(javax.swing.BorderFactory.createEmptyBorder(32, 64, 32, 64));

    aboutTitleLabel1.setFont(puritanBold);
    aboutTitleLabel1.setText("CUSTOMERS");

    searchField1.setBackground(new java.awt.Color(248, 248, 248));
    searchField1.setFont(inter);
    searchField1.setForeground(new java.awt.Color(129, 129, 129));
    searchField1.setText("Search customers");
    searchField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 218, 218)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
    searchField1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            searchField1FocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            searchField1FocusLost(evt);
        }
    });
    searchField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchField1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout customersPnlLayout = new javax.swing.GroupLayout(customersPnl);
    customersPnl.setLayout(customersPnlLayout);
    customersPnlLayout.setHorizontalGroup(
        customersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(customersPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(customersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customersPnlLayout.createSequentialGroup()
                    .addComponent(aboutTitleLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(searchField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)))
    );
    customersPnlLayout.setVerticalGroup(
        customersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(customersPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(aboutTitleLabel1)
            .addGap(18, 18, 18)
            .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(483, Short.MAX_VALUE))
    );

    mainPnl.add(customersPnl, "card2");

    javax.swing.GroupLayout inventoryPnlLayout = new javax.swing.GroupLayout(inventoryPnl);
    inventoryPnl.setLayout(inventoryPnlLayout);
    inventoryPnlLayout.setHorizontalGroup(
        inventoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1121, Short.MAX_VALUE)
    );
    inventoryPnlLayout.setVerticalGroup(
        inventoryPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 637, Short.MAX_VALUE)
    );

    mainPnl.add(inventoryPnl, "card4");

    aboutPnl.setBackground(new java.awt.Color(255, 255, 255));
    aboutPnl.setBorder(javax.swing.BorderFactory.createEmptyBorder(32, 64, 32, 64));

    aboutTitle.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout aboutTitleLayout = new javax.swing.GroupLayout(aboutTitle);
    aboutTitle.setLayout(aboutTitleLayout);
    aboutTitleLayout.setHorizontalGroup(
        aboutTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );
    aboutTitleLayout.setVerticalGroup(
        aboutTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    aboutDesc.setBackground(new java.awt.Color(255, 255, 255));

    aboutHead1.setFont(puritanBoldSmall);
    aboutHead1.setText("<html>LATH’S AUTO-ELECTRICAL SHOP - YOUR TRUSTED <br>AUTO-ELECTRICAL SOLUTION!</html>");

    aboutDescText.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
    aboutDescText.setForeground(new java.awt.Color(102, 102, 102));
    aboutDescText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    aboutDescText.setText("<html>At Lath’s Auto-Electrical Shop, we pride ourselves on being your one-stop destination for all things auto-electrical. With a passion for excellence and a commitment to customer satisfaction, we have been serving the automotive community in the Philippines since 2009.<html>");
    aboutDescText.setToolTipText("");
    aboutDescText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    aboutDescText.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    aboutPrevimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/aboutprev1.png"))); // NOI18N

    aboutPrevimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/aboutprev2.png"))); // NOI18N

    javax.swing.GroupLayout aboutDescLayout = new javax.swing.GroupLayout(aboutDesc);
    aboutDesc.setLayout(aboutDescLayout);
    aboutDescLayout.setHorizontalGroup(
        aboutDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(aboutDescLayout.createSequentialGroup()
            .addGroup(aboutDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(aboutHead1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aboutDescLayout.createSequentialGroup()
                    .addGroup(aboutDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(aboutDescLayout.createSequentialGroup()
                            .addComponent(aboutPrevimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(aboutPrevimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(aboutDescText, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    aboutDescLayout.setVerticalGroup(
        aboutDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(aboutDescLayout.createSequentialGroup()
            .addComponent(aboutHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(aboutDescText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(aboutDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(aboutPrevimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(aboutPrevimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(102, Short.MAX_VALUE))
    );

    aboutTitleLabel.setFont(puritanBold);
    aboutTitleLabel.setText("ABOUT");

    javax.swing.GroupLayout aboutPnlLayout = new javax.swing.GroupLayout(aboutPnl);
    aboutPnl.setLayout(aboutPnlLayout);
    aboutPnlLayout.setHorizontalGroup(
        aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(aboutPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aboutPnlLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(aboutTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(aboutPnlLayout.createSequentialGroup()
                    .addGroup(aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aboutTitleLabel)
                        .addComponent(aboutDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    aboutPnlLayout.setVerticalGroup(
        aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(aboutPnlLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(aboutTitleLabel)
            .addGap(18, 18, 18)
            .addComponent(aboutTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(aboutDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    mainPnl.add(aboutPnl, "card5");

    getContentPane().add(mainPnl, java.awt.BorderLayout.CENTER);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fetchData() {
        try {
            String query = "SELECT * from laes.reservations";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(query);
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void setFonts() {
        inter = fontLoader.interRegular(12);
        puritanBold = fontLoader.puritanBold(44);
        puritanBoldSmall = fontLoader.puritanBold(32);
    }

    private void setFrameIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/logo.png")));
    }

    private void setFirstPanel() {
        mainPnl.removeAll();
        mainPnl.add(reservationsPnl);
        mainPnl.repaint();
        mainPnl.revalidate();
    }

    private void customersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersBtnActionPerformed
        mainPnl.removeAll();
        mainPnl.add(customersPnl);
        mainPnl.repaint();
        mainPnl.revalidate();
    }//GEN-LAST:event_customersBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        mainPnl.removeAll();
        mainPnl.add(aboutPnl);
        mainPnl.repaint();
        mainPnl.revalidate();
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void reservationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsBtnActionPerformed
        mainPnl.removeAll();
        mainPnl.add(reservationsPnl);
        mainPnl.repaint();
        mainPnl.revalidate();
    }//GEN-LAST:event_reservationsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservationBtnActionPerformed
        NewReservation newReservation = new NewReservation();

        newReservation.setVisible(true);
    }//GEN-LAST:event_addReservationBtnActionPerformed

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        String searchValue = searchField.getText();

        if (searchValue.equals("")) {
            searchField.setText("Search reservations");
            searchField.setForeground(new Color(129, 129, 129));
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        String searchValue = searchField.getText();

        if (searchValue.equals("Search reservations")) {
            searchField.setText("");
            searchField.setForeground(new Color(35, 35, 35));
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField1FocusGained

    private void searchField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField1FocusLost

    private void searchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField1ActionPerformed

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
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("UIManager Exception : " + e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JPanel aboutDesc;
    private javax.swing.JLabel aboutDescText;
    private javax.swing.JLabel aboutHead1;
    private javax.swing.JPanel aboutPnl;
    private javax.swing.JLabel aboutPrevimg1;
    private javax.swing.JLabel aboutPrevimg2;
    private javax.swing.JPanel aboutTitle;
    private javax.swing.JLabel aboutTitleLabel;
    private javax.swing.JLabel aboutTitleLabel1;
    private javax.swing.JButton addReservationBtn;
    private javax.swing.JButton customersBtn;
    private javax.swing.JPanel customersPnl;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JPanel inventoryPnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JButton reservationsBtn;
    private javax.swing.JPanel reservationsPnl;
    private javax.swing.JTable reservationsTbl;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField1;
    private javax.swing.JPanel sidePnl;
    private javax.swing.ButtonGroup tabsBtnGroup;
    // End of variables declaration//GEN-END:variables
}
