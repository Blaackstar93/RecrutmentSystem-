
/**
 * Write a description of class StaffHire here.
 *
 * @author (Alpha Djalo, Student 23028095.)
 * @Assigment for 07.05.2025
 */
// Staff hire is the Parent class of Full-time Staff and Part-Time staff
public class StaffHire
{
    // instance variables - replace the example below with your own
    private int VacancyNumber; // This integer can't be negative. Has to be a positive number
    private String Designation; // Means the position. (Management,FOH, BOH)
    private String Jobtype; // If the Job has an expiration date or fixed contract
    private String StaffName;
    private String JoiningDate; // Has to be a date
    private String Qualification; // What course or diploma the candidate has
    private String AppointedBy; // It can be head office , HR manager , General manager
    private boolean Joined; // Only choises are True or false

    public StaffHire ( 
    int newVacancyNumber,String newDesignation,String newJobtype,String newStaffName,String newJoiningDate,
    String newQualification,String newAppointedBy,boolean newJoined
    )
    {
        // Redefinition of Values 
        VacancyNumber = newVacancyNumber;
        Designation = newDesignation;
        Jobtype = newJobtype;
        StaffName = newStaffName;
        JoiningDate = newJoiningDate;
        Qualification = newQualification;
        AppointedBy = newAppointedBy;
        Joined = newJoined;
    }
    // The Vacancy cant be a negative number. So I've used the IF statement.
    //Getter 
    public void setVacancyNumber(int newVacancyNumber) {
        if (VacancyNumber > 0) {
            VacancyNumber = newVacancyNumber;
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }
    }

    public int getVacancyNumber() {
        return VacancyNumber;
    }

    public void setDesignation(String newDesignation) {
        Designation = newDesignation;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setJobtype(String newJobtype) {
        Jobtype = newJobtype;
    }

    public String getJobtype() {
        return Jobtype;
    }

    public void setStaffName(String newStaffName) {
        StaffName = newStaffName;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setJoiningDate(String newJoiningDate) {
        JoiningDate = newJoiningDate;
    }

    public String getJoiningDate() {
        return JoiningDate;
    }

    public void setQualification(String newQualification) {
        Qualification = newQualification;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setAppointedBy(String newAppointedBy) {
        AppointedBy = newAppointedBy;
    }

    public String getAppointedBy() {
        return AppointedBy;
    }

    public void updateJoinedStatus(boolean newJoined) {
        Joined = newJoined;
    }

    public boolean getJoined() {
        return Joined;
    }

    // The method below will show all the details of the candidate if candidate is added.
    public void display() {
        System.out.println("Vacancy number: " + VacancyNumber);
        System.out.println("Job designation: " + Designation);
        System.out.println("Job type: " + Jobtype);
        System.out.println("Staff Name: " + StaffName);
        System.out.println("Joining Date: " + JoiningDate);
        System.out.println("Qualifications: " + Qualification);
        System.out.println("Appointed by: " + AppointedBy);
        System.out.println("Joined: " + Joined);
    }
}
