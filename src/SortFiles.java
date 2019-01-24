
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 *
 * @author The PC
 */
public class SortFiles {
    
    static String[] file_extension = new String[]{".exe", ".3gp", ".flv", ".avi", ".mkv", ".jpg",
            ".mp4", ".txt", ".torrent", ".mp3", ".apk", ".java", ".docx",
            ".pdf", ".vcf", ".ttf", ".png", ".ini", ".psd", ".wmv", ".mpg"};   //file_extensions
    
    
     //Function to sort list of files according to their accessed date/time in descending order
    public static void sort_files(ArrayList<tabbed_MainForm.files> file) {
        Collections.sort(file, new Comparator<tabbed_MainForm.files>() {        //sort in ascending order
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

            @Override
            public int compare(tabbed_MainForm.files o1, tabbed_MainForm.files o2) {
                try {
                    return f.parse(o1.get_date_time()).compareTo(f.parse(o2.get_date_time()));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        Collections.reverse(file);          //reverse list (descending order)
    }

    //Function to check whether file is directory or not
    public static Boolean is_Directory(String f_name) {
        Boolean isIt_directory = true;            //lets say first that our file is a directory 
        for (String file_ext : file_extension) //for every extension in our extension array "file_extension"
        {
            if (f_name.endsWith(file_ext)) //check if file_name ends with an extension
            {
                isIt_directory = false;           //it is a file; therefore isIt_directory=false
                break;                          //break the loop
            }
        }
        return isIt_directory;
    }
    
}
