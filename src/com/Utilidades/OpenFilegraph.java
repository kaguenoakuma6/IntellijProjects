package com.Utilidades;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileFilter;

public class OpenFilegraph
{
    public static void main(String[] args)
    {
        JFileChooser fChoose = new JFileChooser();
        fChoose.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter xsdFilter = new FileNameExtensionFilter("XSD File", "xsd");
        fChoose.addChoosableFileFilter(xsdFilter);
        int aprove = fChoose.showOpenDialog(null);

        if( aprove == JFileChooser.APPROVE_OPTION)
        {
            File file = fChoose.getSelectedFile();
            String absPpath = file.getAbsolutePath();
            String fName = file.getName();
            String directory = absPpath.substring(0,absPpath.indexOf(fName));
            String parent = file.getParent()+"/";
            System.out.println("AbsulutePath: " + absPpath + "\nFileName: " + fName + "\nNewPath: " + directory + "\nParent: " +parent );
        }
    }
}
