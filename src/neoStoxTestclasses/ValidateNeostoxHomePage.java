package neoStoxTestclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxPOMclasses.NeoStoxLoginPage;
import NeoStoxPOMclasses.neoStoxHomePage;
import NeoStoxPOMclasses.neoStoxPasswordPage;
import neoStoxBase.baseClass;
import neoStoxUtility.Utility;

public class ValidateNeostoxHomePage extends baseClass
{
	NeoStoxLoginPage login;
	neoStoxPasswordPage password;
	neoStoxHomePage home;
	
	@BeforeClass
	
	public void launchNeoStox() throws InterruptedException
	{
		launchBrowser(); //from base class
		login=new NeoStoxLoginPage(driver);
		password=new neoStoxPasswordPage(driver);
		home=new neoStoxHomePage(driver);
	}
	@BeforeMethod
	
	public void loinToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendMobileNum(driver,Utility.readDataFromExcel(0, 0));
		
		login.clickOnSignInButton(driver);
		Utility.wait(driver,1000);
		
		password.enterPassword(driver,Utility.readDataFromExcel(0, 1));
		Thread.sleep(1000);
		
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		
		home.handlePopUpPage(driver);
	}
	
	@Test
	
	public void f()
	{
		
	}



}

