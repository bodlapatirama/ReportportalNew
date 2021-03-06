package project.features;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import project.utilities.ExcelUtils;
import project.utilities.GenericUtils;
import project.utilities.ProjectVariables;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( plugin = {"pretty", "html:target/cucumber-html-report"},
features="Features",tags="@QATC07", monochrome = true )

public class LocalTestRunner {
	@BeforeClass
    public static void killExcel() throws Exception{   
		
          /* Runtime.getRuntime().exec("taskkill /F /IM EXCEL.EXE");
           String sDirectory = System.getProperty("user.dir");
           String sDriverPath = sDirectory+"\\src\\test\\resources\\Data";
           String sExcelPath = sDirectory+"\\src\\test\\resources\\Data\\Mail.xlsm";
           ExcelUtils.SetPath(7, 2, sDriverPath, sExcelPath);  */ 
    }

	
	@AfterClass
    public static void fn_SendMail() throws IOException{
       //String sDirectory = System.getProperty("user.dir");
       //String sDriverPath = sDirectory+"\\src\\test\\resources\\Data";
             //String sExcelPath = sDirectory+"\\src\\test\\resources\\Data\\Mail.xlsm";
       //Runtime.getRuntime().exec(new String[] { "wscript.exe", sDriverPath+"\\Trigger.vbs",sExcelPath});     
    }
}
