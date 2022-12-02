package com.training.poc;

public class Header {
    private String recordType;
    private int totalLines;
    private int totalAmt;
    private int minAmt;
    private String currentDate;
    	public String getRecordType() {
            return recordType;
        }
        public int getTotalLines() {
            return totalLines;
        }
        public int getTotalAmt() {
            return totalAmt;
        }
        public int getMinAmt() {
            return minAmt;
        }
        public String getCurrentDate() {
            return currentDate;
        }
       public void setRecordType(String recordType) {
            this.recordType = recordType;
        }
        public void setTotalLines(int headerbuild) {
            this.totalLines = headerbuild;
        }
        public void setTotalAmt(int headerbuild) {
            this.totalAmt = headerbuild;
        }
        public void setMinAmt(int headerbuild) {
            this.minAmt = headerbuild;
        }
        public void setCurrentDate(String currentDate) {
            this.currentDate = currentDate;
        }
        @java.lang.Override
        public java.lang.String toString() {
            return "header{" +
                    "recordType='" + recordType + '\'' +
                    ", totalLines=" + totalLines +
                    ", totalAmt=" + totalAmt +
                    ", minAmt=" + minAmt +
                    ", currentDate='" + currentDate + '\'' +
                    '}';
        }
    }