package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Piper","Peter");
        employee.setSSN("333-1234");
        employee.hireEmployee("105");
        
//        employee.meetWithHrForBenefitAndSalryInfo();
//        employee.meetDepartmentStaff();
//        employee.reviewDeptPolicies();
//        employee.moveIntoCubicle("105");
        
        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
