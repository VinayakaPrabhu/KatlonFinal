<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Admin login       															
add taskgroup and role.: 													
		name :code description : tvin        
		tasks :all - role-create												
		role :def  amd tgroup871  verify 2 and 32							
add existing taskgroup and role should fail									
edit taskgroup roles.														
		role :tgroup 871  verify 2 and 33
add role																	
		name :code description : rvin	
		task	tvinn and a  verify 2
add existing role and role should fail										
edit role	
		task tvinn verify 1		
Add employee  : id : 1000 , loginname :temployee email : t@email.com  name : testing 						
	access : everything except rvinn 																		NO  
Add existing employee should fail											
edit employee  																
	name      :     test
	access    :     rvinn	
employee login															
	change password  : Zxc@123
admin login
inactive employee  :  temployee												
inactive employee login 										
wrong admin login should fail												
admin login																
activate employee															
reset password and login: Abc@123
delete role before employee should give error		  						
delete employee															
delete taskgroup : tvinn  verify not possible message						
delete role : rvinn verify message											
delete taskgroup : tvinn verify  message</description>
   <name>employee testsuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>5</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>00e9bd51-7e6e-47d3-b9cb-aa58643479e1</testSuiteGuid>
   <testCaseLink>
      <guid>aa2cc5bb-9400-4c61-bef0-993012f73d23</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/AdminLogin_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>18fbbdc0-80a9-4e36-95ab-ad8faf9f113a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Task Group/Add/Add_Role_new_ShoudlSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>145c86cf-baad-4f8d-ab67-34d3d21c1652</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Task Group/Add/Add_Role_existing_ShouldgiveErrorMessage</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>27570562-776b-465e-8903-fa05f3518cb0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Task Group/Edit/Edit_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>91432e5b-9e64-4610-8c6b-6a191b823cb6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Roles/Add/Add_Role_new_ShoudlSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>1e294730-1040-4c0e-b859-0156939642e8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Roles/Add/Add_Role_existing_ShouldgiveErrorMessage</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9eee44cb-af39-4b4c-8e63-a57cad3a33a6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Roles/Edit/Edit_Role_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>5306bf18-ab75-4cd3-8897-e542e6269817</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Add Employee/Add_new_Employee_ShouldgiveSuceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>19858fc4-31d5-4b11-b3c2-c448b97cadfc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Add Employee/Add_existing_Employee_ShoudlgiveErrorMessage1</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>b8bd58eb-a201-4d54-bb1b-7648e591ef43</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Edit/Edit_Employee_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e674c011-7559-46ed-a089-d6e72699dbd7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Employee_first_time_Login_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a3175d9c-356d-4082-be32-bd55762bbcd3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Inactive_Employee/Inactivate_an_Employee_Shouldgivesucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>a4068b5a-c798-44d3-bcce-9aed590ae726</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Employee_Inactive_Login_ShouldGiveErrorMessage</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>8f594279-7074-4bd5-9c62-a9e17ab03b8f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Wrong_username_Should_giveEror</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>44a70e3b-3ed6-475e-a0db-85382568b186</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/Wrong_Password_ShouldgiveError</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c12cd417-caa4-4a9b-b017-9d930bba3456</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Active_an_InActive_employee/active_an_Inactive_employee_Shouldsucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>166e60b6-1e09-4c64-9654-60573ee33e30</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Reset_Password_Of_Employee/ResetPassword_and_Login_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>d0c05414-0245-4733-9753-71390bd936db</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Roles/Delete/Delete_Roles_before_employee_Shouldgiveerror</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>7452afc9-c984-4482-a602-6eb106338955</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee/Delete/Delete_Employee_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>1936b647-9ed9-4e25-ab1c-6dc4c06d437e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Task Group/Delete/Delete_RoleActive_ShouldFail</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>dc698c1a-7215-4229-b4d2-42dbcf8ee1fc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Roles/Delete/Delete_Roles_ShouldSucceed</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>34c15641-c226-4237-9c5e-f32c9fda760d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Employee/Employee_Role_And_Task/Task Group/Delete/Delete_RoleInactive_ShouldSucceed</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
