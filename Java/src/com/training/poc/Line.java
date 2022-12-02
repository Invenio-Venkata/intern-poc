package com.training.poc;

public class Line {

		// TODO Auto-generated method stub
		private String recordType;
	    private int lineNumber;
	    private String refDocNum;
	    private String city;
	    private int amount;  
	    public void setRecordType(String recordType) {
	        this.recordType = recordType;
	    }
	    public void setLineNumber(int lineNumber) {
	        this.lineNumber = lineNumber;
	    }
	    public void setRefDocNum(String refDocNum) {
	        this.refDocNum = refDocNum;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public void setAmount(int amount) {
	        this.amount = amount;
	    }
	    
	    public String getRecordType() {
	        return recordType;
	    }
	    public int getLineNumber() {
	        return lineNumber;
	    }
	    public String getRefDocNum() {
	        return refDocNum;
	    }
	    public String getCity() {
	        return city;
	    }
	    public int getAmount() {
	        return amount;
	    }
	    
	    @java.lang.Override
	    public java.lang.String toString() {
	        return "line{" +
	                "recordType='" + recordType + '\'' +
	                ", lineNumber=" + lineNumber +
	                ", refDocNum='" + refDocNum + '\'' +
	                ", city='" + city + '\'' +
	                ", amount=" + amount +
	             '}';
	}

}
