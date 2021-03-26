<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Vacation Updating Portal </title>


</head>
<body>
    <fields>
        <h2>Update WorkDays</h2>
        <form name="SaveWorkDayModel" action="updateWorkDays" method="post">
            Employment Id: <input type="text" name="empId" /><br/>
            Employee Type : <Select name="empType">
                          <option value="Hourly">Hourly</option>
                          <option value="Salaried">Salaried</option>
                          <option value="Manager">Manager</option>
                        </select><br/>

            WorkDays: <input type="text" name="workDays" /><br/>
          <input type="submit" value="Save" />
        </form>
    </fields>
    <br/><br/>
    <fields>
        <h2>Update Vacation Days</h2>
        <form name="UpdateVacationDaysModel" action="updateVacationDays" method="post">
            Employment Id: <input type="text" name="empId" /><br/>
            Employee Type : <Select name="empType">
                          <option value="Hourly">Hourly</option>
                          <option value="Salaried">Salaried</option>
                          <option value="Manager">Manager</option>
                        </select><br/>

            VacationDays: <input type="text" name="vacationDays" /><br/>

            <input type="submit" value="Update" />
        </form>
    </fields>

    <table class="hourlyTable">
        <h3>Hourly Employees</h3>
        <tr>
            <th>Employee ID </th>
            <th>Employee Name</th>
            <th>Available Vacation Days</th>
        </tr>
        <#list hourlyEmployeeList as hourlyEmp>
            <tr>
                <td>${hourlyEmp.empId}</td>
                <td>${hourlyEmp.empName}</td>
                <td>${hourlyEmp.curVacationDays}</td>
            </tr>
        </#list>
    </table>
     <table class="salariedTable">
     <h3>Salaried Employees</h3>
        <tr>
            <th>Employee ID </th>
            <th>Employee Name</th>
            <th>Available Vacation Days</th>
        </tr>
        <#list salariedEmployeeList as salariedEmp>
            <tr>
                <td>${salariedEmp.empId}</td>
                <td>${salariedEmp.empName}</td>
                <td>${salariedEmp.curVacationDays}</td>
            </tr>
        </#list>
     </table>
          <table class="mangerTable">
          <h3>Managers </h3>
             <tr>
                 <th>Employee ID </th>
                 <th>Employee Name</th>
                 <th>Available Vacation Days</th>
             </tr>
             <#list managersList as manager>
                 <tr>
                     <td>${manager.empId}</td>
                     <td>${manager.empName}</td>
                     <td>${manager.curVacationDays}</td>
                 </tr>
             </#list>
          </table>


</body>


</html>