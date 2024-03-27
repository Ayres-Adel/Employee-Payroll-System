Employee Salary Management System
Description
The Employee Salary Management System is a Java program designed to handle different types of employees in a company and calculate their salaries. There are three categories of employees:

EmployFixed: Receives a fixed salary known at the time of employee creation.

Monthly Salary Calculation: monthly_salary = salary.
EmployeCommission: Receives a base salary plus a percentage linked to sales.

Monthly Salary Calculation: monthly_salary = base_salary + sales * percentage.
HourlyEmployee: Receives pay based on the number of hours worked.

Monthly Salary Calculation: monthly_salary = hourly_rate * number_hours.
The main objectives of this program are:

Implement a superclass Employee to facilitate polymorphic processing of employees.
Implement subclasses corresponding to each employee category.
Develop a class Business with an average() method that calculates the average salary of all employees.
Write a test class to validate the functionality of the implemented classes.
Usage
Clone or download the Java source files.
Compile the files using a Java compiler.
Run the test class to ensure the correct implementation of the classes.
Structure
Employee.java: Superclass for all employee types.
FixedEmployee.java: Subclass for fixed-salary employees.
CommissionEmployee.java: Subclass for commission-based employees.
HourlyEmployee.java: Subclass for hourly employees.
Business.java: Class containing the average() method to calculate the average salary.
Test.java: Test class to validate the functionality of the implemented classes.
