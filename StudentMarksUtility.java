import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student
{
// Static Variable
static String collegeName = "GITAM University";

// Instance Variables
String name;
int rollNo;
int javaMarks;
int pythonMarks;
int dbmsMarks;

// Static Method
static void displayCollege()
{
System.out.println("\nCollege : " + collegeName);
}

void displayResult()
{
int total = javaMarks + pythonMarks + dbmsMarks;
double average = total / 3.0;

System.out.println("\n----------- STUDENT REPORT -----------");
System.out.println("Student Name : " + name);
System.out.println("Roll Number : " + rollNo);

System.out.println("Java Marks : " + javaMarks);
System.out.println("Python Marks : " + pythonMarks);
System.out.println("DBMS Marks : " + dbmsMarks);
System.out.println("Total Marks : " + total);
System.out.println("Average : " + average);

if(average >= 75)
System.out.println("Grade : A");
else if(average >= 60)
System.out.println("Grade : B");
else if(average >= 50)
System.out.println("Grade : C");
else
System.out.println("Grade : Fail");
}
}

public class StudentMarksUtility
{
public static void main(String[] args) throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Scanner sc = new Scanner(System.in);
Student s = new Student();
// BufferedReader Input
System.out.print("Enter Student Name : ");
s.name = br.readLine();

// Command-Line Argument
if(args.length > 0)
{
// String Parsing using Wrapper Class
s.rollNo = Integer.parseInt(args[0]);
}
else
{
System.out.println("Roll Number not passed through command-line.");
return;
}

// Scanner Input
System.out.print("Enter Java Marks : ");
s.javaMarks = sc.nextInt();

System.out.print("Enter Python Marks : ");
s.pythonMarks = sc.nextInt();

System.out.print("Enter DBMS Marks : ");
s.dbmsMarks = sc.nextInt();

// Wrapper Class
Integer totalMarks =
s.javaMarks + s.pythonMarks + s.dbmsMarks;

// Autoboxing
Integer boxedValue = s.javaMarks;

// Unboxing
int unboxedValue = boxedValue;

System.out.println("\nWrapper Class Total = " + totalMarks);
System.out.println("Autoboxed Value = " + boxedValue);
System.out.println("Unboxed Value = " + unboxedValue);

Student.displayCollege();

s.displayResult();

sc.close();
}
}
