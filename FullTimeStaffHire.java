
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (Alpha Djalo . Student 23028095)
 * @Assigment for 07.05.2025
 */
public class FullTimeStaffHire extends StaffHire
{
    // Input the value that only applies to a Full-Time candidate.
    private double Salary;
    private int WeeklyFractionalHours;

    /**
     * Constructor for objects of class FullTimeStaffHire
     */
    public FullTimeStaffHire (
    int newVacancyNumber,String newDesignation,String newJobtype,String newStaffName,String newJoiningDate,
    String newQualification,String newAppointedBy,boolean newJoined,double newSalary,int newWeeklyFractionalHours)
    {
        // This calls the constructor from the superclass StaffHire.
        super(newVacancyNumber, newDesignation, newJobtype, newStaffName, newJoiningDate, newQualification, newAppointedBy, newJoined);
        // We now need to add the new informations for a fulltime candidate.
        Salary = newSalary;
        WeeklyFractionalHours = newWeeklyFractionalHours;
    }

    public void setSalary(double newSalary) {
        // First , the candidate has to be registered through the parent class StaffHire.
        if (this.getJoined()) {
            if (Salary >=0){
                Salary = newSalary;
            }
            else {
                System.out.println("Error: The salary can't be a negative integer. Please try again");
            }
        }
        else {
            System.out.println("Candidate hasn't been registered. Please make sure Candidate has joined.");
        }
    }

    public double getSalary(){
        return Salary;
    }

    public void setWeeklyFractionalHours(int newWeeklyFractionalHours){
        if (WeeklyFractionalHours < 1 || WeeklyFractionalHours > 168) {
            System.out.println("Hours can't be less than 1 or more than 168");
        }
        else {
            WeeklyFractionalHours = newWeeklyFractionalHours;
        }
    }

    public int setWeeklyFractionalHours()
    {
        return WeeklyFractionalHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary per Annum: " + Salary);
        System.out.println("Weekly Hours: " + WeeklyFractionalHours);
    }
}

