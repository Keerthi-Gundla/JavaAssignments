package com.java.assignments.javaAssignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class KYC{
    private Date signUpDate;
    private Date currentDate;
    private Date startDate;
    private Date endDate;
    private SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
    public KYC(String signup,String current) throws ParseException {
        signUpDate=formatter.parse(signup);
        currentDate=formatter.parse(current);
    }

    public void getRangesOfDates(){
        if(signUpDate.after(currentDate)){
            System.out.println("No Range");
        }else if(signUpDate.getYear()==currentDate.getYear()) {
            System.out.println("No Range");
        }else{
            int currentYear=currentDate.getYear()+1900;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(signUpDate);
            calendar.set(Calendar.YEAR,currentYear);
            calendar.add(Calendar.DATE,-30);
            startDate=calendar.getTime();
            calendar.add(Calendar.DATE,+60);
            endDate=calendar.getTime();
            if(endDate.after(currentDate)){
                endDate=currentDate;
            }

            System.out.println(formatter.format(startDate)+" "+formatter.format(endDate));
        }
    }
}
