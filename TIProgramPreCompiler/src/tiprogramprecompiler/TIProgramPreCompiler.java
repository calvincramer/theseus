package tiprogramprecompiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TIProgramPreCompiler {

    public TIProgramPreCompiler() {
        JFileChooser chooser = new JFileChooser("C:\\Users\\Calvin Cramer\\Documents\\TiPrograms\\Folder Selection");
        FileFilter filter = new FileNameExtensionFilter("text files", "txt");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choose A Program To Compress!");
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setMultiSelectionEnabled(false);

        int num = chooser.showDialog(null, "OK");
        if(num == chooser.APPROVE_OPTION) 
            f = chooser.getSelectedFile();
        else
            System.exit(0);
        
        
        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                if(lineIsOk(line)) System.out.println(line);
                line = br.readLine();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    private boolean lineIsOk(String s) {
        if (s.length() == 0) return false;
        if (s.startsWith("\"")) return false;
        if (s.startsWith(System.getProperty("line.separator"))) return false;
        return true;
    }

    public static void main(String[] args) {
        new TIProgramPreCompiler();
    }
    

    private File f;
}
