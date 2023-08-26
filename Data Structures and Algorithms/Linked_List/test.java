import java.util.*;
public class test
{
public static void main(String args[])
{
int n,i;
Scanner pc=new Scanner(System.in);
employee.CEO="Ratan Tata";
employee[] one =new employee[20];
System.out.println("Enter number of employees :-");
n=pc.nextInt();
for(i=1;i<=n;i++)
{
one[i]=new employee();
System.out.println("Enter Employee "+i+" details");
one[i].getdata();
one[i].getsalary();
}
for(i=1;i<=n;i++)
{
System.out.println("Employee "+i+" details");
one[i].putData();
one[i].putsalary();
one[i].cal();
}
}
}
class employee
{
 String id,empid;
 String Fname;
 String Lname;
 double salary;
 static String CEO;
 Scanner sc=new Scanner(System.in);
 public employee()
 {
 id="20210110";
 
 }
 public void getdata()
 {
 System.out.println("Enter First name of an employee :- ");
 Fname=sc.next();
 System.out.println("Enter Last name of an employee :- ");
 Lname=sc.next();
 System.out.println("Enter id of an employee :- ");
 empid=sc.next();
 }
 public void getsalary()
 {
 System.out.println("Enter Salary :- ");
 salary=sc.nextDouble();
 }
 public void putData()
 {
 System.out.println("First name of an employee :- "+Fname);
 System.out.println("Last name of an employee :- "+Lname);
 System.out.println("ID of an employee :- "+id+empid);
 }
 public void putsalary()
 {
 if(salary<0)
 {
 System.out.println("Enter valid salary");
 }
 else
 {
 System.out.println("Salary :- "+salary);
 }
 }
 public void cal()
 {
 double hike;
 hike=salary*0.10;
 salary=(12*salary)+hike;
 System.out.println("After yearly salary 10% hike in the salary the Salary is :- "+salary);
 }
}

