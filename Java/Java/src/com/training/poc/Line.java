package com.training.poc;
public class Line 
{
    private String recordType;
    private int lineNumber;
    private String refDocNum;
    private String city;
    private double amount;
    /**
     * @param recordType
     * @param lineNumber
     * @param refDocNum
     * @param city
     * @param amount
     */
    public Line(String recordType, int lineNumber, String refDocNum, String city, double amount) {
        this.recordType = recordType;
        this.lineNumber = lineNumber;
        this.refDocNum = refDocNum;
        this.city = city;
        this.amount = amount;
    }
    /**
     * @return the recordType
     */
    public String getRecordType() {
        return recordType;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LinesPojo [recordType=" + recordType + ", lineNumber=" + lineNumber + ", refDocNum=" + refDocNum
                + ", city=" + city + ", amount=" + amount + "]";
    }
    /**
     * @param recordType the recordType to set
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
    /**
     * @return the lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }
    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    /**
     * @return the refDocNum
     */
    public String getRefDocNum() {
        return refDocNum;
    }
    /**
     * @param refDocNum the refDocNum to set
     */
    public void setRefDocNum(String refDocNum) {
        this.refDocNum = refDocNum;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public class getRefDocNum {
    }
}