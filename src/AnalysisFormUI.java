
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prash
 */
public class AnalysisFormUI extends javax.swing.JFrame {

    /**
     * Creates new form AnalysisFormUI
     */
    Statement stmt;
    ResultSet rs;
    String query;
    public AnalysisFormUI() {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/";
    	String dbName = "MyData";
    	String driver = "com.mysql.jdbc.Driver";
    	String userName = "root"; 
    	String password = "";
        try {
            Class.forName(driver).newInstance();
            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connection Established");
             stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Connection Not Established");
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null,"Record not found! Enter valid uid/name");
        }
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
        jLabel1 = new javax.swing.JLabel();
        yearwise = new javax.swing.JButton();
        types_of_crime = new javax.swing.JButton();
        crime_loc = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(139, 129, 117));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analysis Reports");

        yearwise.setText("Year Wise Crime Report");
        yearwise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearwiseActionPerformed(evt);
            }
        });

        types_of_crime.setText("Based on types of Crimes");
        types_of_crime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                types_of_crimeActionPerformed(evt);
            }
        });

        crime_loc.setText("Based on Crime Location");
        crime_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crime_locActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearwise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(types_of_crime, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(crime_loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(yearwise)
                .addGap(27, 27, 27)
                .addComponent(types_of_crime)
                .addGap(29, 29, 29)
                .addComponent(crime_loc)
                .addGap(21, 21, 21)
                .addComponent(back)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearwiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearwiseActionPerformed
        try{
            System.out.println("In Year Wise try"); 
           int year=0;
           int first_column=0,sec_column=0,third_column=0,fourth_column=0;
           query = "select year_of_arrest from crime;";
           System.out.println(query);
           rs = stmt.executeQuery(query);
           while (rs.next()) 
                {
                    year = rs.getInt("year_of_arrest");
                          
                if(year>=1991 && year<=1995)
                {
                  first_column=first_column+1;  
                }
                if(year>=1996 && year<=2000)
                {
                  sec_column=sec_column+1;  
                }
                if(year>=2001 && year<=2005)
                {
                  third_column=third_column+1;  
                }
                if(year>=2006 && year<=2010)
                {
                  fourth_column=fourth_column+1;  
                }
                }
                 DefaultCategoryDataset bardataset = new DefaultCategoryDataset();  
                 bardataset.setValue(first_column,"Percentage" ,"1991-1995" );  
                 bardataset.setValue(sec_column,"Percentage" ,"1996-2000" );  
                 bardataset.setValue(third_column,"Percentage" ,"2001-2005" );  
                 bardataset.setValue(fourth_column,"Percentage" ,"2006-2010" );  
                 JFreeChart barchart = ChartFactory.createBarChart(  
                                    "Year Wise Crime Analysis",      //Title  
                                    "Years",             // X-axis Label  
                                    "Percentage",               // Y-axis Label  
                                    bardataset,             // Dataset  
                                    PlotOrientation.VERTICAL,      //Plot orientation  
                                    false,                // Show legend  
                                    true,                // Use tooltips  
                                    false                // Generate URLs  
                                    );  
                barchart.getTitle().setPaint(Color.BLUE);    // Set the colour of the title  
                barchart.setBackgroundPaint(Color.BLACK);    // Set the background colour of the chart  
                CategoryPlot cp = barchart.getCategoryPlot();  // Get the Plot object for a bar graph  
                cp.setBackgroundPaint(Color.BLACK);       // Set the plot background colour  
                cp.setRangeGridlinePaint(Color.RED);      // Set the colour of the plot gridlines 
                ChartFrame chartframe = new ChartFrame("Year Wise Crime Analysis",barchart);
                chartframe.setSize(500, 400);
                chartframe.setVisible(true);
                } 
                catch (Exception e)
                {
                System.out.println("Year Wise bar chart error");
                e.printStackTrace();
                }
    
    
    }//GEN-LAST:event_yearwiseActionPerformed

    private void types_of_crimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_types_of_crimeActionPerformed
        // TODO add your handling code here:
        try{
           System.out.println("In types_of_crime try"); 
           int arrested_for=0;
           int Assault=0,Robbery=0,Homicide=0,Kidnapping=0,Burglary=0,Embezzlement=0,Forgery=0,Other=0;
           query = "select arrest_for_int from crime;";
           rs = stmt.executeQuery(query);
           System.out.println(query);
                while (rs.next()) 
                {
                    arrested_for = rs.getInt("arrest_for_int");
                    switch(arrested_for)
                {
                    case 1:
                        Assault=Assault+1;
                        break;
                    case 2:
                        Robbery=Robbery+1;
                        break;
                    case 3:
                        Homicide=Homicide+1;                                
                        break;
                    case 4:
                        Kidnapping=Kidnapping+1;
                        break;
                    case 5:
                        Burglary=Burglary+1;
                        break;
                    case 6:
                        Embezzlement=Embezzlement+1;
                        break;
                    case 7:
                        Forgery=Forgery+1;
                        break;
                    case 8:
                        Other=Other+1;
                        break;
                }
                }
                DefaultPieDataset dataset=new DefaultPieDataset();
        dataset.setValue("Assault", Assault);
        dataset.setValue("Robbery", Robbery);
        dataset.setValue("Homicide", Homicide);
        dataset.setValue("Kidnapping", Kidnapping);
        dataset.setValue("Burglary", Burglary);
        dataset.setValue("Embezzlement", Embezzlement);
        dataset.setValue("Forgery", Forgery);
        dataset.setValue("Other", Other);
        JFreeChart chart = ChartFactory.createPieChart(
            "Based on types of Crimes",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );
        ChartFrame frame= new ChartFrame("Pie Chart",chart);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
       frame.setVisible(true);
       frame.setSize(500, 500);
                } 
                catch (Exception e)
                {
                System.out.println("Types of Crime chart error");
                e.printStackTrace();
                }
        
   
    }//GEN-LAST:event_types_of_crimeActionPerformed

    private void crime_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crime_locActionPerformed
        // TODO add your handling code here:
         try{
              int California=0,Florida=0,New_York=0,Washington=0,New_Mexico=0,Other=0;
           int crime_loc=0;
           query = "select crime_loc from crime;";
           rs = stmt.executeQuery(query);
           System.out.println(query);
                while (rs.next()) 
                {
                    crime_loc = rs.getInt("crime_loc");
                    switch(crime_loc)
                {
                    case 1:
                        California=California+1;
                        break;
                    case 2:
                        Florida=Florida+1;
                        break;
                    case 3:
                        New_York=New_York+1;                                
                        break;
                    case 4:
                        Washington=Washington+1;
                        break;
                    case 5:
                        New_Mexico=New_Mexico+1;
                        break;
                    case 6:
                        Other=Other+1;
                        break;
                   }
                }
               
                DefaultPieDataset dataset=new DefaultPieDataset();
        dataset.setValue("California", California);
        dataset.setValue("Florida", Florida);
        dataset.setValue("New Mexico",New_Mexico);
        dataset.setValue("New York", New_York);
        dataset.setValue("Washington", Washington);
        dataset.setValue("Other", Other);
        JFreeChart chart = ChartFactory.createPieChart(
            "Based on types of Crime Location",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );
        ChartFrame frame= new ChartFrame("Pie Chart",chart);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
       frame.setVisible(true);
       frame.setSize(500, 500);
                } 
                catch (Exception e)
                {
                System.out.println("Types of Crime chart error");
                e.printStackTrace();
                }
   

    }//GEN-LAST:event_crime_locActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PanelUI().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(AnalysisFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalysisFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalysisFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalysisFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalysisFormUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton crime_loc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton types_of_crime;
    private javax.swing.JButton yearwise;
    // End of variables declaration//GEN-END:variables
}
