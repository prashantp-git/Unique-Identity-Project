
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author The PC
 */
public class Analysis {
    
    //function for analysis
    public static void analysis(JTable MRUtable,JTable MUtable,ArrayList<tabbed_MainForm.files> recentFilesList)
    {
        //System.out.println("analysis");  
        DefaultTableModel MRU_Table=(DefaultTableModel) MRUtable.getModel();
        //DefaultTableModel MU_Table=(DefaultTableModel) MUtable.getModel();       
        MRU_Table.setRowCount(0);                
        //MU_Table.setRowCount(0);
        int i=0;
       try{ 
           for(tabbed_MainForm.files f:recentFilesList)       //for MRU table
           {
             if(i<5)
             {
               String filename=f.get_fname();
               MRU_Table.insertRow(MRU_Table.getRowCount(),
                                new Object[]{i+1,filename});
             }
             else
             {
                 break;
             }
             i++;
           }           
       }
       catch(Exception ex)
       {
         Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);  
       } 
    }
    
}
