package gui;

public class doctor_afterlogin1 {

    private String date;
    private String pphone;
    private String pname;
    private String page;
    private String pgender;
    private String pprb;
    
    public doctor_afterlogin1(String Date, String Patient_Phone, String Patient_Name, String Patient_Age, String Patient_Gender, String Problem_In_Details)          
    {
        this.date=Date;
        this.pphone=Patient_Phone;
        this.pname=Patient_Name;
        this.page=Patient_Age;
        this.pgender=Patient_Gender;
        this.pprb=Problem_In_Details;
    }
    public String getDate()
    {
        return date;
    }

    public String getPatient_Phone()
    {
        return pphone;
    }
    public String getPatient_Name()
    {
        return pname;
    }
    public String getPatient_Gender()
    {
        return pgender;
    }
        public String getPatient_Age()
    {
        return page;
    }
    public String getProblem_In_Details()
    {
        return pprb;
    }
    
    }


