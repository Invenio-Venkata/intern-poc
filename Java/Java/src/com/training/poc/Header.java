package com.training.poc;
import java.sql.Date;
import javax.xml.crypto.Data;
public class Header 
{
    private String recordType;
    private int totalLines;
    private double totalAmt;
    private int minAmt;
    private String currentDate;
   
    @Override
    public String toString() {
        return "HeadePojo [recordType=" + recordType + ", totalLines=" + totalLines + ", totalAmt=" + totalAmt
                + ", minAmt=" + minAmt + ", currentDate=" + currentDate + "]";
    }
   
    public Header(String recordType, int totalLines, double totalAmt, int minAmt, String currentDate) {
        this.recordType = recordType;
        this.totalLines = totalLines;
        this.totalAmt = totalAmt;
        this.minAmt = minAmt;
        this.currentDate = currentDate;
    }
 
    public String getRecordType() {
        return recordType;
    }
  
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
  
    public int getTotalLines() {
        return totalLines;
    }
   
    public void setTotalLines(int totalLines) {
        this.totalLines = totalLines;
    }
    
    public double getTotalAmt() {
        return totalAmt;
    }
    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }
   
    public int getMinAmt() {
        return minAmt;
    }
  
    public void setMinAmt(int minAmt) {
        this.minAmt = minAmt;
    }
   
    public String getCurrentDate() {
        return currentDate;
    }
   
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}