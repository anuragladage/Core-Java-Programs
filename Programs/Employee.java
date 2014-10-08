class Employee
{
    int empno;
    String name,deptcode,designation;
    float salary;
    public Employee()
    {
        empno =0;
        salary = 0.0f;
        name = "";
        deptcode = "";
        designation = "";
    }
    
    public Employee(int empno,String name,String deptcode,String designation,float salary)
    {
        this.empno = empno;
        this.name = name;
        this.deptcode = deptcode;
        this.designation = designation;
        this.salary = salary;
    }
    
    public void setEmpno(int empno)
    {
        this.empno = empno;
    }
    
    public int getEmpno()
    {
        return empno;
    }
    
    public void setName(String name)
    {
        this.name = name
    }
    
    public string getName()
    {
        return name;
    }
    
    public void setDeptcode(String deptcode)
    {
        this.deptcode = deptcode;
    }
    
    public String getDeptcode()
    {
        return deptcode;
    }
    
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    
    public String getDesignation
    {
        return designation;
    }
    
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    
    public floar getSalary()
    {
        return salary;
    }

    public boolean equals(Object obj)
    {
        if(obj!=null)
        {
            return false;
        }
        if(obj instanceof Employee)
        {
            if(empno == ((Employee)obj).empno)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    public int hashCode(Object obj)
    {
        return deptcode.toLowercase().hashCode();                   //Using the hashCode() overridden by the string class.
    }
    
    public String toString()
    {
        System.out.println("Employee no: " + empno + " Name: " + name +" Department Code: " + deptcode + " Employee Designation: " + designation=".");
    }

    public int compareTo(Object obj)
    {
        if(obj == null)
        {
            return -1;
        }
        if(
    }
}