
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author The PC
 */
public class FreqCalc {

        
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
    
    
    static ArrayList<files> fnames_with_count= new ArrayList<files>();
    //static tabbed_MainForm.files obj=new tabbed_MainForm.files(null, null);
    
    //this function calculates frequencies of files that stored in database logsS
    public static void calc_frequency() 
    {
        File database_file = new File("D:\\database_file.txt");
        File frequency_file = new File("D:\\frequency_file.txt");
        try 
        {

            if (frequency_file.exists()) 
            {
                frequency_file.delete();
                frequency_file.createNewFile();
            } 
            
            else //if file doesnt exists, then create it
            {                                                 //false as db file does not exist and thus we have created it                 
                frequency_file.createNewFile();
            }
            
            FileReader dbFile_fileReader = new FileReader(database_file.getAbsolutePath());
            BufferedReader dbFile_bufferReader = new BufferedReader(dbFile_fileReader);
            FileWriter freq_fileWriter = new FileWriter(frequency_file.getAbsolutePath(), true);   //filewriter to file
            BufferedWriter freq_bufferWritter = new BufferedWriter(freq_fileWriter);                    //bufferWritter to file
            ArrayList<String> visited_fileItems = new ArrayList<String>();            
            while (dbFile_bufferReader.ready()) 
            {
                Boolean file_Already_visited = false;
                String currentFile_to_calcFreq = dbFile_bufferReader.readLine();
                String[] line_into_parts = currentFile_to_calcFreq.split(";");
                String curFile_Name_to_calcFreq = line_into_parts[0];
                //System.out.println("curFile_Name_to_calcFreq : "+curFile_Name_to_calcFreq);
                int sizeOf_visitedFiles_list = visited_fileItems.size();
                if (sizeOf_visitedFiles_list == 0) 
                {
                    //Do nothing ArrayList is empty
                    //Current file item will be first element to be added to visited ArrayList                    
                } 
                
                else 
                {                                       
                    for (int i = 0; i < sizeOf_visitedFiles_list; i++) 
                    {
                        String fileItem_in_visitedArrayList = visited_fileItems.get(i);                        
                        //System.out.println("Comparing -> "+curFile_Name_to_calcFreq+" : "+fileItem_in_visitedArrayList);
                        Boolean check=curFile_Name_to_calcFreq.equals(fileItem_in_visitedArrayList);
                        if (check)
                        {
                            file_Already_visited = true;
                            break;
                        }
                    }
                }

                if (file_Already_visited == true) 
                {
                    //Do nothing as frequency of this file is already calculated                   
                } 
                
                else 
                {
                    int currentFile_frequency = 0;
                    FileReader fileReader = new FileReader(database_file.getAbsolutePath());
                    BufferedReader br_toIterate_dbFile = new BufferedReader(fileReader);
                    while (br_toIterate_dbFile.ready()) 
                    {
                        String dbFile_currentItem = br_toIterate_dbFile.readLine();
                        String[] into_parts = dbFile_currentItem.split(";");
                        String item_from_dbFile = into_parts[0];
                        if (curFile_Name_to_calcFreq.equals(item_from_dbFile)) 
                        {
                            currentFile_frequency++;
                        }
                    }
                    br_toIterate_dbFile.close();
                    freq_bufferWritter.write(curFile_Name_to_calcFreq + ":" + currentFile_frequency);                    
                    freq_bufferWritter.newLine();
                    //System.out.println(curFile_Name_to_calcFreq + ":" + currentFile_frequency);
                    files object=new files(curFile_Name_to_calcFreq, currentFile_frequency);
                    fnames_with_count.add(object);
                }
                
                if(!file_Already_visited)
                {
                    visited_fileItems.add(curFile_Name_to_calcFreq);
                }
            }
            dbFile_bufferReader.close();
            freq_bufferWritter.close();
            //System.out.println("\n########################################\n");
        } catch (Exception e) {
            System.err.println("Exection madhe ala");
            e.addSuppressed(e);
        }
    }
    
    
    //this function calculates frequencies of files that are recent....
    public static int[] counter(ArrayList<tabbed_MainForm.files> rf_list) {
        int a[] = new int[200], i = 0;
        Boolean DBfile_Exists = true;
        try {
            File database_file1 = new File("D:\\database_file.txt");
            if (!database_file1.exists()) //if file doesnt exists, then create it
            {
                DBfile_Exists = false;                                          //false as db file does not exist and thus we have created it                 
            }
            if (DBfile_Exists == true) //count only if dbfile exists
            {
                FileWriter fileWriter = new FileWriter(database_file1.getAbsolutePath(), true);   //filewriter to file
                BufferedWriter bufferWritter = new BufferedWriter(fileWriter);                    //bufferWritter to file

                for (tabbed_MainForm.files f : rf_list) {                                                         //repeat for each file in Recent folder
                    FileReader fileReader = new FileReader(database_file1.getAbsolutePath());     //fileReader to file
                    String f_name;                                                                //String which will contain filename from "Recent" folder
                    int counter;                                                                  //counter integer
                    try (BufferedReader bufferReader = new BufferedReader(fileReader)) {
                        f_name = f.get_fname();
                        counter = 0;
                        String line = "";                                                         //String containing filenames from db file
                        while ((bufferReader.ready())) {
                            line = bufferReader.readLine();
                            String[] part = line.split(";");
                            String lf_name = part[0];                                            //getting filename from db file
                            if (f_name == null ? lf_name == null : f_name.equals(lf_name)) {     //comparing
                                counter++;
                            }
                        }
                    }
                    a[i] = counter;
                    i++;
//                    System.out.println(f_name + " : " + counter);
                }
                fileWriter.close();
                bufferWritter.close();
            } else //if dbfile is absent
            {
                for (i = 0; i < 200; i++) //since it is first time, initialize array to 0
                {
                    a[i] = 0;
                }
            }

        } catch (Exception e) {
            System.err.println("Exection madhe ala");
            e.addSuppressed(e);
        }
//        System.out.println(a);
        return a;
    }
    
    //Function to sort list of files according to their accessed date/time in descending order
    public static void sort_files(JTable MUtable) {
        Collections.sort(fnames_with_count, new Comparator<files>() {        //sort in ascending order
            @Override
            public int compare(files o1, files o2) {
                try {                    
                    return o2.get_count()-o1.get_count();
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        //Collections.reverse(file);          //reverse list (descending order)
        int i=0;
        DefaultTableModel MU_Table=(DefaultTableModel) MUtable.getModel();                     
        MU_Table.setRowCount(0);
        for (files f : fnames_with_count)
    {
       if(i<5)
             {
               String fname=f.get_fname();              
               MU_Table.insertRow(MU_Table.getRowCount(),
                                new Object[]{i+1,fname});
             }
             else
             {
                 break;
             }
        
             i++;
       
    }
     //System.out.println(i);
     fnames_with_count.clear();
    }
    

}
