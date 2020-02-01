package com.test.pageObjects;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.sip.helper.CommonActions;
import com.sip.pageObjects.BasePage;
import com.sip.pageObjects.LoginPage;
import com.sip.pageObjects.QuartzSchedulerPage;

public class SampleXpaths {
	
	this.administrationTab = element(By.id('headers_nav_orgadmin'));
	this.metaTagsOverview = element(by.xpath("//div[contains(text(),'MetaTags')]"));
	this.groupsOverview = element(by.xpath("//div[contains(text(),'Groups')]"));
	this.openNewMetaTagModal = element(by.xpath("//span[@ng-click=\"metaTags.openNewTagModal()\"]"));
	this.openNewMetaGroupModal = element(by.xpath("//span[@ng-click=\"metaGroups.openNewGroupModal()\"]"));
	this.newTagName = element(By.id('newTagName'));
	this.newGroupName = element(By.id('newGroupName'));
	this.createButton = element(by.xpath("//button[@ng-click=\"create()\"]"));
	this.deleteConfirmButton = element(by.xpath("//button[@ng-click=\"delete()\"]"));
	this.removeConfirmButton = element(by.xpath("//button[@ng-click=\"remove()\"]"));
	this.signIn = element(By.className('btn btn-primary'));
	this.userMenu = element(by.xpath("//a[contains(@id,'user-menu')]/descendant::span[contains(@class,'fa fa-chevron-down')]"));
	this.logOut = element(by.xpath("//a[@ng-click=\"auth.logout()\"]"));
	by.xpath("//span[contains(text(),'"+metaGroupName+"')]/following::span[@class='panel-subtext ng-binding']"
	xpath("//span[contains(text(),'"+meteTagName+"')]/following::span[@ng-click=\"metaTags.openDeleteTagModal(tag)\"]")
	xpath("//li[contains(text(),'"+metaTagName+"')]/descendant::input[@ng-model='tag."+tagOption+"']")
	xpath("//li[contains(text(),'"+metaTagName+"')]/descendant::span[@class='fa fa-trash']")
	xpath("//div[contains(@class,'panel-heading')]/descendant::span[contains(text(),'"+userGroupName+"')]"))
	 this.submitButton = element(by.xpath("//button[@ng-click=\"delete()\"]"));
    this.breadCrumbDropArrow = element.all(by.xpath("//div[@class='ng-scope dropdown']")).get(1);
    this.permissions= element(by.xpath("//ul[contains(@class,'dropdown-menu uib-dropdown-menu bottom-left')]/descendant::span[contains(@class,'fa fa-key')]"));
    this.permGroupInput = element(By.id('permGroupInput'));
    this.addGroupButton = element(by.xpath("//button[@ng-click=\"addGroup()\"]"));
    this.clickReadLink = element(by.xpath("//div[@class='panel-default panel-permissions ng-isolate-scope']//a[@class='ng-binding'][contains(text(),'Read')]"));
    this.deletePermission = element(by.xpath("//div[@class='panel-collapse in collapse']//td[contains(text(),'Delete')]"));
    (//table[@border='1'])[1]//tr[3]//td[1][contains(text(),'DRC5')] 
    (//table[@border='1'])[1]//tr[2]//td[1][contains(text(),'DRC20')]
    //table[@valign='top']/descendant::td[2]/font 
    //table[@valign='top']/descendant::b[contains(text(),'Invoice No : ')] 
    //b[contains(text(),'BUYER:')]/following-sibling::br 
    //table[@border='0'][3]/*/*/td[4] 
    xpath("//div[contains(@class,'panel-heading')]/descendant::span[contains(text(),'"+userGroupName+"')]"))
    xpath("//a[contains(text(),'"+fileName+"')]/following::a[@data-toggle='dropdown']")
    this.fileOptionsDropdown = element.all(by.xpath("//tr[contains(@enable-split-view,'enableSplitView')]/descendant::span[contains(@class,'fa fa-chevron-down')]")).first();
    this.folderOptionDropdown = element.all(by.xpath("//tr[@ui-on-drop=\"$parent.dropAction($event, $data)\"]/descendant::span[contains(@class,'fa fa-chevron-down')]")).first();
    this.editMatatagValue= $("span[class^='fa fa-pencil-square-o']");
	this.createProjectOption = $("span[class='fa fa-ellipsis-v']");
	referenceName=driver.findElement(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr[@__gwt_row='"+i+"']/td[1]/div")).getText();
	
	public List<String> getAllMailboxScannerRoutines(){
		int rows=driver.findElements(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr")).size();
		List<String> MailboxScannerRoutineList= new ArrayList<String>();
		for(int i=0;i<rows;i++){
			String referenceName=null;
			referenceName=driver.findElement(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr[@__gwt_row='"+i+"']/td[1]/div")).getText();
			MailboxScannerRoutineList.add(referenceName);
		}
		
		return MailboxScannerRoutineList;
		}
					
	"//ul[@class='dropdown-menu']/*/*[contains(text(),'Mailbox Scanner')]"
	
	//Get all process definitions units name in list
		public List<String> getAllProcessDefinitionUnits(){
		int rows=driver.findElements(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr")).size();
		List<String> ProcessDefinitionList= new ArrayList<String>();
		for(int i=1;i<=rows;i++){
		String referenceName=null;
		String rowNumber=null;
		//rowNumber=driver.findElement(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr[1]/@__gwt_row")).getText();
		//referenceName=driver.findElement(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr[@__gwt_row='"+i+"']/td[1]/div")).getText();
		referenceName=driver.findElement(By.xpath("//table[@class='table-striped table-bordered']/tbody/tr["+i+"]/td[1]/div")).getText();
		ProcessDefinitionList.add(referenceName);
		}
			 return ProcessDefinitionList;
		}
		
		
		/* Test Case Id - BPMMT10012 */
		@Parameters({ "username", "password","OUDisplayName", "OUId" })
		@Test
		public void checkQuartzSchedulerRoutinesAccess(String username, String password, String OUDisplayName, String OUId) throws Exception{
			try{
				String sRoutineName=null;
				logger= report.startTest("checkQuartzSchedulerRoutinesAccess");
				loginPage = PageFactory.initElements(driver, LoginPage.class);
				loginPage.LogIn_Action(username,password);
				logger.log(LogStatus.INFO, "Login Details Entered");
				basePage = PageFactory.initElements(driver, BasePage.class);
				logger.log(LogStatus.INFO, "Select Org Unit from the dropdown");
				basePage.selectOrgUnit(OUDisplayName);
				Thread.sleep(3000);
				logger.log(LogStatus.INFO, "Click Routines");
				basePage.RoutinesClick();
				quartzSchedulerPage=PageFactory.initElements(driver, QuartzSchedulerPage.class);
				logger.log(LogStatus.INFO, "Click Quartz Scheduler Routines");
				quartzSchedulerPage.QuartzSchedulerRoutineClick();
				Thread.sleep(3000);
				logger.log(LogStatus.INFO, "Get all Quartz scheduler routines in list");
				List<String>QuartzSchedulerRoutineList= new ArrayList<String>();
				QuartzSchedulerRoutineList=quartzSchedulerPage.getAllQuartzSchedulerRoutines();
				logger.log(LogStatus.INFO, "Get all Quartz Scheduler routines from DB");
				commonActions=PageFactory.initElements(driver, CommonActions.class);
				ResultSet rs=commonActions.GetDBResultSet("select reference from quartz_scheduler_entry where organizationalUnit='"+OUId+"' and isDelete='F';","jbpm");
				List<String> QuartzSchedulerRoutineListDB= new ArrayList<String>();
				while (rs.next()) {
					  sRoutineName= rs.getString(1);
					  sRoutineName=sRoutineName.trim();
					  QuartzSchedulerRoutineListDB.add(sRoutineName);
					 }
				Set<Object> set1 = new HashSet<Object>();
				set1.addAll(QuartzSchedulerRoutineListDB);
				Set<Object> set2 = new HashSet<Object>();
				set2.addAll(QuartzSchedulerRoutineList);
				boolean result=set1.equals(set2);
				Assert.assertEquals(true,result);
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw new Exception(e.getMessage());
			}
		}
}
