package practicle1;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {
    public main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JFrame();
        nme = new javax.swing.JLabel();
        icn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        btn = new javax.swing.JButton();
        amnt1 = new javax.swing.JLabel();
        login_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Buy = new javax.swing.JButton();
        login_lbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buy1 = new javax.swing.JButton();
        login_lbl2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buy2 = new javax.swing.JButton();
        login_lbl3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buy3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buy4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buy5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buy6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buy7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buy8 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buy9 = new javax.swing.JButton();
        prnt = new javax.swing.JLabel();
        lout = new javax.swing.JButton();

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new java.awt.Dimension(650, 350));

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        btn.setText("BUY");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(icn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(nme, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frameLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amnt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nme, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn))
                    .addComponent(icn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\Modem.jpg")); // NOI18N

        jLabel2.setText("Modem - 1200");

        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        login_lbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\cameras.jpg")); // NOI18N

        jLabel4.setText("Camera - 10000");

        buy1.setText("buy");
        buy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy1ActionPerformed(evt);
            }
        });

        login_lbl2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\monitor.jpg")); // NOI18N

        jLabel3.setText("Monitor - 6500");

        buy2.setText("Buy");
        buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy2ActionPerformed(evt);
            }
        });

        login_lbl3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\beats.jpg")); // NOI18N
        login_lbl3.setText("jLabel5");

        jLabel6.setText("Beats Audio - 1500");

        buy3.setText("Buy");
        buy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy3ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\Keyboard.jpg")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(127, 92));
        jLabel5.setMinimumSize(new java.awt.Dimension(127, 92));
        jLabel5.setPreferredSize(new java.awt.Dimension(127, 92));

        jLabel7.setText("Keyboard - 2000");

        buy4.setText("Buy");
        buy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy4ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\hp cpui5.jpg")); // NOI18N

        jLabel9.setText("HP cpu - 28000");

        buy5.setText("Buy");
        buy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy5ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\Sony_KDL46HX903_3D_LED_TV.jpg")); // NOI18N

        jLabel11.setText("Sony tv - 48000");

        buy6.setText("Buy");
        buy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy6ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\mouse.jpg")); // NOI18N

        jLabel13.setText("Mouse - 450");

        buy7.setText("Buy");
        buy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy7ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\Sony_LCD_01.jpg")); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setText("Sony LCD tv - 20000");

        buy8.setText("Buy");
        buy8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy8ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahira Mehta\\Documents\\NetBeansProjects\\Practicle\\ipad.jpg")); // NOI18N

        jLabel17.setText("Ipad air - 30000");

        buy9.setText("Buy");
        buy9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy9ActionPerformed(evt);
            }
        });

        lout.setText("Log Out");
        lout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(buy5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lout)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(Buy))))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(buy1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(login_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(buy6))
                                            .addComponent(jLabel11))))
                                .addGap(10, 10, 10)))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(login_lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(buy2))))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(buy3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel15)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(login_lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(buy7))
                        .addGap(74, 74, 74)
                        .addComponent(buy8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buy4)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(buy9)))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prnt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_lbl))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prnt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(login_lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buy)
                    .addComponent(buy1)
                    .addComponent(buy2)
                    .addComponent(buy3)
                    .addComponent(buy4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buy5)
                    .addComponent(buy6)
                    .addComponent(buy7)
                    .addComponent(buy8)
                    .addComponent(buy9))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/modem.jpg"));
nme.setText("Belkin Modem ");
amnt1.setText("1200");
ta.setText("Key Features of Belkin N300 ADSL2 Wireless Router with Modem\n" +
"Wireless Speed Upto 300 Mbps\n" +
"Wi-Fi Protected Setup (WPA/WPA2)\n" +
"Web-based User Interface\n" +
"WPS Push Button Setup");
    }//GEN-LAST:event_BuyActionPerformed

    private void buy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy1ActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/cameras.jpg"));
