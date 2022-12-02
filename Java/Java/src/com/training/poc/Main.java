package com.training.poc;
import java.util.*;
import java.io.*;
public class Main
 {
    public static void main(String[] args) 
    {
        String path="C:\\Users\\Venkata.Ramana1\\Poc1\\read-file-java-poc1.csv";
        String line;
        List<Header> headerPojos=new ArrayList<>();
        List<List<Line>> lineitems=new ArrayList<>();
        HashMap<String,List<Line>> hashmap=new HashMap<>();
        String header="";
        try (BufferedReader br =new BufferedReader(new FileReader(path))) 
        {
         header=br.readLine();
         String[] Hd= (header.split(";"));
         String recordTypeL=Hd[0];
         int totalLines=Integer.parseInt(Hd[1]);
         double totalAmt=Double.parseDouble(Hd[2]);
         int minAmt=Integer.parseInt(Hd[3]);
         String currentDate=Hd[4].replace(',', ' ');
        Header h=new Header(recordTypeL,totalLines,totalAmt,minAmt,currentDate);
        System.out.println(h.toString());
        headerPojos.add(h);
            while((line = br.readLine()) != null)
            {
                String ar[]=(line.split(";"));
                String recordType=ar[0];
                int lineNumber=Integer.parseInt(ar[1]);
                String refDocNum=ar[2];
                String city=ar[3];
                String amt=ar[4].replace(',', ' ');
                 double amount=Double.parseDouble(amt); 
                Line L=new Line(recordType,lineNumber,refDocNum,city,amount);
                List<Line> linespojo=new ArrayList<>();
                linespojo.add(L);
                lineitems.add(linespojo);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        for(List<Line> lp: lineitems)
        {
            for(Line po:lp)
            {
                hashmap.put(po.getRefDocNum(), lp);
            }
        }
        System.out.println("\nhashmap:"+hashmap);
    }
}