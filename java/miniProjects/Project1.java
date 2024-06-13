package miniProjects;

public class Project1 {
    static String[][] employees = {
        {"EmpNO", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"},
        {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
        {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
        {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
        {"1004", "Chahat", "11/12/2008", "r", "FD", "12000", "6000", "2000"},
        {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
        {"1006", "Suman", "1/1/2000", "e", "Mafac", "23000", "9000", "4400"},
        {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };

    static String[][] designations = {
        {"DesignationCode", "Designation", "DA"},
        {"e", "Engineer", "20000"},
        {"c", "Consultant", "32000"},
        {"k", "Clerk", "12000"},
        {"r", "Receptionist", "15000"},
        {"m", "Manager", "40000"},
    };

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one employee number as a command line argument.");
            return;
        }

        String empNo = args[0];
        String[] employee = getEmployeeByEmpNo(empNo);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        String[] designation = getDesignationByCode(employee[3]);
        if (designation == null) {
            System.out.println("Designation not found.");
            return;
        }

        int basic = Integer.parseInt(employee[5]);
        int hra = Integer.parseInt(employee[6]);
        int it = Integer.parseInt(employee[7]);
        int da = Integer.parseInt(designation[2]);
        int salary = basic + hra + it - da;

        System.out.println("EmpNo: " + employee[0]);
        System.out.println("EmpName: " + employee[1]);
        System.out.println("Designation: " + designation[1]);
        System.out.println("Salary: " + salary);
    }

    private static String[] getEmployeeByEmpNo(String empNo) {
        for (int i = 1; i < employees.length; i++) {
            if (employees[i][0].equals(empNo)) {
                return employees[i];
            }
        }
        return null;
    }

    private static String[] getDesignationByCode(String code) {
        for (int i = 1; i < designations.length; i++) {
            if (designations[i][0].equals(code)) {
                return designations[i];
            }
        }
        return null;
    }
}
