package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area,
                            String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();

        sb.append("Location: ").append(getLocation());
        sb.append("\nExpiration Date: ").append(getFormattedDate(getExpirationDate()));

        return sb.toString();
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate (Date date) {
        SimpleDateFormat exp_format = new SimpleDateFormat("dd-MM-yyyy");

        return exp_format.format(date);
    }
}
