
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author The PC
 */
public class tabbed_MainForm extends javax.swing.JFrame {

    DefaultTableModel rf_table;                 //table to display recent files
    
    public tabbed_MainForm() {
        initComponents();
        rf_table = (DefaultTableModel) RecentFilesTable.getModel();
    }

     public static class files //class to store filenames and their time of access
    {

        private String fname;
        private String date_time;
        private int count;
        
        public files(String f, String d_t) {
            this.fname = f;
            this.date_time = d_t;
        }

        public files(String f, int c) {
            this.fname = f;
            this.count = c;
        }
        
        public String get_fname() {
            return this.fname;
        }

        public String get_date_time() {
            return this.date_time;
        }
        
        public int get_count()
        {
            return this.count;
        }
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Tabbed_Pan = new javax.swing.JTabbedPane();
        RL_Pane = new javax.swing.JPanel();
        RL_Table = new javax.swing.JScrollPane();
        RecentFilesTable = new javax.swing.JTable();
        Display = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Analysis_Pane = new javax.swing.JPanel();
        MRU_table = new javax.swing.JScrollPane();
        MRUtable = new javax.swing.JTable();
        MRU_label = new javax.swing.JLabel();
        MU_label = new javax.swing.JLabel();
        MU_table = new javax.swing.JScrollPane();
        MUtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main_Tabbed_Pan.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Main_Tabbed_Pan.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Main_Tabbed_Pan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Main_Tabbed_Pan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        RecentFilesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File", "Date Accessed", "Frequency"
            }
        ));
        RL_Table.setViewportView(RecentFilesTable);

        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RL_PaneLayout = new javax.swing.GroupLayout(RL_Pane);
        RL_Pane.setLayout(RL_PaneLayout);
        RL_PaneLayout.setHorizontalGroup(
            RL_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RL_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RL_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RL_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RL_PaneLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(328, 328, 328)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );
        RL_PaneLayout.setVerticalGroup(
            RL_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RL_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RL_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addGroup(RL_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RL_PaneLayout.createSequentialGroup()
                    .addContainerGap(418, Short.MAX_VALUE)
                    .addGroup(RL_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Exit)
                        .addComponent(Display))
                    .addGap(15, 15, 15)))
        );

        Main_Tabbed_Pan.addTab("Recent Item List", RL_Pane);

        Analysis_Pane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MRUtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "File Name"
            }
        ));
        MRUtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        MRU_table.setViewportView(MRUtable);

        MRU_label.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        MRU_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MRU_label.setText("Most Recently Used Files");

        MU_label.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        MU_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MU_label.setText("Most Used Files");

        MUtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "File Name"
            }
        ));
        MU_table.setViewportView(MUtable);

        javax.swing.GroupLayout Analysis_PaneLayout = new javax.swing.GroupLayout(Analysis_Pane);
        Analysis_Pane.setLayout(Analysis_PaneLayout);
        Analysis_PaneLayout.setHorizontalGroup(
            Analysis_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Analysis_PaneLayout.createSequentialGroup()
                .addGroup(Analysis_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Analysis_PaneLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Analysis_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MRU_table, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .addComponent(MU_table)))
                    .addGroup(Analysis_PaneLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(MRU_label, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Analysis_PaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(MU_label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        Analysis_PaneLayout.setVerticalGroup(
            Analysis_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Analysis_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MRU_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MRU_table, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(MU_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MU_table, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        Main_Tabbed_Pan.addTab("Analysis", Analysis_Pane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main_Tabbed_Pan)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main_Tabbed_Pan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        //
        int delay = 1000; // delay for 1 sec.
        int period = 5000; // repeat every sec.
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {                             //used for timer
            public void run() {
                DefaultTableModel model = (DefaultTableModel) RecentFilesTable.getModel();
                model.setRowCount(0);
                String username = System.getProperty("user.name");                      //fetches username
                File directory = new File("C:\\Users\\" + username + "\\AppData\\Roaming\\Microsoft\\Windows\\Recent");       //path to "Recent Item" directory
                    File[] fList = directory.listFiles();            //File array; contains files of above directory
                    ArrayList<files> recentfile_list = new ArrayList<files>();    //arraylist of object of class "files"
                    try {
                        for (File file : fList) {                       //for each file in file array "flist"
                            String file_name = file.getName();      //get name of file
                            file_name = file_name.replace(".lnk", ""); //remove ".lnk" from filename
                            Boolean isIt_directory = SortFiles.is_Directory(file_name);  //check given file is directory or not
                            if (!isIt_directory) //means if it is a file, do the following
                            {
                                String file_address = file.getAbsolutePath();     //address of file
                                Path path_file = Paths.get(file_address);       //getPath
                                BasicFileAttributes attr = Files.readAttributes(path_file, BasicFileAttributes.class);    //getAttributes
                                Date lastAccessTime_date = new Date(attr.lastAccessTime().toMillis());  //getLastAccessTime and convert it into Date format
                                SimpleDateFormat sfdate = new SimpleDateFormat("dd/MM/yyyy   hh:mm:ss a");  //format in which we want our date
                                String lastAccessTime = sfdate.format(lastAccessTime_date);   //convert Date into string format
                                recentfile_list.add(new files(file_name, lastAccessTime));              //add objects(files) to arraylist
                            }
                            /*else                                   //if it is a directory
                            {
                                System.out.println("Directory: "+file_name);
                            }*/
                        }
                        int a[] = new int[200], i = 0;                                
                        SortFiles.sort_files(recentfile_list); //sort objects(files) according to their dates
                        StoreData.store_data_to_file(recentfile_list);
                        a = FreqCalc.counter(recentfile_list);
                        for (files f : recentfile_list) {
                            rf_table.insertRow(rf_table.getRowCount(),
                                new Object[]{f.get_fname(), f.get_date_time(), a[i]});   //show files in table
                            i++;
                        }                        
                        FreqCalc.calc_frequency();
                        Analysis.analysis(MRUtable,MUtable,recentfile_list);
                        FreqCalc.sort_files(MUtable);

                    } catch (IOException ex) {
                        Logger.getLogger(tabbed_MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }, delay, period);
    }//GEN-LAST:event_DisplayActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(tabbed_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabbed_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabbed_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabbed_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabbed_MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Analysis_Pane;
    private javax.swing.JButton Display;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel MRU_label;
    private javax.swing.JScrollPane MRU_table;
    public javax.swing.JTable MRUtable;
    private javax.swing.JLabel MU_label;
    private javax.swing.JScrollPane MU_table;
    public javax.swing.JTable MUtable;
    private javax.swing.JTabbedPane Main_Tabbed_Pan;
    private javax.swing.JPanel RL_Pane;
    private javax.swing.JScrollPane RL_Table;
    private javax.swing.JTable RecentFilesTable;
    // End of variables declaration//GEN-END:variables
}
