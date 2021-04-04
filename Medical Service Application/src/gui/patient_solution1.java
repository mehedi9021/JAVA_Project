package gui;

public class patient_solution1 {

    private String date;
    private String pname;
    private String psolution;
    
    public patient_solution1(String Date, String Patient_Name, String Patient_Solution)
            
    {
        this.date=Date;
        this.pname=Patient_Name;
        this.psolution=Patient_Solution;
    }
    public String getDate()
    {
        return date;
    }
    public String getPatient_Name()
    {
        return pname;
    }
    public String getPatient_Solution()
    {
        return psolution;
    }
    
}


