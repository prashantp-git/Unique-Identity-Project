
import java.io.*;
import java.text.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The PC
 */
public class StoreData {
    
    //Function to store data to text file
    public static void store_data_to_file(ArrayList<tabbed_MainForm.files> rf_list) //list of new recent items is passed as parameter 
    {
        Boolean DBfile_Exists = true;             //variable to check if database text file exists or not
        try {
            File database_file = new File("D:\\database_file.txt");   //create file object using path to db text file             
            if (!database_file.exists()) // if file doesnt exists, then create it
            {
                database_file.createNewFile();
                DBfile_Exists = false;            //false as db file does not exist and thus we have created it 
                //System.out.println("Created new file");                  
            }
            FileWriter fileWriter = new FileWriter(database_file.getAbsolutePath(), true); //filewriter to file
            BufferedWriter bufferWritter = new BufferedWriter(fileWriter);             //bufferWritter to file
            FileReader fileReader = new FileReader(database_file.getAbsolutePath());     //fileReader to file
            BufferedReader bufferReader = new BufferedReader(fileReader);               //bufferReader to file
            if (!DBfile_Exists) //if db file is newly created do the following
            {
                for (tabbed_MainForm.files f : rf_list) //for each file in new recent file list add data
                {                                                       //to database file
                    String data = f.get_fname();       //get recent file name
                    bufferWritter.write(data);       //store it to db file
                    bufferWritter.write(";"); //add ";" after file name; used to separate f_name from access time
                    data = f.get_date_time();  //get access time
                    bufferWritter.write(data);   //store it to db file
                    bufferWritter.newLine();     //go to newline in db file
                }
                bufferWritter.close();                  //close buffers
                bufferReader.close();
            } else //if db file already exist do the following
            {
                //System.out.println("File already exits");
                String firstLine = "";                       //string variable which will store firstline from db file
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");//dateformat required to pass date in string format        
                firstLine = bufferReader.readLine();         //get firstline from db file
                bufferReader.close();                      //close buffers
                bufferWritter.close();
                String[] parts = firstLine.split(";");     //split at ";" to obtain f_name and access_time of first file in db file
                String f_name = parts[0]; //f_name of first file in db file
                String access_time = parts[1]; //access_time of first file in db file 
                //System.out.println(f_name+" -> "+access_time);
                for (tabbed_MainForm.files f : rf_list) //for each new recent item
                {
                    int compare_accessTime = dateFormat.parse(access_time)
                            .compareTo(dateFormat.parse(f.get_date_time())); //compare new recent item date with date of first file from db file
                    if (compare_accessTime < 0) //if this recent item is newer than first item from db file 
                    {
                        add_new_data_to_file(f); // add new recent item to db file                           
                    }
                }

            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(tabbed_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //function to add new recent items to database file; add new entries at the beginning of db file
    public static void add_new_data_to_file(tabbed_MainForm.files f) {
        try {
            File original_DBFile = new File("D:\\database_file.txt");           //original db file
            File DB_newFile = new File("D:\\database_file_1.txt");              //temporary db file
            if (!DB_newFile.exists()) {                                         //create temporary db file
                DB_newFile.createNewFile();
                //System.out.println("database_file_1.txt Created ");
            }
            FileWriter fw = new FileWriter(DB_newFile.getAbsolutePath());       //FileWriter to temporary file
            BufferedWriter bw = new BufferedWriter(fw);                         //BufferWriter to temporary file
            FileReader original_fr = new FileReader(original_DBFile.getAbsolutePath());//FileReader to original file
            BufferedReader original_br = new BufferedReader(original_fr);       //BufferReader to original file
            String sCurrentLine = "";                                           //String variable to read entries from original file
            String data = f.get_fname();                                        //get new entry
            bw.write(data);                                                     //store in temporary file   
            bw.write(";");                                                      //add ";" after f_name
            data = f.get_date_time();                                           //get access time
            bw.write(data);                                                     //store in temporary file
            //System.out.println("new entry stored");
            while ((sCurrentLine = original_br.readLine()) != null) //copy contents of original file to temporary file
            {
                bw.newLine();
                bw.write(sCurrentLine);
            }
            bw.close();
            fw.close();
            original_br.close();
            //System.out.println("old entry stored");
            original_fr.close();
            Boolean is_fileDeleted = original_DBFile.delete();    //delete original db file
//            System.out.println("Original File deleted : "+is_fileDeleted);
            DB_newFile.renameTo(original_DBFile);       //rename temporary file to original db file
//            System.out.println("New file renamed to original db file");
        } catch (IOException ex) {
            Logger.getLogger(tabbed_MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