nme.setText("Camera ");
amnt1.setText("10000");
ta.setText(" They are much more easily moved and mounted anywhere. Both can provide 24-hour surveillance,\n"+
"but wireless cameras usually can provide a higher definition image.\n" +
"Wireless Speed Upto 300 Mbps\n" +
"On the surface you may find that wireless cameras are more flexible, reliable,\n"
+ "and probably easier to install that their wired counterparts.\n" +
"Web-based User Interface\n");
    }//GEN-LAST:event_buy1ActionPerformed

    private void buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy2ActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/monitor.jpg"));
nme.setText("Monitor ");
amnt1.setText("6500");
ta.setText("Back light-Light-Emitting Diode (LED) - Though commonly misconceived as an alternative to LCD,\n"
        + "LED monitors are actually a type of LCD with a unique backlight technology."
        + "It is 21.5- to 24-inch - The most common monitor sizes offering up to 1,920 x 1,080-pixel resolutions,\n"
        + "these monitors offer enhanced port options such as HDMI and DVI.");
    }//GEN-LAST:event_buy2ActionPerformed

    private void buy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy3ActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/beats.jpg"));
nme.setText("Beats Audio ");
amnt1.setText("1500");
ta.setText("Beats Electronics is a division of Apple which produces audio products. Headquartered in Culver City,\n"
+ "California, U.S.the company was co-founded by rapper and hip hop producer Dr. Dre and former Interscope Geffen A&M Records chairman Jimmy Iovine.\n" +
"\n"+"The subsidiary's product line is primarily focused on headphones and speakers. Beats \n"
+ "original product line was manufactured in partnership with the AV equipment company Monster Cable Products\n"
+ "following the end of its contract with the company, Beats took further development of its products in-house.\n"
+ " In 2014, the company expanded into the online music market with the launch of its subscription-based streaming service Beats Music service.");
    }//GEN-LAST:event_buy3ActionPerformed

    private void buy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy4ActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/keyboard.jpg"));
nme.setText("Keyboard ");
amnt1.setText("2000");
ta.setText("A well-designed keyboard can turn work into pleasure. The HP Classic Wired Keyboard lets you type in comfort,\n"
        + "with soft-touch keys that are responsive and quiet. Once you’ve touched it, you won’t ever want another.\n" +
"Compact and sleek in glossy black, the HP Classic Wired Keyboard will look great on your desk.\n"
+ "It features all the standard keys and is easy to set up. A true classic, this keyboard is a winner when it comes to simplicity and comfort.\n" +
"Don’t worry if you spill your coffee near your keyboard. Super durable, the HP Classic Wired Keyboard not only looks and feels great \n"
+ "it’s spill resistant, too. Spilt liquids drain straight out again, protecting the keyboard and your peace of mind.");
    }//GEN-LAST:event_buy4ActionPerformed

    private void buy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy5ActionPerformed
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/hp cpui5.jpg"));
nme.setText("HP cpu ");
amnt1.setText("28000");
ta.setText("The HP Pavilion p7 desktop PC has the power, speed, and fun features that make it the perfect computer for your family.\n"
        + "Your videos, games, and favourite applications will run \n"
+ "smoothly due to the power of the 3rd gen Intel Core i5 processor, 8GB of RAM, and Radeon 7450 graphics card, while the huge 2TB hard drive \n"
+ "provides plenty of storage space for all of your family's files. \n" +
"More Information\n" +
"The 3rd gen Intel Core i5 processor and 8GB of RAM provides fast, snappy performance, even for power-intensive tasks like video editing\n" +
"You'll have plenty of space for all of your photos, movies, music, games, and more on the 2TB hard drive\n" +
"The Radeon HD 7450 graphics card makes all of your games and videos look sharp and smooth\n" +
"Power button and 15-in-1 memory card reader are conveniently located on top for easy access\n" +
"Sliding door conceals the front ports, providing a clean, attractive look\n" +
"The marquee signature design features stylish lighting and chrome\n" +
"Built-in wireless 802.11 b/g/n gives you high-speed Internet access through Wi-Fi\n" +
"HP Connected Photo syncs photos across your computers, smartphone, and tablet, making it easy to enjoy and share your pictures\n" +
"HP Connected Music, powered by Meridian, lets you enjoy and discover music through a variety of ways, including saved music, Internet radio,\n"
        + "and online streaming");
    }//GEN-LAST:event_buy5ActionPerformed

    private void buy6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy6ActionPerformed
