
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Alpha Djalo, Student 23028095.)
 * @Assigment for 07.05.2025
 */
public class PartTimeStaffHire extends StaffHire
{
    // instance variables - Values that only applies to a Part-Time candidate.
    private int WorkingHour; // How many hours a day the staff will be doing
    private double WagesPerHour; // How much per hour will the candidate will earn
    private String Shifts; // (Morning,Afternoon or Evening shift)
    private boolean Terminated;

    public PartTimeStaffHire(int newVacancyNumber,String newDesignation,String newJobtype,String newStaffName,String newJoiningDate,
    String newQualification,String newAppointedBy,boolean newJoined,int WorkingHour,double WagesPerHour,String Shifts,boolean Terminated)
    {
        // initialise instance variables
        super(newVacancyNumber, newDesignation, newJobtype, newStaffName, newJoiningDate, newQualification, newAppointedBy, newJoined);
        this.WorkingHour = WorkingHour;
        this.WagesPerHour = WagesPerHour;
        this.Shifts = Shifts;
        this.Terminated = false;
    }

    public void setWorkingHour(int WorkingHour){
        if (WorkingHour > 0 && WorkingHour <= 24){
            this.WorkingHour = WorkingHour;
        }
        else {
            System.out.println("Working hours can't be less than 0 or more than 24 hours. Please try again.");
        }
    }

    public int getWorkingHour(){
        return WorkingHour;
    }

    public void setWagesPerHour(double WagesPerHour){
        if (WagesPerHour >= 6.50) {
            this.WagesPerHour = WagesPerHour;
        }   else {
            System.out.println("The candidate's wage can't be less than £6.5. Please try again."); // £6.50 was the minimum wage whenever I moved to London in 2014.
        }
    }

    public double getWagesPerHour()
    {
        return WagesPerHour;
    }

    public void setShifts(String Shifts){
        if (Shifts.equals("Opening Shift") || Shifts.equals("Afternoon Shift") || Shifts.equals("Closing Shift")){
            this.Shifts = Shifts;
        } // // Link that allowed me to write the code like this : https://www.w3schools.com/java/ref_string_equals.asp
        else {
            System.out.println("Only 3 Shifts are available: Opening Shift,Afternoon Shift or Closing Shift.");
        }
    }

    public String getShifts() {
        return Shifts;
    }

     public void Terminated() {
        if (Terminated == true) { 
            System.out.println("Candidate had already been Terminated.");
        } else {
            super.setStaffName("");
            super.setJoiningDate("");
            super.setQualification("");
            super.setAppointedBy("");
            super.getJoined();
            this.Terminated = true;
            System.out.println("Candidate has been successfully terminated.");
        }
    }
    
    @Override
    public void display() {
        super.display();  //
        System.out.println("Hours per day:  " + WorkingHour);
        System.out.println("Hourly wage: " + WagesPerHour);
        System.out.println("Shift: " + Shifts);
        System.out.println("Status: " + (Terminated ? "Terminated" : "Active"));
        System.out.println("Daily Wage: " + (WorkingHour * WagesPerHour));
    }
}