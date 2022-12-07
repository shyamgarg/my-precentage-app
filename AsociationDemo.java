import java.util.Scanner;
class SmartCard
{
    int emp_idn;

    public void MarkAttendence(Employee  e){
        emp_idn =e.getEmpId();
        System.out.println("Employee " +  emp_idn  + " is present");
    }
    public int getEmp_idn(Employee e){
        return e.empid;
    }
}
class Employee{
    int empid;
    Employee()
    {
        System.out.println("Enter Employee id");
        Scanner sc = new Scanner(System.in);
        this.empid =sc.nextInt();
    }
    int getEmpId(){
        return empid;
    }
    public void login(SmartCard sc){
        int eid= sc.getEmp_idn(this);
        System.out.println("login Successful for employee "+ eid);
    }
}
public class AsociationDemo {
    public static void main(String[] args) {
        System.out.println("*** Association between employee and smart card***");
        Employee e=new Employee();
        System.out.println("new employee is created");
                SmartCard scd= new SmartCard();
                scd.MarkAttendence(e);
                e.login(scd);
                }
                }