frame.setVisible(true);
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/Sony_KDL46HX903_3D_LED_TV.jpg"));
nme.setText("Sony tv ");
amnt1.setText("48000");
ta.setText("Kick your 3D experience into overdrive. The Sony Full HD 3D TV now delivers even smoother, clearer and more believable pictures.\n" +
"\n" +
"Whether you are watching Blu-ray Disc™ movies, TV shows or playing games, the 3D picture quality on the Sony Full HD 3D TV is far better than anything\n"
+ "you have seen at home before.\n"
+ "Paired with our newly,stylishly designed Sony 3D glasses, your 3D home movies viewing experience will never be the same again.");
    }//GEN-LAST:event_buy6ActionPerformed

    private void buy7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy7ActionPerformed
frame.setVisible(true);
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/mouse.jpg"));
nme.setText("Mouse ");
amnt1.setText("450");
ta.setText(" computer mouse is an input device that is most often used with a personal computer.\n"
        + "Moving a mouse along a flat surface can move the on-screen cursor to different items on the screen.\n"
        + "Items can be moved or selected by pressing the mouse buttons (called clicking).");
    }//GEN-LAST:event_buy7ActionPerformed

    private void buy8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy8ActionPerformed
frame.setVisible(true);
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/Sony_LCD_01.jpg"));
nme.setText("Sony LCD tv ");
amnt1.setText("20000");
ta.setText("Experience sharp and clear images with stunning audio quality with Sony 22P402B. It is a 55 cm BRAVIA LED TV \n"
        + "which is best known for its advanced \n"
+ "features and picture quality. This TV is full of beneficial tools to improve user’s viewing experience.\n" +
" \n" +
"The feature of Clear Resolution Enhancer provides detailed textures, natural colours and clarity of the on screen picture.\n"
+ "This technology reduces the noise to provide crystal clear images. It lifts the depth of field which turns the image \n"
        + "automatically in to a sharp and crisp output.\n" +
"The TV screen is developed to produce full HD image. Therefore, giving you a clear picture with detailed outlook. Enjoy the world of \n"
+ "entertainment in full HD from HD broadcasts, HD satellite TV, HD cable, Blu-ray Disc™ movies and more.");
    }//GEN-LAST:event_buy8ActionPerformed

    private void buy9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy9ActionPerformed
frame.setVisible(true);
frame.setVisible(true);
icn.setIcon(new ImageIcon("C:/Users/Sahira Mehta/Documents/NetBeansProjects/Practicle/ipad.jpg"));
nme.setText("Ipad air ");
amnt1.setText("30000");
ta.setText("With iPad, we’ve always had a somewhat paradoxical goal: to create a device that’s immensely powerful,\n"
        + "yet so thin and light you almost forget it’s there. A device that helps you do amazing things, without ever getting in your way.\n"
        + "iPad Air 2 is all that. ");
    }//GEN-LAST:event_buy9ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
frame.dispose();
Buy page= new Buy();
practicle1.Buy.product.setText(this.nme.getText());
practicle1.Buy.amnt.setText(this.amnt1.getText());
page.setVisible(true);

    }//GEN-LAST:event_btnActionPerformed

    private void loutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loutActionPerformed
JOptionPane.showMessageDialog(null,"Thanks for shopping");
this.dispose();
Login page= new Login();
page.setVisible(true);
    }//GEN-LAST:event_loutActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy;
    private javax.swing.JLabel amnt1;
    private javax.swing.JButton btn;
    private javax.swing.JButton buy1;
    private javax.swing.JButton buy2;
    private javax.swing.JButton buy3;
    private javax.swing.JButton buy4;
    private javax.swing.JButton buy5;
    private javax.swing.JButton buy6;
    private javax.swing.JButton buy7;
    private javax.swing.JButton buy8;
    private javax.swing.JButton buy9;
    private javax.swing.JFrame frame;
    private javax.swing.JLabel icn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JLabel login_lbl1;
    private javax.swing.JLabel login_lbl2;
    private javax.swing.JLabel login_lbl3;
    private javax.swing.JButton lout;
    private javax.swing.JLabel nme;
    public static javax.swing.JLabel prnt;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}