package com.training.poc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final String COMMA_DELIMITER = ",";
    public static void main(String args[])
    {
        
        File path = new File("C:\\Users\\Venkata.Ramana1\\Poc1\\read-file-java-poc1.csv");
           BufferedReader buf = null;
           try
           {
               buf = new BufferedReader(new FileReader(path));
               List<Line> csvfile = new ArrayList<Line>();
               String line = "";
               buf.readLine();
               while ((line = buf.readLine()) != null)
               {
                   String[] header=line.split(COMMA_DELIMITER);
                        if(header[0].equalsIgnoreCase("HAUDIT"))
                        {
                        
                        String head = HeaderPath.buildH(header);
                        
                        }
                        else {
                            
                          LinePath.buildL(header);
                            
                                }
                 }
}
           catch{
        	   }
           }
    }
