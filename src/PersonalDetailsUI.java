

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PersonalDetailsUI extends javax.swing.JFrame {
private static int uid;
public PersonalDetailsUI() {
        initComponents();
        age_label.setOpaque(true);
      /*String url = "jdbc:mysql://localhost:3306/";
    	String dbName = "MyData";
    	String driver = "com.mysql.jdbc.Driver";
    	String userName = "root"; 
    	String password = "";
        Statement stmt;
        ResultSet rs;
        try {
        Class.forName(driver).newInstance();
        Connection con = DriverManager.getConnection(url+dbName,userName,password);
        System.out.println("Connection Established");
        con.close();
        }
        catch(Exception e)
        {
          String s=e.getMessage();
          System.out.println("Nahi Jhala.....init madhe");  
        }
    }*/
    } 
    public PersonalDetailsUI(int uid1)
    {
        initComponents();
        uid=uid1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        address = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        nationality1 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Month_ComboBox = new javax.swing.JComboBox();
        Year_ComboBox = new javax.swing.JComboBox();
        Date_ComboBox = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        age_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 216, 49));

        jLabel1.setText("PERSONAL INFORMATION");

        jButton1.setText("Next>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(15, 3, 3));
        jLabel19.setText("Address:");

        addr.setColumns(20);
        addr.setRows(5);
        address.setViewportView(addr);

        jLabel20.setForeground(new java.awt.Color(21, 17, 17));
        jLabel20.setText("Email:");

        jLabel21.setForeground(new java.awt.Color(11, 11, 11));
        jLabel21.setText("Phone:");

        jLabel12.setForeground(new java.awt.Color(8, 6, 6));
        jLabel12.setText("Name:");

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(9, 9, 9));
        jLabel2.setText("Religion:");

        jLabel13.setForeground(new java.awt.Color(175, 83, 83));
        jLabel13.setText("First name");

        jLabel14.setForeground(new java.awt.Color(175, 83, 83));
        jLabel14.setText("Middle name");

        jLabel15.setForeground(new java.awt.Color(175, 83, 83));
        jLabel15.setText("Last name");

        jLabel16.setForeground(new java.awt.Color(17, 9, 9));
        jLabel16.setText("DOB:");

        jLabel17.setForeground(new java.awt.Color(9, 4, 4));
        jLabel17.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Transgender", " " }));

        jLabel18.setForeground(new java.awt.Color(10, 3, 3));
        jLabel18.setText("Nationality:");

        jLabel22.setForeground(new java.awt.Color(22, 8, 8));
        jLabel22.setText("Driving Lic:");

        jComboBox2.setMaximumRowCount(4);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hindu", "Muslim", "Sikh", "Christian" }));

        nationality1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indian", "Migrant", "NRI", " " }));

        jLabel23.setForeground(new java.awt.Color(8, 6, 6));
        jLabel23.setText("UID:");

        jLabel24.setForeground(new java.awt.Color(8, 6, 6));
        jLabel24.setText("Age:");

        Month_ComboBox.setMaximumRowCount(12);
        Month_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        Month_ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Month_ComboBoxItemStateChanged(evt);
            }
        });

        Year_ComboBox.setMaximumRowCount(14);
        Year_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));
        Year_ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Year_ComboBoxItemStateChanged(evt);
            }
        });
        Year_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Year_ComboBoxActionPerformed(evt);
            }
        });

        Date_ComboBox.setMaximumRowCount(30);
        Date_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        Date_ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Date_ComboBoxItemStateChanged(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        age_label.setBackground(new java.awt.Color(254, 254, 254));
        age_label.setText("Auto Generated");
        age_label.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Month_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Year_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nationality1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14)))
                                        .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(age_label))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Year_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(Date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Month_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationality1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void previous(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous
        fname.setText("");
        mname.setText("");
        lname.setText("");
        fname1.setText("");
        age_label.setOpaque(true);
        age_label.setText("Auto Generated");
        addr.setText("");
        email.setText("");
        phone.setText("");
        mob.setText("");

    }//GEN-LAST:event_previous
   
    private int calculate_age(int dt,int mon,int y)
    {
        int date_DOB=dt;
        int month_DOB=mon;
        int year_DOB=y;
        int years = 0;
        int age=0;
        int cur_date = Calendar.getInstance().get(Calendar.DATE);
        int cur_month = Calendar.getInstance().get(Calendar.MONTH);
        cur_month=cur_month+1;
        int cur_year = Calendar.getInstance().get(Calendar.YEAR);
       // System.out.println(cur_date+"/"+cur_month+"/"+cur_year);
        if (cur_year>year_DOB)
        {
            years=cur_year-year_DOB;
            if (cur_month<month_DOB)
            {
                years=years-1;
            }
            else if(cur_month==month_DOB)
            { 
                if(cur_date>=date_DOB)
                {
                    years=years;
                }
                else
                {
                   years=years-1; 
                }
            }            
        }
        age=years;
        System.out.println(age);
        return age;
    }
            
    private void next(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "MyData";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName(driver).newInstance();
            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connection established");
            uid=Integer.parseInt(fname1.getText());
            String firstname= fname.getText();
            String midname= mname.getText();
            String lastname=lname.getText();
            //int age=Integer.parseInt(fname2.getText());
            int date_DOB=Integer.parseInt(Date_ComboBox.getSelectedItem().toString());
            int month_DOB=Month_ComboBox.getSelectedIndex();
            month_DOB=month_DOB+1;
            int year_DOB=Integer.parseInt(Year_ComboBox.getSelectedItem().toString());
            String dob=year_DOB+"-"+month_DOB+"-"+date_DOB;
            int age=calculate_age(date_DOB,month_DOB,year_DOB);
            String religion=(String)jComboBox2.getSelectedItem();
            String gen=(String)gender.getSelectedItem();
            String nation=(String)nationality1.getSelectedItem();
            String address1=(String)addr.getText();
            String mail=email.getText();
            long phoneno= Long.parseLong(mob.getText());
            long drivinglic=Long.parseLong(phone.getText());

            String insert="Insert into personal values("+uid+",'"+firstname+"','"+midname+"','"+lastname+"',"+age+",'"+dob+"','"+religion+"','"+gen+"','"+nation+"','"+address1+"','"+mail+"',"+phoneno+","+drivinglic+");";
            System.out.println(insert);
            stmt=con.createStatement();

            int rowsAffected=stmt.executeUpdate(insert);
            System.out.println(rowsAffected);
            if(rowsAffected>0)
            {
                JOptionPane.showMessageDialog(null, "Data Entry Successful!");
                this.setVisible(false);
                new OccupationDetailsUI(uid).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data Entry Failed!");
                System.out.println("Nahi Jhala....else part madhe");

            }

        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NumberFormatException | SQLException e) {
            String s=e.getMessage();
            JOptionPane.showMessageDialog(null,"Data Entry Failed! Try Again");
            age_label.setOpaque(true);
            fname.setText("");
            mname.setText("");
            lname.setText("");
            fname1.setText("");
            age_label.setText("Auto Generated");
            addr.setText("");
            email.setText("");
            phone.setText("");
            mob.setText("");
        }
    }//GEN-LAST:event_next

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PanelUI().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Year_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Year_ComboBoxActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_Year_ComboBoxActionPerformed

    private void Year_ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Year_ComboBoxItemStateChanged
        // TODO add your handling code here:
        //System.out.println("Bcoz of item state changed");
        int date_DOB=Integer.parseInt(Date_ComboBox.getSelectedItem().toString());
        int month_DOB=Month_ComboBox.getSelectedIndex();
        month_DOB=month_DOB+1;
        int year_DOB=Integer.parseInt(Year_ComboBox.getSelectedItem().toString());
        int age=calculate_age(date_DOB,month_DOB,year_DOB);
        age_label.setText(String.valueOf(age));
    }//GEN-LAST:event_Year_ComboBoxItemStateChanged

    private void Date_ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Date_ComboBoxItemStateChanged
        // TODO add your handling code here:
        int date_DOB=Integer.parseInt(Date_ComboBox.getSelectedItem().toString());
        int month_DOB=Month_ComboBox.getSelectedIndex();
        month_DOB=month_DOB+1;
        int year_DOB=Integer.parseInt(Year_ComboBox.getSelectedItem().toString());
        int age=calculate_age(date_DOB,month_DOB,year_DOB);
        age_label.setText(String.valueOf(age));
    }//GEN-LAST:event_Date_ComboBoxItemStateChanged

    private void Month_ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Month_ComboBoxItemStateChanged
        // TODO add your handling code here:
        int date_DOB=Integer.parseInt(Date_ComboBox.getSelectedItem().toString());
        int month_DOB=Month_ComboBox.getSelectedIndex();
        month_DOB=month_DOB+1;
        int year_DOB=Integer.parseInt(Year_ComboBox.getSelectedItem().toString());
        int age=calculate_age(date_DOB,month_DOB,year_DOB);
        age_label.setText(String.valueOf(age));
    }//GEN-LAST:event_Month_ComboBoxItemStateChanged
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo PersonalDetailsUI : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(PersonalDetailsUI.getName())) {
                    javax.swing.UIManager.setLookAndFeel(PersonalDetailsUI.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalDetailsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Date_ComboBox;
    private javax.swing.JComboBox Month_ComboBox;
    private javax.swing.JComboBox Year_ComboBox;
    private javax.swing.JTextArea addr;
    private javax.swing.JScrollPane address;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mob;
    private javax.swing.JComboBox nationality1;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
